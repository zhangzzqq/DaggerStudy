package com.iiseeuu.dagger2demo.scope;

import android.app.Application;
import android.content.Context;

/**
 * Created by wanglj on 16/6/22.
 */

public class App extends Application{

    private AppComponent appComponent;
    private UserComponent userComponent;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    }

    /**
     *
     * 需要获取的对象
     * @return
     */
    public UserComponent getUserComponent() {

        return userComponent;

    }

    /**
     *
     * 保存userA 和userB对象的值
     *
     * @param userA
     * @param userB
     * @return
     *
     */

    public UserComponent createUserComponent(User userA,User userB) {

        userComponent = appComponent.plus(new UserModule(userA,userB));

        return userComponent;

    }

    public void releaseUserComponent() {

        userComponent = null;

    }
}
