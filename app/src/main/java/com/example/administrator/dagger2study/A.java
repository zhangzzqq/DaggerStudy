package com.example.administrator.dagger2study;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by steven on 2018/5/29.
 */
public class A {

    protected String field;

    @Inject
    public A() {

    }

    public void doSomething() {

        Log.e("A", "do something");
    }


}

