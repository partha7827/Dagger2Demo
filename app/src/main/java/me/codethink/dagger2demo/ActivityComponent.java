package me.codethink.dagger2demo;

import android.app.Activity;

import dagger.Component;

/**
 * Created by archie on 15/8/4.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
//    void inject(MainActivity activity);
    UserModel userModel();
}
