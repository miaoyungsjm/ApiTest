package com.excellent.apitest;

import android.util.Log;

import com.excellent.apitest.network.ApiObserver;
import com.excellent.apitest.network.RequestApi;
import com.excellent.apitest.bean.Tv;
import com.excellent.apitest.bean.response.PopularTv;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

/**
 * @author ggz
 * @date 2020/10/20
 */
public class MainActivityViewModel extends ViewModel {
    private final String TAG = getClass().getSimpleName();

    private CompositeDisposable mCompositeDisposable;

    public final MutableLiveData<String> showDialog = new MutableLiveData<>();
    public final MutableLiveData<List<Tv>> popTvList = new MutableLiveData<>();

    public MainActivityViewModel() {
        mCompositeDisposable = new CompositeDisposable();
    }

    public void getPopularMovie() {
        // todo 查数据库
        // todo 网络请求
    }

    public void getPopularTv() {
        // todo 查数据库

        // 网络请求
        requestPopularTv();
    }

    private void requestPopularTv() {
        ApiObserver<PopularTv> observer = new ApiObserver<PopularTv>() {
            @Override
            public void onSuccess(PopularTv popularTv) {
                Log.e(TAG, "onSuccess: " + popularTv.getPage());
                // todo 存数据库
                // 数据拼接和转换
                List<Tv> list = new ArrayList<>();
                for (int j = 0; j < popularTv.getResults().size(); j++) {
                    PopularTv.Results tmp = popularTv.getResults().get(j);
                    Tv item = new Tv();
                    list.add(item);
                }
                // todo 刷新UI
                popTvList.setValue(list);
            }

            @Override
            public void onError(int errorCode, String message) {
                Log.e(TAG, "onError: ");
                // todo UI弹窗提示
                showDialog.setValue(message);
            }
        };
        mCompositeDisposable.add(observer);
        Observable<PopularTv> observable = new RequestApi().queryPopularTv(1);
        observable.subscribe(observer);
    }

    @Override
    protected void onCleared() {
        Log.d(TAG, "onCleared()");
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
        }
        super.onCleared();
    }
}
