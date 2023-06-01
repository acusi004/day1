package com.example.day1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class sinhvienListViewAdapter extends BaseAdapter {

    private final Context ctx;
    private final ArrayList<sinhvien> list;

    public sinhvienListViewAdapter(Context ctx, ArrayList<sinhvien> list) {
        this.ctx = ctx;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
        convertView = inflater.inflate(R.layout.item_listview, parent, false);

        sinhvien sv = list.get(position);
        TextView title = convertView.findViewById(R.id.txtTitle);
        TextView name = convertView.findViewById(R.id.txtName);
        TextView address = convertView.findViewById(R.id.txtAdress);
        Button delete = convertView.findViewById(R.id.btnDelete);
        Button update = convertView.findViewById(R.id.btnUpdate);

        if ( sv == null){
            title.setText(sv.getTitle());
            name.setText(sv.getName());
            address.setText(sv.getAddress());
        }

        return convertView;
    }
}
