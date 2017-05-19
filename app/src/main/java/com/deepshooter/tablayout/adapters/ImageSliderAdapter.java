package com.deepshooter.tablayout.adapters;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.deepshooter.tablayout.R;


/**
 * Created by Avinashmishra on 19-05-2017.
 */

public class ImageSliderAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 5;
    }


    public Object instantiateItem(View collection, final int position) {

        LayoutInflater mLayoutInflater = (LayoutInflater) collection.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View LeagueButtonView = mLayoutInflater.inflate(R.layout.adapter_imageslider_pager, null);
        ImageView im_tipImage = (ImageView) LeagueButtonView.findViewById(R.id.pager_add_image);


        if (position == 0) {
            im_tipImage.setBackgroundResource(R.drawable.page1);
        } else if (position == 1) {
            im_tipImage.setBackgroundResource(R.drawable.page2);
        } else if (position == 2) {
            im_tipImage.setBackgroundResource(R.drawable.page3);
        } else if (position == 3) {
            im_tipImage.setBackgroundResource(R.drawable.page4);
        } else if (position == 4) {
            im_tipImage.setBackgroundResource(R.drawable.page5);
        }

        ((ViewPager) collection).addView(LeagueButtonView, 0);

        return LeagueButtonView;

    }
    @Override
    public void destroyItem(View collection, int position, Object view) {
        ((ViewPager) collection).removeView((View) view);
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }

    @Override
    public void finishUpdate(View arg0) {
    }

    @Override
    public void restoreState(Parcelable arg0, ClassLoader arg1) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public void startUpdate(View arg0) {
    }
}
