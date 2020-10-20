package com.excellent.apitest;

import android.os.Bundle;
import android.util.Log;

import com.kunminx.architecture.ui.page.DataBindingActivity;
import com.kunminx.architecture.ui.page.DataBindingConfig;

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
        Log.d(TAG, "onCreate()");
        mMainActivityViewModel.getPopularTv();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy()");
        super.onDestroy();
    }
}