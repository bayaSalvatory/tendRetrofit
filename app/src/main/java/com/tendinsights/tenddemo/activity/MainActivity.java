package com.tendinsights.tenddemo.activity;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

import com.tendinsights.tenddemo.R;
import com.tendinsights.tenddemo.fragment.MainActivityFragment;
import com.tendinsights.tenddemo.model.EventListResponse;
import com.tendinsights.tenddemo.networking.Service;


import javax.inject.Inject;

import retrofit2.Call;


public class MainActivity extends BaseActivity {


    @Inject
    public Service service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getInjector().inject(this);
        if (service != null) {
            Log.d("MainActivity", "object is not null");
        }

        setContentView(R.layout.activity_main);
        attachFragment();
        getEventsList();
    }

    public void attachFragment() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.content, new MainActivityFragment(), "mainActivityFragment");
        transaction.commit();
    }

    public void getEventsList() {

        service.getEventsList(new Service.OnEventRetrievalListener() {
            @Override
            public void onEventRetrievalSucceeded(EventListResponse eventListResponse) {
                Log.d("MainActivity", "succeded");
            }

            @Override
            public void onEventRetrievalFailed() {
                Log.d("MainActivity", "failed");
            }
        });

        //subscriptions.add(subscription);
    }

}
