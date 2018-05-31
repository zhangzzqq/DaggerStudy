package com.example.dagger2test;

import dagger.Subcomponent;

/**
 * Created by steven on 2018/5/31.
 */

@UserScope
@Subcomponent(modules = UserModule.class)
public interface UserComponent {

//    AComponent plus(AModule aModule);
//    BComponent plus(BModule bModule);
//    CComponent plus(CModule cModule);

}

