package com.example.hafiz.quickflip;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mViewPager = (ViewPager) findViewById(R.id.container); // contains all the fragments
        setupViewPager(mViewPager); // setup viewpager with our helper class

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs); // reference the tab layour from the xml file
        tabLayout.setupWithViewPager(mViewPager); // setup the tab with the viewpager
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager()); // declare a new 'fragment holder'
        adapter.addFragment(new FlipACoin_Fragment(), "Flip a Coin"); // add a fragment
        adapter.addFragment(new RollTheDice_Fragment(), "Roll the Dice"); // add a fragment
        viewPager.setAdapter(adapter); // set the adapter to the viewpager(container for fragments)
    }


}
