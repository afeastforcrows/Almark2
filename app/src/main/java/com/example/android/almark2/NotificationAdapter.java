package com.example.android.almark2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
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

public class NotificationAdapter extends ArrayAdapter<Notification> {


    public NotificationAdapter(Context context, ArrayList<Notification> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.notification_view, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Notification currentNotification = getItem(position);

        View linearLayout = listItemView.findViewById(R.id.text_container);
        //linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceID));

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentNotification.getCentents());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.content_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentNotification.getName());


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
