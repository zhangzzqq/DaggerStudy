package com.example.dagger2test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by steven on 2018/5/31.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {

}





