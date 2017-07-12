package com.example.android.almark2;

/**
 * Created by Wyatt on 3/19/2017.
 */

public class Building {
    private String mName;
    private boolean mIsBuilt;

    public Building(String name){
        mName = name;
        mIsBuilt = false;
    }

    public String getName(){
        return mName;
    }

    public boolean getIsBuilt(){
        return mIsBuilt;
    }

    public void build(){
        mIsBuilt = true;
    }

}
