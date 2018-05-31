package com.example.dagger2test;

import android.app.Application;
import android.content.Context;

/**
 * Created by steven on 2018/5/31.
 */
public class App extends Application {
    //application组件
    private AppComponent appComponent;
    //用户组件
    private UserComponent userComponent;

    //获取当前application的实例
    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //注入全局Application

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    }

    //对外提供UserComponent
    public UserComponent getUserComponent() {
        return userComponent;
    }

    //注入UserComponent，调用此方法后，UserCope生效
    public UserComponent createUserComponent(User user) {
        userComponent = appComponent.plus(new UserModule(user));
        return userComponent;
    }
    //释放UserComponent组件
    public void releaseUserComponent() {
        userComponent = null;
    }
}

