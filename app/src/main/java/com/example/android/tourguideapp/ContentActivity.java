package com.example.android.tourguideapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContentActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap Map;
    private String placeName, placeDescription, placeAddress, placePhone, placeWebsite;
    private double placeLatitude, placeLongitude;
    private int placeImage;

    private LatLng location(double latitude, double longitude) {
        LatLng location = new LatLng(latitude, longitude);
        return location;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        placeName = intent.getStringExtra("Place_Name");
        placeDescription = intent.getStringExtra("Place_Description");
        placeAddress = intent.getStringExtra("Place_Address");
        placePhone = intent.getStringExtra("Place_Phone");
        placeWebsite = intent.getStringExtra("Place_Website");
        placeLatitude = intent.getDoubleExtra("Place_Latitude",37.9715323);
        placeLongitude = intent.getDoubleExtra("Place_Longitude", 23.7257492);
        placeImage = intent.getIntExtra("Place_Image", R.drawable.acropolis);

        setContentView(R.layout.activity_content);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        TextView nameView = findViewById(R.id.placeName);
        nameView.setText(placeName);

        TextView descriptionView = findViewById(R.id.placeDescription);
        descriptionView.setText(placeDescription);

        TextView addressView = findViewById(R.id.placeAddress);
        addressView.setText(placeAddress);

        TextView phoneView = findViewById(R.id.placePhone);
        phoneView.setText(placePhone);

        TextView websiteView = findViewById(R.id.placeWebsite);
        websiteView.setText(placeWebsite);

        ImageView imageView = findViewById(R.id.placeImage);
        imageView.setImageResource(placeImage);


        phoneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + placePhone));

                    startActivity(phoneCall);

            }
        });

        websiteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openWebsite = new Intent(Intent.ACTION_VIEW);
        openWebsite.setData(Uri.parse("http://" + placeWebsite));
                startActivity(openWebsite);

            }
        });

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        Map = googleMap;



        Map.addMarker(new MarkerOptions().position(location(placeLatitude,placeLongitude)).title(placeName));
        Map.moveCamera(CameraUpdateFactory.newLatLng(location(placeLatitude,placeLongitude)));
    }
}
