package com.example.travelguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Item> {

    Item currentItem;
    public ListAdapter(Activity context, ArrayList<Item> items)
    {
        super(context,0,items);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        currentItem = getItem(position);
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);
        }
        TextView textView = listItemView.findViewById(R.id.textView);
        textView.setBackgroundResource(currentItem.getImage());
        textView.setText(currentItem.getDescription());

        TextView about = listItemView.findViewById(R.id.description);
        if(currentItem.getAbout()!=0) {
            about.setText(currentItem.getAbout());
        }
        return listItemView;
    }
    public void release(){

    }
}
