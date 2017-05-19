package com.deepshooter.tablayout.models;

/**
 * Created by Avinashmishra on 19-05-2017.
 */

public class VideosBean {

    String mTitle, mTime, mDesc;
    int mImage;



    public VideosBean( int mImage , String mTitle ,String mSubtitle, String mDesc) {
        this.mTitle = mTitle;
        this.mTime = mSubtitle;
        this.mDesc = mDesc;
        this.mImage = mImage;
    }
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
