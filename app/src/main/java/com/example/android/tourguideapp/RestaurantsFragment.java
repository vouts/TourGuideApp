package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();
        //places.add(new Place("red", "weṭeṭṭi",  R.drawable.hotel));
        //places.add(new Place("green", "chokokki",  R.drawable.hotel));
        //places.add(new Place("brown", "ṭakaakki",  R.drawable.hotel));
        //places.add(new Place("gray", "ṭopoppi", R.drawable.hotel));
        //places.add(new Place("black", "kululli",  R.drawable.hotel));
        //places.add(new Place("white", "kelelli", R.drawable.acropolis));
        //places.add(new Place("dusty yellow", "ṭopiisә", R.drawable.hotel));
        //places.add(new Place("mustard yellow", "chiwiiṭә",  R.drawable.hotel));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places, R.color.mainBG);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);

                Intent Content = new Intent(getActivity(), ContentActivity.class);
                Content.putExtra("Place_Name", place.getPlaceName());
                Content.putExtra("Place_Description", place.getPlaceDescription());
                Content.putExtra("Place_Address", place.getPlaceAddress());
                Content.putExtra("Place_Phone", place.getPlacePhone());
                Content.putExtra("Place_Website", place.getPlaceWebsite());
                Content.putExtra("Place_Latitude", place.getPlaceLatitude());
                Content.putExtra("Place_Longitude", place.getPlaceLongitude());
                Content.putExtra("Place_Has_Image", place.hasImage());
                startActivity(Content);

            }

        });

        return rootView;
    }

}
