package com.iiseeuu.dagger2demo.scope.b;

import dagger.Subcomponent;

/**
 * Created by wanglj on 16/6/22.
 */
@Subcomponent(modules = BModule.class)
public interface BComponent {

    void inject(BActivity bActivity);

}
