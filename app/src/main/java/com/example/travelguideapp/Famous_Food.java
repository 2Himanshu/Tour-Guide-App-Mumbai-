package com.example.travelguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Famous_Food extends Fragment {

private static final String LOG_TAG = Famous_Food.class.getSimpleName();
ListAdapter listAdapter;
    constants konstants = new constants();


    public Famous_Food() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View rootView  = inflater.inflate(R.layout.item_list,container,false);
        ArrayList<Item> listItem = new ArrayList<>();
        listItem = konstants.populateData(LOG_TAG);
        listAdapter = new ListAdapter(getActivity(),listItem);
        ListView listtView = rootView.findViewById(R.id.listView);
        listtView.setAdapter(listAdapter);
        return rootView;
    }

}