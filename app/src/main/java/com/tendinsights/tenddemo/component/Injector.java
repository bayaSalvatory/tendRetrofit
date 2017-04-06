package com.tendinsights.tenddemo.component;

import com.tendinsights.tenddemo.activity.MainActivity;
import com.tendinsights.tenddemo.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rob on 4/6/17.
 */

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Injector {
    void inject(MainActivity homeActivity);
}
