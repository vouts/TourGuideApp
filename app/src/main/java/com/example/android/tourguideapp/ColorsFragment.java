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
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi", R.raw.color_red, R.drawable.hotel));
        words.add(new Word("green", "chokokki", R.raw.color_green, R.drawable.hotel));
        words.add(new Word("brown", "ṭakaakki", R.raw.color_brown, R.drawable.hotel));
        words.add(new Word("gray", "ṭopoppi", R.raw.color_gray, R.drawable.hotel));
        words.add(new Word("black", "kululli", R.raw.color_black, R.drawable.hotel));
        words.add(new Word("white", "kelelli", R.raw.color_white, R.drawable.acropolis));
        words.add(new Word("dusty yellow", "ṭopiisә", R.raw.color_dusty_yellow, R.drawable.hotel));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.raw.color_mustard_yellow, R.drawable.hotel));

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.mainBG);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

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
