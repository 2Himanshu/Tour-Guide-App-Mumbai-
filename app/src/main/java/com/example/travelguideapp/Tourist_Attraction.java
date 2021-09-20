package com.example.travelguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Tourist_Attraction extends Fragment {
    private static final String LOG_TAG = Tourist_Attraction.class.getSimpleName();
    ListAdapter adapter;

    constants konstant = new constants();

    public Tourist_Attraction() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.item_list, container, false);
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList = konstant.populateData(LOG_TAG);
        adapter = new ListAdapter(getActivity(), itemArrayList);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return rootView;
    }


}
