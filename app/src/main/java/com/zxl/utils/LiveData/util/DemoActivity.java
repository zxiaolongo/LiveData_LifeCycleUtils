package com.zxl.utils.LiveData.util;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.zxl.utils.R;
import com.zxl.utils.ToastUtils;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class DemoActivity extends AppCompatActivity {

    private DemoViewModel mDemoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        EventBus.getDefault().register(this);
        mDemoViewModel = ViewModelProviders.of(this).get(DemoViewModel.class);//获取ViewModel,让ViewModel与此activity绑定
        mDemoViewModel.getDemoData().observe(this, new Observer<DemoData>() { //注册观察者,观察数据的变化
            @Override
            public void onChanged(DemoData demoData) {
                ToastUtils.showToast("数据有更新"+demoData.getTag1());
            }
        });
    }
    public void add(View view){
        mDemoViewModel.getDemoData().setTag1(mDemoViewModel.getDemoData().getTag1()+1); //这里手动用按键点击更新数据
    }
    public void toDemo2(View view){
        startActivity(new Intent(this,FragmentActivity.class));
    }

}
