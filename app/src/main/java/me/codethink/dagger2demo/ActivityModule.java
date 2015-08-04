package me.codethink.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by archie on 15/8/4.
 */
@Module
public class ActivityModule {

    @Provides UserModel provideUserModel() {
        return new UserModel();
    }
}
