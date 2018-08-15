package com.mostafa.fci.tourguideapp;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {
    ///Global Variable
    ArrayList<Place> places = new ArrayList<>();
    //Fragment Constructor
    public ParksFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ///initialisation of ListView
        ListView listView = rootView.findViewById(R.id.container);
        // get data from string.xml
        String[] parksNames = getResources().getStringArray(R.array.parks_names);
        String[] parksDesc = getResources().getStringArray(R.array.parks_descriptions);
        TypedArray images = getResources().obtainTypedArray(R.array.parks_images);
        for (int i = 0; i < parksNames.length; i++) {
            places.add(new Place(parksNames[i], parksDesc[i]
                    , images.getResourceId(i, R.color.default_color)));
        }
        // create and set listView Adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_Parks);
        listView.setAdapter(adapter);
        return rootView;
    }
}