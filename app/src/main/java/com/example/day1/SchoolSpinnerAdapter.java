package com.example.day1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SchoolSpinnerAdapter extends BaseAdapter {

    private final Context context;

    private final ArrayList<school> list;

    public SchoolSpinnerAdapter(Context context, ArrayList<school> list) {
        this.context = context;
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
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.item_spinner, parent, false);

        ImageView ivlogo = convertView.findViewById(R.id.ivLogo);
        TextView txtname = convertView.findViewById(R.id.txtName);

        ivlogo.setImageResource(list.get(position).getImage());
        txtname.setText("Fpoly "+ list.get(position).getName());

        return convertView;
    }
}
