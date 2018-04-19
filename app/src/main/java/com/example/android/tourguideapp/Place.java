package com.example.android.tourguideapp;

import android.content.Context;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Stelios on 2/24/2018.
 */

public class Place {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Name of the place
     */
    private String placeName;

    /**
     * Phone number of the place
     */
    private String placePhone;

    /**
     * Webiste of the place
     */
    private String placeWebsite;

    /**
     * Small description of the place
     */
    private String placeDescription;
    /**
     * Location of the place
     */
    double placeLatitude;
    double placeLongitude;

    /**
     *  Image of the place
     */
    private int placeImage = NO_IMAGE_PROVIDED;







    /**
     * Create a new Place object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param resourceId         contains the desired image
     */
    public Place(String defaultTranslation, String miwokTranslation, int resourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return placeImage != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Get the description of the place.
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /**
     * Get the phone of the place.
     */
    public String getPlacePhone() {
        return placePhone;
    }


    /**
     * Get the Miwok image.
     */
    public int getPlaceImage() {
        return placeImage;
    }



}

