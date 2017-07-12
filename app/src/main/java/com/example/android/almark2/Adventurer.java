package com.example.android.almark2;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wyatt on 3/20/2017.
 */

public class Adventurer extends AppCompatActivity {
 //comment this line
    private int mLevel;
    private String mName;
    private String mCharacterClass;
    private String mRace;

    public Adventurer(String name, String characterClass, String race, int level){
        mLevel = level;
        mName = name;
        mCharacterClass = characterClass;
        mRace = race;
    }

    public void levelUp(){
        mLevel++;
    }

    public int getLevel(){
        return mLevel;
    }

    public String getName(){
        return mName;
    }

    public String getCharacterClass(){
        return mCharacterClass;
    }

    public String getRace(){
        return mRace;
    }

}
