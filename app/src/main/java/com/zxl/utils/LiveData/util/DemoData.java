package com.zxl.utils.LiveData.util;

import android.arch.lifecycle.LiveData;

/**
 * 首先LiveData其实与数据实体类(POJO类)是一样的东西,它负责暂存数据.
 * 具体字段改变可以进行通知
 * notice 1 只要继承LiveData并且在泛型里写下你的实体类,
 * notice 唯一需要注意的,setValue() 此方法只能在主线程  子线程里调用postValue(this);用于回调数据更新的方法
 * notice 2 observer()  observerbleForever()后挂掉也会通知
 */
public class DemoData extends LiveData<DemoData> {
    private int tag1;
    private int tag2;

    public int getTag1() {
        return tag1;

    }
    public void setTag1(int tag1) {
        this.tag1 = tag1;
        postValue(this);
    }

    public int getTag2() {
        return tag2;
    }

    public void setTag2(int tag2) {
        this.tag2 = tag2;
        postValue(this);
    }
}
