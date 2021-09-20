package com.example.travelguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Famous_Shopping_Center extends Fragment {

    private static final String LOG_TAG = Famous_Shopping_Center.class.getSimpleName();
    constants konstant = new constants();
    ListAdapter listAdapter;

    public Famous_Shopping_Center() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList = konstant.populateData(LOG_TAG);
        listAdapter = new ListAdapter(getActivity(), itemArrayList);

        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(listAdapter);
        return rootView;
    }

}