package com.example.dagger2test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by steven on 2018/5/31.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    UserComponent plus(UserModule userModule);


}

