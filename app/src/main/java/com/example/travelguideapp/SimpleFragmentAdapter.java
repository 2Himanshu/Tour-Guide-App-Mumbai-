package com.example.travelguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {


    private Context context;

    public SimpleFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.famous_food_title);
            case 1:
                return context.getString(R.string.shopping_center);
            case 2:
                return context.getString(R.string.tourist_attraction);
            case 3:
                return context.getString(R.string.must_buy);
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Famous_Food();
        } else if (position == 1) {
            return new Famous_Shopping_Center();
        } else if (position == 3) {
            return new Things_To_Buy();
        } else {
            return new Tourist_Attraction();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
