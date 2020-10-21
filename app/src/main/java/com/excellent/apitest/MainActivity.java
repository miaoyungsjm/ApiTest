package com.excellent.apitest;

import android.os.Bundle;
import android.util.Log;

import com.excellent.apitest.db.RoomManager;
import com.excellent.apitest.db.database.TMDatabase;
import com.excellent.apitest.db.entity.Tv;
import com.kunminx.architecture.ui.page.DataBindingActivity;
import com.kunminx.architecture.ui.page.DataBindingConfig;

import java.util.List;

import androidx.lifecycle.Observer;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MainActivity extends DataBindingActivity {
    private final String TAG = getClass().getSimpleName();

    private MainActivityViewModel mMainActivityViewModel;


    @Override
    protected void initViewModel() {
        mMainActivityViewModel = getActivityViewModel(MainActivityViewModel.class);
    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.activity_main, BR.vm, mMainActivityViewModel);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate()");

        mMainActivityViewModel.getPopularTv();

        mMainActivityViewModel.popTvList.observe(this, new Observer<List<Tv>>() {
            @Override
            public void onChanged(List<Tv> tvs) {
                // todo 刷新UI
                Log.e(TAG, "onChanged()");
            }
        });
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy()");
        super.onDestroy();
    }
}