package com.example.richakulkarni.uidesignone;
public class SampleData {

    private String mPlaceName;
    private String mBio;
    private String mDownloadUrl;

    public SampleData(){}

    public SampleData(String placeName,String bio,String url){
        mPlaceName = placeName;
        mBio = bio;
        mDownloadUrl = url;
    }


    public String getmBio() {
        return mBio;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmDownloadUrl() {
        return mDownloadUrl;
    }
}
