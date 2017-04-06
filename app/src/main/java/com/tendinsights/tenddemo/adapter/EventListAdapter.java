package com.tendinsights.tenddemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tendinsights.tenddemo.R;
import com.tendinsights.tenddemo.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rob on 4/5/17.
 */

public class EventListAdapter extends BaseAdapter {

    private List<ListItem> mEventsList = new ArrayList<>();
    private Context mContext;

    public EventListAdapter(Context context, List<ListItem> eventsList) {
        mEventsList.addAll(eventsList);
        mContext = context;
    }

    @Override
    public int getCount() {
        return mEventsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mEventsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.view_event_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();
        }

        ListItem item = mEventsList.get(position);

        if (item != null) {
            String name = String.format(mContext.getString(R.string.name), item.getName());
            holder.name.setText(name);
            String descr = String.format(mContext.getString(R.string.descr), item.getDescr());
            holder.descr.setText(descr);
        }

        return convertView;
    }

    public void updateItems(List<ListItem> eventsList) {
        mEventsList.clear();
        mEventsList.addAll(eventsList);
        notifyDataSetChanged();
    }

    private class ViewHolder {
        private TextView name;
        private TextView descr;

        public ViewHolder(View view) {
            name = (TextView) view.findViewById(R.id.name);
            descr = (TextView) view.findViewById(R.id.descr);
        }
    }
}
