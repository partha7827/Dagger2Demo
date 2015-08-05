package me.codethink.dagger2demo;

import dagger.Component;

/**
 * Created by archie on 15/8/5.
 */
@Component(dependencies = ActivityComponent.class, modules = ContainerModule.class)
public interface ContainerComponent {
    void inject(MainActivity mainActivity);
}
