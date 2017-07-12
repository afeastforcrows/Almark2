package com.example.android.almark2;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Wyatt on 3/20/2017.
 */

public class Town extends AppCompatActivity {

    private int mTotalGold;
    private int mMaxNumberOfBuildings;
    private int mMaxNumberOfParties;

    public Town(int gold){
        mTotalGold = gold;
    }

    private Building buildings[] = new Building[mMaxNumberOfBuildings];
    private Party parties[] = new Party[mMaxNumberOfParties];

    public int getMaxNumberOfBuildings() {
        return mMaxNumberOfBuildings;
    }

    public void generateBuildingList(){
        buildings[0] = new Building(new String("Town Square"));
        buildings[1] = new Building(new String("Inn"));
        buildings[2] = new Building(new String("Guild Hall"));
        buildings[3] = new Building(new String("Blacksmith"));
        buildings[4] = new Building(new String("Herbalist"));
    }

    public boolean getIsBuilt(int i){
        return buildings[i].getIsBuilt();
    }

    public void build(int i){
        buildings[i].build();
    }

    public String getBuildingName(int i){
        return buildings[i].getName();
    }

    public void addGold(int g){
        mTotalGold += g;
    }

    public void spendGold(int g){
        mTotalGold -= g;
    }

}
