package com.zxl.utils.LiveData;


public class ApiNote {
    /**
     *
     API全解
     postValue()
     　　可能你已经在上面看到几次调用此方法了。postValue的特性如下：

     　　1.此方法可以在其他线程中调用

     　　2.如果在主线程执行发布的任务之前多次调用此方法，则仅将分配最后一个值。

     　　3.notice 如果同时调用 .postValue(“a”)和.setValue(“b”)，一定是值b被值a覆盖。

     setValue()
     　　setValue()的特性如下：

     　　1.此方法只能在主线程里调用

     getValue()
     　　返回当前值。notice 注意，在后台线程上调用此方法并不能保证将接收到最新的值。

     removeObserver(@NonNull final Observer<? super T> observer)
     　　移除指定的观察者

     notice　移除当前Activity或者Fragment的全部观察者

     mMainViewModel.getContent().removeObservers(this);
     hasActiveObservers()
     　　如果此LiveData具有活动（Activity或者Fragment在前台,当前屏幕显示）的观察者，则返回true。其实如果这个数据的观察者在最前台就返回true，否则false。

     hasObservers()
     　　如果此LiveData具有观察者，则返回true。



     observe(@NonNull LifecycleOwner owner, @NonNull Observer<? super T> observer)
     　　设置此LiveData数据当前activity或者Fragment的观察者，会给此activity或者Fragment在前台时回调数据。



     observeForever(@NonNull Observer<? super T> observer)
     　　1.设置永远观察者，永远不会被自动删除。您需要手动调用removeObserver（Observer）以停止观察此LiveData，

     　　2.设置后此LiveData，一直处于活动状态，不管是否在前台哪里都会获得回调。

     */

}
