package com.example.android.frankfurtcityguide;

public class Attraction {

    // German name of the attraction
    private String mAttractionName;

    // Description of the attraction
    private String mAttractionDescription;

    // Address of the attraction
    private String mStreet;
    private String mNumber;
    private String mPostalCode;
    private String mCity;

    // Image resource ID
    private int mImageResourceID;

    /**
     * Constructor
     */
    public Attraction(String attractionName, String attractionDescription,
                      String street, String number, String postalCode, String city,
                      int imageResourceId) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mStreet = street;
        mNumber = number;
        mPostalCode = postalCode;
        mCity = city;
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
     * Get the street address
     */
    public String getmStreet() {
        return mStreet;
    }

    /**
     * Get the address number
     */
    public String getmNumber() {
        return mNumber;
    }

    /**
     *  Get the postal code
     */
    public String getmPostalCode() {
        return mPostalCode;
    }

    /**
     * Get the city
     */
    public String getmCity() {
        return mCity;
    }

    /**
     * Get image resource ID
     */
    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
