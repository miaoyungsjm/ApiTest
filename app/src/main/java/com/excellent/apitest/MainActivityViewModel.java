package com.excellent.apitest;

import android.util.Log;

import com.excellent.apitest.db.RoomManager;
import com.excellent.apitest.db.database.TMDatabase;
import com.excellent.apitest.db.entity.Tv;
import com.excellent.apitest.network.ApiObserver;
import com.excellent.apitest.network.RequestApi;
import com.excellent.apitest.network.response.PopularTv;

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
                Log.e(TAG, "onSuccess: page: " + popularTv.getPage());
                // 存数据库
                TMDatabase db = RoomManager.getInstance().getTMDatabase();
                db.getTvDao().insertTvs(popularTv.getResults());
                // 检查内容
                List<Tv> list = db.getTvDao().getAllTv();
                for (int i = 0; i < list.size(); i++) {
                    Log.d(TAG, "onSuccess: id: " + list.get(i).getId());
                }
                // 切换主线程刷新UI
                popTvList.postValue(popularTv.getResults());
            }

            @Override
            public void onError(int errorCode, String message) {
                Log.e(TAG, "onError: ");
                // todo UI弹窗提示
                showDialog.postValue(message);
            }
        };
        mCompositeDisposable.add(observer);
        Observable<PopularTv> observable = new RequestApi().queryPopularTv(2);
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
