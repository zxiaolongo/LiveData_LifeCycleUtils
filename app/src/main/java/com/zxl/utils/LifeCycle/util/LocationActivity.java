package com.zxl.utils.LifeCycle.util;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zxl.utils.R;

public class LocationActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        //你使用新版本的AppcompatActivity（>26.1.0）
        getLifecycle().addObserver(new LocationUtil());
        //否则你需要自实现LifecycleOwner接口，并在Activity生命周期函数中分发事件
        //LocationOldActivity
    }
}
