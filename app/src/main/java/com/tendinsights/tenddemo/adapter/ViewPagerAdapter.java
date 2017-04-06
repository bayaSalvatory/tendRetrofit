package com.tendinsights.tenddemo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tendinsights.tenddemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rob on 4/5/17.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private List<String> mDeviceAliasList = new ArrayList<>();
    private OnClickListener listener;

    public void setPagerImageClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public ViewPagerAdapter(Context context, List<String> deviceAliasList) {
        mDeviceAliasList.addAll(deviceAliasList);
        mContext = context;
    }

    @Override
    public int getCount() {
        return mDeviceAliasList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public void updateItems(List<String> deviceAliasList) {
        mDeviceAliasList.clear();
        mDeviceAliasList.addAll(deviceAliasList);
        notifyDataSetChanged();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.pager_view, container, false);
        if (view != null) {
            ImageView image = (ImageView) view.findViewById(R.id.image);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onPagerImageClick(v);
                    }
                }
            });
        }
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public interface OnClickListener {
        void onPagerImageClick(View view);
    }
}
