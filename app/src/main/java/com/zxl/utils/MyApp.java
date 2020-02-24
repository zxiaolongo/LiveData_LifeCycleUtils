package com.zxl.utils;

import android.app.Application;
import android.arch.lifecycle.ProcessLifecycleOwner;
import android.content.Context;

import com.zxl.utils.LifeCycle.util.ForeBackManager;
import com.zxl.utils.LifeCycle.util.MyActivityLifeCycleCallBack;

public class MyApp extends Application {
    public static MyApp instance ;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        //监听前后台切换
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ForeBackManager());
        //管理所有的Activity
        registerActivityLifecycleCallbacks(new MyActivityLifeCycleCallBack());
    }
}
