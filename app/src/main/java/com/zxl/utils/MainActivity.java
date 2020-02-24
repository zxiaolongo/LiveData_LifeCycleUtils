package com.zxl.utils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zxl.utils.LifeCycle.util.LocationActivity;
import com.zxl.utils.LiveData.util.DemoActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void lifeCycle(View view){
        startActivity(new Intent(this,LocationActivity.class));
    }
    public void liveData(View view){
        startActivity(new Intent(this,DemoActivity.class));
    }
}
