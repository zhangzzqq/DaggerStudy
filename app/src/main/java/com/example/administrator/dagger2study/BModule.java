package com.example.administrator.dagger2study;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by steven on 2018/5/29.
 */

@Module
public class BModule {

    @Provides
    public BModule provideGson(){
        return new BModule();
    }



}
