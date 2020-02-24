package com.zxl.utils.LifeCycle;

import android.arch.lifecycle.ProcessLifecycleOwner;

import com.zxl.utils.LifeCycle.util.ForeBackManager;
import com.zxl.utils.LifeCycle.util.MyActivityLifeCycleCallBack;

//1 监听应用前后台切换(需要添加依赖)2选1
//xupport
// api 'android.arch.lifecycle:extensions:1.1.1'
//    api 'android.arch.lifecycle:runtime:1.1.1'
//androidx
////    def lifecycle_version = '2.0.0-beta01'
////    implementation "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
public class note {
    // 第一次出现还是在 Support 库年代的 26.1.0 版本
    /*@1
     *监听应用前后台切换   location(MyApp)
     *ProcessLifecycleOwner.get().getLifecycle().addObserver(new ForeBackManager());
     * **/

    /*@2
     *全局管理 Activity      location(MyApp)
     * registerActivityLifecycleCallbacks(new MyActivityLifeCycleCallBack());
     * **/

    /*@3  自动处理生命周期的 Handler（自己加的）
     * LifecycleHandler
     * **/
}
