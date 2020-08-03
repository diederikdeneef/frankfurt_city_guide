package com.example.android.frankfurtcityguide;

public class Attraction {

    // Name of the attraction
    private String mAttractionName;

    // Description of the attraction
    private String mAttractionDescription;

    // Image resource ID
    private int mImageResourceID;

    /**
     * Constructor
     */
    public Attraction(String attractionName, String attractionDescription,
                      int imageResourceId) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mImageResourceID = imageResourceId;
    }

    /**
     * Get the name of the attraction
     */
    public String getmAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the description of the attraction
     */
    public String getmAttractionDescription() {
        return mAttractionDescription;
    }

    /**
     * Get image resource ID
     */
    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
