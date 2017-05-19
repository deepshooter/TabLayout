package com.deepshooter.tablayout.adapters;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.deepshooter.tablayout.R;
import com.deepshooter.tablayout.fragment.ImageFragment;
import com.deepshooter.tablayout.fragment.MilesStoneFragment;
import com.deepshooter.tablayout.fragment.VideoFragment;


/**
 * Created by Avinashmishra on 19-05-2017.
 */

public class TabViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;
    private   String[] titles = {"VIDEOS", "IMAGES", "MILESTONE"};

    public TabViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }


    @Override
    public int getCount() {
        return NUM_ITEMS;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return VideoFragment.newInstance();
            case 1:
                return ImageFragment.newInstance();
            case 2:
                return MilesStoneFragment.newInstance();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
