package com.tendinsights.tenddemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tendinsights.tenddemo.component.DaggerInjector;
import com.tendinsights.tenddemo.component.Injector;
import com.tendinsights.tenddemo.networking.NetworkModule;

import java.io.File;

/**
 * Created by Rob on 4/6/17.
 */

public class BaseActivity extends Activity {
    public Injector injector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        File cacheFile = new File(getCacheDir(), "responses");
        injector = DaggerInjector.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public Injector getInjector() {
        return this.injector;
    }
}
