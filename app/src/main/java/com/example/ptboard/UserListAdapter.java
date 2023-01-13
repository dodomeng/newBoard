package com.example.ptboard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserListAdapter extends BaseAdapter {

    private Context context;
    private List<User> userList;

    public UserListAdapter(Context context, List<User> userList){
        this.context = context;
        this.userList = userList;
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return userList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.user, null);
        TextView writer = (TextView) v.findViewById(R.id.writer);
        TextView store = (TextView) v.findViewById(R.id.store);
        TextView pt_number = (TextView) v.findViewById(R.id.pt_number);
        TextView pt_name = (TextView) v.findViewById(R.id.pt_name);

        writer.setText(userList.get(i).getWriter());
        store.setText(userList.get(i).getStore());
        pt_number.setText(userList.get(i).getPt_number());
        pt_name.setText(userList.get(i).getPt_name());

        v.setTag(userList.get(i).getPt_number());
        return v;
    }
}
