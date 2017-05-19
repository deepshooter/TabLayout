package com.deepshooter.tablayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepshooter.tablayout.R;
import com.deepshooter.tablayout.adapters.VideoDetailsAdapter;
import com.deepshooter.tablayout.models.VideosBean;

import java.util.ArrayList;


public class MilesStoneFragment extends Fragment {

    ArrayList<VideosBean> videosArrayList;
    VideoDetailsAdapter videoDetailsAapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    public MilesStoneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_milesstone, container, false);

        videosArrayList = new ArrayList<>();
        videoDetailsAapter = new VideoDetailsAdapter(videosArrayList);
        prepareVideoData();

        recyclerView = (RecyclerView) view.findViewById(R.id.vR_videoList);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(videoDetailsAapter);

        return view;
    }


    public static MilesStoneFragment newInstance() {

        MilesStoneFragment fragmentFirst = new MilesStoneFragment();

        return fragmentFirst;
    }

    private void prepareVideoData() {


        int[] images = new int[]{
                R.drawable.music1,
                R.drawable.page1,
                R.drawable.page2,
                R.drawable.page3,
                R.drawable.page4,
                R.drawable.page5,
                R.drawable.music1,
                R.drawable.music1,
                R.drawable.music1,
                R.drawable.music1
        };
        String[] title = new String[]
                {
                        "EMTINESS FT.JUSTIN TIBLEKAR",
                        "I AM FALL IN LOVE WITH YOU",
                        "BABY FT.JUST BABER",
                        "WHITE HORSE FT.TALYOR SWIF",
                        "EMTINESS FT.JUSTIN TIBLEKAR",
                        "I AM FALL IN LOVE WITH YOU",
                        "BABY FT.JUST BABER",
                        "WHITE HORSE FT.TALYOR SWIF",
                        "EMTINESS FT.JUSTIN TIBLEKAR",
                        "I AM FALL IN LOVE WITH YOU"

                };

        String[] time = new String[]
                {
                        "18 HOURS AGO",
                        "20 HOURS AGO",
                        "22 HOURS AGO",
                        "23 HOURS AGO",
                        "15 HOURS AGO",
                        "14 HOURS AGO",
                        "13 HOURS AGO",
                        "12 HOURS AGO",
                        "11 HOURS AGO",
                        "10 HOURS AGO"


                };

        String[] description = new String[]
                {
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry"


                };


        for (int i = 0; i < images.length; i++) {

            VideosBean  videosBean = new VideosBean(images[i], title[i], time[i], description[i]);
            videosArrayList.add(videosBean);
        }


    }
}
