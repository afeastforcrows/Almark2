package com.example.android.almark2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((GlobalDataClass) getApplication()).addNotification(new Notification("Welcome!", "Welcome to Almark! Let's party!", false, "Good", R.drawable.fleurdelis));

        Button town = (Button) findViewById(R.id.townQuad);
        // Set a click listener on that View
        town.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TownActivity.class));
                Toast toast = Toast.makeText(getApplicationContext(), "Town.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        TextView notificationTextView = (TextView) findViewById(R.id.menu1);
        // Set a click listener on that View
            notificationTextView.setText("Notifications: (" + (((GlobalDataClass)getApplication()).getNumNotifications()) + ")");
            notificationTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //((GlobalDataClass)getApplication()).build(1);
                //Toast toast = Toast.makeText(getApplicationContext(), "Inn built.", Toast.LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(MainActivity.this, NotificationsActivity.class));
            }
        });

        TextView partyTextView = (TextView) findViewById(R.id.menu2);
        // Set a click listener on that View
            partyTextView.setText("Parties");
            partyTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //((GlobalDataClass)getApplication()).build(2);

                Toast toast = Toast.makeText(getApplicationContext(), "Guild Hall built.", Toast.LENGTH_SHORT);
                //toast.show();
                startActivity(new Intent(MainActivity.this, PartyListActivity.class));

            }
        });

        TextView menu3 = (TextView) findViewById(R.id.menu3);
        // Set a click listener on that View
        //menu3.setText("100");
        menu3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                ((GlobalDataClass)getApplication()).build(3);

                Toast toast = Toast.makeText(getApplicationContext(), "Blacksmith built.", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        TextView goldTextView = (TextView) findViewById(R.id.menu5);
        // Set a click listener on that View
        goldTextView.setText("Gold: "+((GlobalDataClass)getApplication()).getGold());

        TextView menu6 = (TextView) findViewById(R.id.menu6);
        // Set a click listener on that View
        //menu3.setText("100");
        menu6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                ((GlobalDataClass)getApplication()).addGold(5);
                ((GlobalDataClass) getApplication()).addNotification(new Notification("Gold Added", "A total of 5 gold was added to your stores!", false, "Good"));
                Toast toast = Toast.makeText(getApplicationContext(), "Added five (5) gold.", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


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
