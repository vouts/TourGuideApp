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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("red", "weṭeṭṭi",  R.drawable.hotel));
        places.add(new Place("green", "chokokki",  R.drawable.hotel));
        places.add(new Place("brown", "ṭakaakki",  R.drawable.hotel));
        places.add(new Place("gray", "ṭopoppi", R.drawable.hotel));
        places.add(new Place("black", "kululli",  R.drawable.hotel));
        places.add(new Place("white", "kelelli", R.drawable.acropolis));
        places.add(new Place("dusty yellow", "ṭopiisә", R.drawable.hotel));
        places.add(new Place("mustard yellow", "chiwiiṭә",  R.drawable.hotel));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places, R.color.mainBG);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);

                Intent Content = new Intent(getActivity(), ContentActivity.class);
                //Content.putExtra("Song_Name", songName.getText());
                //Content.putExtra("Song_Artist", songArtist.getText());
                //Content.putExtra("Song_Album", songAlbum.getText());
                //Content.putExtra("Album_Cover", albumCover.getText().toString());
                startActivity(Content);

            }

        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.

    }

}
