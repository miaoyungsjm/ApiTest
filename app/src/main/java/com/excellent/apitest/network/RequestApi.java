package com.excellent.apitest.network;

import com.excellent.apitest.bean.response.PopularTv;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author ggz
 * @date 2020/10/19
 */
public class RequestApi {
    // todo 加密隐藏
    private final String KEY = "1dd1834a037b3355b06d80ea235bf021";

    public Observable<PopularTv> queryPopularTv(int page) {
        return RetrofitManager.getInstance().getRetrofit()
                .create(ApiService.class)
                .queryPopularTv(KEY, page)
                // 指定上游发送事件线程
                .subscribeOn(Schedulers.computation())
                // 指定下游接收事件线程
                .observeOn(AndroidSchedulers.mainThread());
    }


}