package com.example.hafiz.quickflip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    /*
    This is a helper class for managing fragments
    FragmentPagerAdapter deals with how fragments are stored in memory (this one keeps them in memory)
    This adapter is good for tabs or 3-4 fragments
     */

    private final List<Fragment> mFragmentList = new ArrayList<>(); // holds all the fragments
    private final List<String> mFragmentTitleList = new ArrayList<>(); // holds the titles for all the fragments

    public SectionsPagerAdapter(FragmentManager fm) { // default constructor (do not change)
        super(fm);
    }
    @Override
    public Fragment getItem(int position) { // returns the fragment at index position
        return mFragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) { // returns the name of the fragment at index position
        return mFragmentTitleList.get(position);
    }

    @Override
    public int getCount() { // returns the total number of fragments being handled by this FragmentPagerAdapter
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) { // this adds a new fragment to this Fragment manager
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
}
