package com.tendinsights.tenddemo.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tendinsights.tenddemo.R;
import com.tendinsights.tenddemo.activity.CameraControlActivity;
import com.tendinsights.tenddemo.adapter.EventListAdapter;
import com.tendinsights.tenddemo.adapter.ViewPagerAdapter;
import com.tendinsights.tenddemo.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rob on 4/5/17.
 */

public class MainActivityFragment extends Fragment implements AdapterView.OnItemClickListener, ViewPagerAdapter.OnClickListener {

    private static final String TAG = "MainActivityFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_main_activity, container, false);
        initView(mainView);
        return mainView;
    }

    public void initView(View view) {
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(new EventListAdapter(getActivity(), getDummyEvents()));
        listView.setOnItemClickListener(this);

        ViewPager pager = (ViewPager) view.findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity(), getDeviceAliasList());
        adapter.setPagerImageClickListener(this);

        pager.setAdapter(adapter);

    }

    public List<ListItem> getDummyEvents() {
        List<ListItem> eventsList = new ArrayList<>();
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));
        eventsList.add(new ListItem("Ki", "I am Ki"));
        eventsList.add(new ListItem("John", "I am John"));
        eventsList.add(new ListItem("Rob", "I am Rob"));

        return eventsList;
    }

    public List<String> getDeviceAliasList() {
        List<String> deviceAliasList = new ArrayList<>();
        deviceAliasList.add("Ki I am Ki");
        deviceAliasList.add("John I am John");
        deviceAliasList.add("Rob I am Rob");

        return deviceAliasList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListItem listItem = (ListItem) parent.getAdapter().getItem(position);
        Bundle bundle = new Bundle();
        if (listItem != null) {
            bundle.putString("name", listItem.getName());
            bundle.putString("descr", listItem.getDescr());
        }
        EventViewFragment fragment = new EventViewFragment();
        fragment.setArguments(bundle);


        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.content, fragment, "eventActivityFragment");
        transaction.addToBackStack("eventActivityFragment");
        transaction.commit();


    }

    @Override
    public void onPagerImageClick(View view) {
        Log.d(TAG, "I clicked");

        Intent intent = new Intent(getActivity(), CameraControlActivity.class);
        getActivity().startActivity(intent);

    }
}
