package com.zxl.utils.LiveData.util;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

/**
 *
 */
public class MutiDemoViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> myString = new MutableLiveData<>();

    public MutableLiveData<String> getMyString(){
        return myString;
    }

    public void setMianString(String string) {
        this.myString.setValue(string);
    }

    public void setSubString(String string){
        this.myString.postValue(string);
    }
}
