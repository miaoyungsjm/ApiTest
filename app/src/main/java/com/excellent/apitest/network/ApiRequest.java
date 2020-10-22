package com.excellent.apitest.network;

import com.excellent.apitest.network.response.PopularTv;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * @author ggz
 * @date 2020/10/21
 */
public class ApiRequest {

    private static final String KEY = "1dd1834a037b3355b06d80ea235bf021";

    public Observable<PopularTv> queryPopularTv(int page) {
        return ApiManager.getInstance().getApiService()
                .queryPopularTv(KEY, page)
                .subscribeOn(Schedulers.io());
//                // 指定上游发送事件线程
//                .subscribeOn(Schedulers.computation())
//                // 指定下游接收事件线程
//                .observeOn(AndroidSchedulers.mainThread());
//                .observeOn(Schedulers.io());
    }
}
