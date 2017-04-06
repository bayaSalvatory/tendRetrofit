package com.tendinsights.tenddemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.tendinsights.tenddemo.R;

/**
 * Created by Rob on 4/5/17.
 */

public class CameraControlActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_camera_controls);
    }
}
