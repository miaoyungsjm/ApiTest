package com.excellent.apitest;

import android.app.Application;

import com.excellent.apitest.db.RoomManager;
import com.excellent.apitest.network.ApiManager;

/**
 * @author ggz
 * @date 2020/10/19
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ApiManager.getInstance().init();
        RoomManager.getInstance().init(this);
    }

}
