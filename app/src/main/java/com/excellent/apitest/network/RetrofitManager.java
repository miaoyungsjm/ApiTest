package com.excellent.apitest.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.excellent.apitest.network.ApiService.BASE_URL;

/**
 * @author ggz
 * @date 2020/10/19
 */
public class RetrofitManager {

    private static RetrofitManager sInstance;
    private Retrofit mRetrofit;

    private RetrofitManager() {
    }

    public static RetrofitManager getInstance() {
        if (null == sInstance) {
            synchronized (RetrofitManager.class) {
                if (null == sInstance) {
                    sInstance = new RetrofitManager();
                }
            }
        }
        return sInstance;
    }

    public void init() {
        if (mRetrofit == null) {
            //初始化一个OkHttpClient
            OkHttpClient.Builder builder = new OkHttpClient.Builder()
                    .connectTimeout(10000, TimeUnit.MILLISECONDS)
                    .readTimeout(10000, TimeUnit.MILLISECONDS)
                    .writeTimeout(10000, TimeUnit.MILLISECONDS);
            OkHttpClient okHttpClient = builder.build();

            //使用该OkHttpClient创建一个Retrofit对象
            mRetrofit = new Retrofit.Builder()
                    //添加Gson数据格式转换器支持
                    .addConverterFactory(GsonConverterFactory.create())
                    //添加RxJava语言支持
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    //指定网络请求client
                    .client(okHttpClient)
                    .baseUrl(BASE_URL)
                    .build();
        }
    }

    public Retrofit getRetrofit() {
        if (mRetrofit == null) {
            throw new IllegalStateException("Retrofit instance hasn't init!");
        }
        return mRetrofit;
    }
}
