package com.example.android.frankfurtcityguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    SimpleFragmentPagerAdapter adapterViewPager;
    private static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    private TabLayout tabLayout;
    private int[] tabIcons = new int[] {R.drawable.ic_place,
            R.drawable.ic_museum,
            R.drawable.ic_theatre,
            R.drawable.ic_landscape,
            R.drawable.ic_restaurant
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main layout
        setContentView(R.layout.activity_main);

        // Find the ViewPager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        adapterViewPager = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        // Set the adapter onto the viewPager
        viewPager.setAdapter(adapterViewPager);

        // Set a tab layout
        tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }

}