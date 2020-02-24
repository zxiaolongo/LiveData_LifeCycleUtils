package com.zxl.utils.LiveData;

/**
 *
 */
public class note {

    /*@1
     *LiveData   location(DemoData)
     *setValue(this)  postValue(this);用于回调数据更新的方法
     * observer()  observerbleForever()后挂掉也会通知
     * **/

    /*@2
     *ViewModel     location(DemoViewModel)
     *notice 同一个对象获取的是同一个ViewModel   通过getActivity可以进行fragment间数据共享
     * ViewModelProviders.of(getActivity()).get(DemoViewModel.class);
     * **/

    /*@3
     * MutableLiveData  location(MutiDemoViewModel)
     *
     * */



}
