package com.deepshooter.tablayout.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.deepshooter.tablayout.R;
import com.deepshooter.tablayout.models.VideosBean;

import java.util.ArrayList;

/**
 * Created by Avinashmishra on 19-05-2017.
 */

public class VideoDetailsAdapter extends RecyclerView.Adapter<VideoDetailsAdapter.MyVideoViewHolder> {

    ArrayList<VideosBean> videosArrayList;

    public VideoDetailsAdapter(ArrayList<VideosBean> videosArrayList) {
        this.videosArrayList = videosArrayList;
    }

    @Override
    public MyVideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_detail_adapter, parent, false);

        return new MyVideoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyVideoViewHolder holder, int position) {

        holder.mTitle.setText(videosArrayList.get(position).getmTitle());
        holder.mTimeAdded.setText(videosArrayList.get(position).getmTime());
        holder.mDescription.setText(videosArrayList.get(position).getmDesc());
        holder.mVideoThumbnil.setImageResource(videosArrayList.get(position).getmImage());

    }

    @Override
    public int getItemCount() {
        return videosArrayList.size();
    }

    class MyVideoViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle, mTimeAdded, mDescription;
        ImageView mVideoThumbnil;

        public MyVideoViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.vT_videoTitle);
            mTimeAdded = (TextView) itemView.findViewById(R.id.vT_timeAdded);
            mDescription = (TextView) itemView.findViewById(R.id.vT_description);
            mVideoThumbnil = (ImageView) itemView.findViewById(R.id.vI_videoThumbnil);
        }
    }
}
