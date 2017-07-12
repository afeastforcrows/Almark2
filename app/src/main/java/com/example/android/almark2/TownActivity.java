package com.example.android.almark2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Wyatt on 3/19/2017.
 */

public class TownActivity extends AppCompatActivity {

    TextView builtTextView;
    TextView unbuiltTextView;
    int numBuildings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.town_view);


        Button homeButton = (Button) findViewById(R.id.homeButton);
        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TownActivity.this, MainActivity.class));
            }
        });


        numBuildings = ((GlobalDataClass)getApplication()).getMaxNumberOfBuildings();

        builtTextView = (TextView)findViewById(R.id.built);
        unbuiltTextView = (TextView) findViewById(R.id.notBuilt);

        builtTextView.setText("BUILT: ");
        unbuiltTextView.setText("UNBUILT: ");

        for(int x = 0; x < numBuildings; x++) {
            if(((GlobalDataClass)getApplication()).getIsBuilt(x)) {
                builtTextView.append("\n" + ((GlobalDataClass)getApplication()).getBuildingName(x));
            }
            else{
                unbuiltTextView.append("\n" + ((GlobalDataClass)getApplication()).getBuildingName(x));
            }
        }

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
