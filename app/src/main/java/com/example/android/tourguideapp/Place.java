package com.example.android.tourguideapp;

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
     * Address of the place
     */
    private String placeAddress;

    /**
     * Location of the place
     */
    private double placeLatitude;
    private double placeLongitude;

    /**
     *  Image of the place
     */
    private int placeImage = NO_IMAGE_PROVIDED;

    /**
     * Create a new Place object.
     *
     * @param name contains the name of the place
     * @param description contains a small description of the place
     * @param address contains the address of the place
     * @param phone contains the phone number of the place
     * @param website contains the website of the place
     * @param latitude contains the latitude of the place location
     * @param longitude contains the longitude of the place location
     * @param resourceId contains the desired image
     */
    public Place(String name, String description,String address, String phone, String website, double latitude, double longitude, int resourceId) {
        placeName = name;
        placeDescription = description;
        placeAddress = address;
        placePhone = phone;
        placeWebsite = website;
        placeLatitude = latitude;
        placeLongitude = longitude;
        placeImage = resourceId;
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
    public String getPlaceAddress() {
        return placeAddress;
    }

    /**
     * Get the phone of the place.
     */
    public String getPlacePhone() {
        return placePhone;
    }

    /**
     * Get the phone of the place.
     */
    public String getPlaceWebsite() {
        return placeWebsite;
    }

    /**
     * Get the Latitude of the place.
     */
    public double getPlaceLatitude() {
        return placeLatitude;
    }

    /**
     * Get the Longitude of the place.
     */
    public double getPlaceLongitude() {
        return placeLongitude;
    }

    /**
     * Get the Miwok image.
     */
    public int getPlaceImage() {
        return placeImage;
    }

}

