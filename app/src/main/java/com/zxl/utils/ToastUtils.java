package com.zxl.utils;

import android.widget.Toast;

public class ToastUtils {
    public static void showToast(String content){
        Toast.makeText(MyApp.instance,content,Toast.LENGTH_SHORT).show();
    }
}
