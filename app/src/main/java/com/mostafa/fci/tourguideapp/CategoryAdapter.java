package com.mostafa.fci.tourguideapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter {
    //Adapter Constructor
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }
    //Override Methods
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TouristPlacesFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new RestaurantsFragment();
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "TOURIST PLACES";
        } else if (position == 1) {
            return "HOTELS";
        } else if (position == 2) {
            return "PARKS";
        } else {
            return "RESTAURANTS";
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
}
