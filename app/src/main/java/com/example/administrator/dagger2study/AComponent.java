package com.example.administrator.dagger2study;

import dagger.Component;

/**
 * Created by steven on 2018/5/29.
 */
//component类 引用module为AModule.class
@Component(modules = {AModule.class,BModule.class})
public interface AComponent {

//  A a();//对应的是构造方法

    void inject(MainActivity mainActivity);

}
