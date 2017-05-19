package com.deepshooter.tablayout;

import android.graphics.Typeface;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.deepshooter.tablayout.adapters.ImageSliderAdapter;
import com.deepshooter.tablayout.adapters.TabViewPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {


    ViewPager mMainPager, tabPager;
    CirclePageIndicator mCirclePageIndicator;
    ImageSliderAdapter mPlacePagerAdapter;

    private static int IMAGES_VISIBLE_TIME = 2500;

    int mImagePosition = 0;

    Handler mHandlerImgsAnime;
    Timer swipeTimer;
    TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
    }


      private  void initializeView()
      {
          mMainPager = (ViewPager) findViewById(R.id.vP_ha_viewPager);
          tabPager = (ViewPager) findViewById(R.id.tabViewPager);
          tabLayout = (TabLayout) findViewById(R.id.tabLayout);
          mCirclePageIndicator = (CirclePageIndicator) findViewById(R.id.pagerIndicator);

          setValues();
      }


      private void setValues()
      {

          // threading for the Scroll image
          final Runnable ViewPagerAddsScroll = new Runnable() {
              @Override
              public void run() {
                  if (mImagePosition == 5) {
                      mImagePosition = 0;
                  }
                  mMainPager.setCurrentItem(mImagePosition++, true);
              }
          };

          mPlacePagerAdapter = new ImageSliderAdapter();
          mCirclePageIndicator.setSnap(true);
          mCirclePageIndicator.setFillColor(getResources().getColor(R.color.white));
          mCirclePageIndicator.setStrokeColor(getResources().getColor(R.color.white));
          mCirclePageIndicator.setRadius(8);
          mMainPager.setAdapter(mPlacePagerAdapter);
          mCirclePageIndicator.setViewPager(mMainPager);
          mPlacePagerAdapter.notifyDataSetChanged();
          mMainPager.getAdapter().notifyDataSetChanged();


          mHandlerImgsAnime = new Handler();
          swipeTimer = new Timer();
          swipeTimer.schedule(new TimerTask() {
              @Override
              public void run() {
                  mHandlerImgsAnime.post(ViewPagerAddsScroll);
              }
          }, IMAGES_VISIBLE_TIME, IMAGES_VISIBLE_TIME);




          TabViewPagerAdapter viewPagerAdapter = new TabViewPagerAdapter(getSupportFragmentManager());
          tabPager.setAdapter(viewPagerAdapter);
          tabLayout.setupWithViewPager(tabPager);
          tabLayout.getTabAt(0).setIcon(R.drawable.videotabselector);
          tabLayout.getTabAt(1).setIcon(R.drawable.imageselectore);
          tabLayout.getTabAt(2).setIcon(R.drawable.milestonesselector);



      }



}
