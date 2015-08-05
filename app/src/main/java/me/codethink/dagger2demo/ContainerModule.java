package me.codethink.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by archie on 15/8/5.
 */
@Module
public class ContainerModule {
    @Provides ShoppingCartModel provideCartModel() {
        return new ShoppingCartModel();
    }
}
