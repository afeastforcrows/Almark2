package com.example.android.almark2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Wyatt on 3/27/2017.
 */

public class NotificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_list);

        //((GlobalDataClass) getApplication()).addNotification(new Notification("Welcome!", "Welcome to Almark! Let's party!", false, "Good", R.drawable.fleurdelis));
        //((GlobalDataClass) getApplication()).addNotification(new Notification("Part Deux!", "Hope this is less grainy!", false, "Good", R.drawable.fleurdelis64));
        //((GlobalDataClass) getApplication()).addNotification(new Notification("Three times the fun!", "Butts and stuff!", false, "Good"));

        NotificationAdapter itemsAdapter = new NotificationAdapter(this, ((GlobalDataClass) getApplication()).getNotificationList());

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }

}
