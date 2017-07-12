package com.example.android.almark2;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wyatt on 3/20/2017.
 */

public class Party extends AppCompatActivity {

    private Adventurer adventurers[];
    private String mName;
    private int mSize, mLevel;

    public Party(String name, int size, int level){
        mSize = size;
        adventurers = new Adventurer[mSize];
        mName = name;
        mLevel = level;
    }



}
