package com.zxl.utils.LifeCycle.util;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.zxl.utils.ToastUtils;

/*
* 监听前后台切换
* Application 中添加 ProcessLifecycleOwner.get().getLifecycle().addObserver(new ForeBackManager());
**/
public class ForeBackManager implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onForeground() {
        ToastUtils.showToast("应用进入前台");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onBackground() {
        ToastUtils.showToast("应用进入后台");
    }
}
