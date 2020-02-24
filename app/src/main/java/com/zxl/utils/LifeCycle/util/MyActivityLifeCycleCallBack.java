package com.zxl.utils.LifeCycle.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public class MyActivityLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {
    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        MyActivityManager.getInstance().pushOneActivity(activity);
        Log.i("****+",activity.getClass().getName());
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.i("****-",activity.getClass().getName());
        MyActivityManager.getInstance().popOneActivity(activity);
    }
}
