package com.example.android.almark2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by Wyatt on 3/27/2017.
 */

public class Notification extends AppCompatActivity {

    private String mName;
    private String mContents;
    private boolean mSeen;
    private String mType;

    private int mResourceImageID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Notification() {
    }

    //Constructor with Image ID passed in
    public Notification(String name, String contents, boolean seen, String type, int imageResourceID) {
        mName = name;
        mContents = contents;
        mSeen = seen;
        mType = type;
        mResourceImageID = imageResourceID;
    }

    //Constructor with no Image ID passed in
    public Notification(String name, String contents, boolean seen, String type) {
        mName = name;
        mContents = contents;
        mSeen = seen;
        mType = type;
        mResourceImageID = R.drawable.fleurdelis64;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    public String getCentents(){
        return mContents;
    }

    public void setContents(String contents){
        mContents = contents;
    }

    public String getType(){
        return mType;
    }

    public void setType(String type){
        mType = type;
    }

    public boolean getSeen(){
        return mSeen;
    }

    public void lookAt(){
        mSeen = true;
    }

    public int getImageResourceID(){
        return mResourceImageID;
    }

}
