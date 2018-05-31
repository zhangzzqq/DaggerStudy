package com.jess.arms.widget.autolayout.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.jess.arms.widget.autolayout.di.module.MainTestModule;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.widget.autolayout.mvp.ui.activity.MainTestActivity;

@ActivityScope
@Component(modules = MainTestModule.class, dependencies = AppComponent.class)
public interface MainTestComponent {
    void inject(MainTestActivity activity);
}