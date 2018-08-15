package com.mostafa.fci.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    //Global Variables
    int backgroundColor;
    //Adapter Constructor
    public PlaceAdapter(final Context context, ArrayList<Place> words , int bg) {
        super(context, R.layout.list_item,words);
        this.backgroundColor = bg;
    }
    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Place place = getItem(position);
        //initialization to views
        TextView placeNameTextView = listItemView.findViewById(R.id.place_name);
        TextView placeDescTextView = listItemView.findViewById(R.id.place_description);
        ImageView iconView = listItemView.findViewById(R.id.list_item_icon);
        LinearLayout linearLayout = listItemView.findViewById(R.id.bg);
        // set data to views
        linearLayout.setBackgroundResource(backgroundColor);
        placeNameTextView.setText(place.getName());
        placeDescTextView.setText(place.getDescription());
        //set image to ImageView with picasso to save memory
        Picasso.get()
                .load(place.getImageResourceId())
                .into(iconView);
        return listItemView;
    }
}