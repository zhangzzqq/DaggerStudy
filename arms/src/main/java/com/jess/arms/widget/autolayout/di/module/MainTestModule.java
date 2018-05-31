package com.jess.arms.widget.autolayout.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.jess.arms.widget.autolayout.mvp.contract.MainTestContract;
import com.jess.arms.widget.autolayout.mvp.model.MainTestModel;


@Module
public class MainTestModule {
    private MainTestContract.View view;

    /**
     * 构建MainTestModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MainTestModule(MainTestContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MainTestContract.View provideMainTestView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MainTestContract.Model provideMainTestModel(MainTestModel model) {
        return model;
    }
}