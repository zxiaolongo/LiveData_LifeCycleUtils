package com.zxl.utils.LiveData.util;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zxl.utils.R;

public class FragmentActivity extends AppCompatActivity {

    private Fragment fragment1;
    private Fragment fragment2;
    private Fragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        fragment1 = new ShareFragment();
        fragment2 = new Share2Fragment();
        fragment3 = new Share2Fragment();
    }
    public void click1(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment1).commit();
    }
    public void click2(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment2).commit();
    }
    public void click3(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment3).commit();
    }
}
