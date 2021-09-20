package com.example.travelguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Things_To_Buy extends Fragment {

    Item items;
    constants konstant = new constants();
    ListAdapter adapter;
    private static final String LOG_TAG = Things_To_Buy.class.getSimpleName();

    public Things_To_Buy() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList = konstant.populateData(LOG_TAG);
        adapter = new ListAdapter(getActivity(), itemArrayList);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.release();
    }
}