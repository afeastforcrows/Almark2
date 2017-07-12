package com.example.android.almark2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Wyatt on 3/27/2017.
 */

public class PartyAdapter extends ArrayAdapter<Party> {


    public PartyAdapter(Context context, ArrayList<Party> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.party_list_view, parent, false);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(R.drawable.fleurdelis);
        imageView.setVisibility(View.VISIBLE);
        /*
        if(currentNotification.getSeen()){
            //imageView.setImageResource(currentNotification.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        */

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
