package com.zxl.utils.LiveData.util;

import android.arch.lifecycle.ViewModel;
//mDemoViewModel = ViewModelProviders.of(this).get(DemoViewModel.class);
//this 相同得到的是同一个ViewModel  不同得到的是新的
public class DemoViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private DemoData mDemoData = new DemoData();

    public DemoData getDemoData() {
        if(mDemoData == null){
            mDemoData = new DemoData();
        }
        return mDemoData;
    }
}
