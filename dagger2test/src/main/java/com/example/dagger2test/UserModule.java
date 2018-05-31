package com.example.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by steven on 2018/5/31.
 */

@Module
public class UserModule {
    private User user;

    public UserModule(User user) {
        this.user = user;
    }

    @Provides
    @UserScope
    User provideUser(){
        return user;
    }

}



