package com.example.enelson.tourguide;

/**
 * {@link Location} represents location information.
 * It includes name, description and an option image file for that location.
 */

public class Location {

    /** String resource ID for the name of a location */
    private int mLocationNameId;

    /** String resource ID for the description of a location*/
    private int mLocationDescriptionId;

    /** Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no images was provided for this word*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object
     *
     * @param locationNameId is the string resource ID for the name of a location
     * @param locationDescriptionId is the string resource ID for the description of a location
     * @param imageResourceId is the image resource ID for the image associated with a location
     *
     */

    public Location(int locationNameId, int locationDescriptionId, int imageResourceId){
        mLocationNameId = locationNameId;
        mLocationDescriptionId = locationDescriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Location object
     *
     * @param locationNameId is the string resource ID for the name of a location
     * @param locationDescriptionId is the string resource ID for the description of a location
     *
     */

    public Location(int locationNameId, int locationDescriptionId){
        mLocationNameId = locationNameId;
        mLocationDescriptionId = locationDescriptionId;
    }

    /**
     * Get the string resource ID for the location name.
     */
    public int getLocationNameId(){
        return mLocationNameId;
    }

    /**
     * Get the string resource ID for the location description.
     */
    public int getLocationDescriptionId(){
        return mLocationDescriptionId;
    }

    /**
     * Get the image resource ID for the location.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns boolean indicating whether there is an image or not for the word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
