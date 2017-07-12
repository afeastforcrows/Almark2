package com.example.android.almark2;

import android.app.Application;
import android.provider.Settings;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Wyatt on 3/19/2017.
 */

public class GlobalDataClass extends Application {

    private int mMaxNumberOfBuildings = 5;
    private int mMaxNumberOfParties = 10;
    private int mDay = 0;
    private int mTotalGold = 0;
    private int mNumNotifications = 0;

    final ArrayList<Notification> notificationList  = new ArrayList<Notification>();

    private Building buildings[] = new Building[mMaxNumberOfBuildings];
    private Party parties[] = new Party[mMaxNumberOfParties];

    @Override
    public void onCreate() {
        super.onCreate();

        //Create list of buildings and build Town Hall (at position 0)
        generateBuildingList();
        build(0);

        //Give player starting gold of 100
        addGold(100);

    }

    public void addNotification(Notification notification){
        notificationList.add(notification);
    }

    public ArrayList<Notification> getNotificationList(){
        return notificationList;
    }

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

    public int getGold(){
        return mTotalGold;
    }

    public void addGold(int g){
        mTotalGold += g;
    }

    public void spendGold(int g){
        mTotalGold -= g;
    }

    public void nextDay(){
        mDay++;
    }

    public int getNumNotifications(){
        return mNumNotifications;
    }

}
