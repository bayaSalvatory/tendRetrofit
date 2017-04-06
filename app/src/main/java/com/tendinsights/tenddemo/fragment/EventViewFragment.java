package com.tendinsights.tenddemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tendinsights.tenddemo.R;
import com.tendinsights.tenddemo.util.Constants;

/**
 * Created by Rob on 4/5/17.
 */

public class EventViewFragment extends Fragment {

    private static final String TAG = "EventViewFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View eventView = inflater.inflate(R.layout.fragment_event_view, container, false);
        return eventView;
    }

    public void getPassArguement(){
        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.getString(Constants.NAME_KEY);
            String descr = bundle.getString(Constants.DESCR_KEY);

            Log.d(TAG, "name=" + name + "  descr=" + descr);
        }

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPassArguement();
    }
}
