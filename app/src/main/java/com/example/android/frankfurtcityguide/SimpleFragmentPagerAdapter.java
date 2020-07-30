package com.example.android.frankfurtcityguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class SimpleFragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    final int NUM_PAGES = 5;

    // Constructor
    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SitesFragment();
        } else if (position == 1) {
            return new MuseaFragment();
        } else if (position == 2) {
            return new TheatreFragment();
        } else if (position == 3) {
            return new OutdoorFragment();
        } else {
            return new EatingFragment();
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
