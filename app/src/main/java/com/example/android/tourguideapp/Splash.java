package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Stelios on 3/3/2018.
 */

public class Splash extends AppCompatActivity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {

            /**
             * Showing splash screen with a timer
             */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);

                // close splash activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
