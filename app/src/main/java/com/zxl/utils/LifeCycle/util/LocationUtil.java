package com.zxl.utils.LifeCycle.util;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.zxl.utils.ToastUtils;

public class LocationUtil implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void startLocation() {
        ToastUtils.showToast("start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void stopLocation() {
        ToastUtils.showToast("stop");
    }
}
