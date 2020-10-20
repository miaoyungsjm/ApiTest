package com.excellent.apitest;

import android.app.Application;

import com.excellent.apitest.network.RetrofitManager;

/**
 * @author ggz
 * @date 2020/10/19
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RetrofitManager.getInstance().init();
    }
}
