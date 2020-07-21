package com.example.android.frankfurtcityguide;

public class Attraction {

    // German description of attraction
    private String mAttractionDE;

    // English description of attraction
    private String mAttractionEN;

    /**
     * Constructor
     */
    public Attraction(String attractionDE, String attractionEN) {
        mAttractionDE = attractionDE;
        mAttractionEN = attractionEN;
    }

    /**
     * Get the german attraction description
     */
    public String getmAttractionDE() {
        return mAttractionDE;
    }

    /**
     * Get the english attraction description
     */
    public String getmAttractionEN() {
        return mAttractionEN;
    }
}
