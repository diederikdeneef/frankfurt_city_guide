package com.example.android.frankfurtcityguide;

public class ImageCredits {


    private String mImageTitle;
    private String mImageSource;
    private String mImageAuthor;
    private String mImageAuthorURL;
    private String mImageLicense;
    private String mImageLicenseURL;
    private String mImageModifications;

    /**
     * Constructor
     * @param imageTitle title of the image
     * @param imageAuthor author of the image
     * @param imageSource source of the image
     * @param imageLicense license of the image
     */
    public ImageCredits (String imageTitle, String imageSource,
                         String imageAuthor, String imageAuthorURL,
                         String imageLicense, String imageLicenseURL,
                         String imageModifications) {
        mImageTitle = imageTitle;
        mImageSource = imageSource;
        mImageAuthor = imageAuthor;
        mImageAuthorURL = imageAuthorURL;
        mImageLicense = imageLicense;
        mImageLicenseURL = imageLicenseURL;
        mImageModifications = imageModifications;
    }

    /**
     * Get the image title
     */
    public String getImageTitle(){
        return mImageTitle;
    }

    /**
     * Get the image source
     */
    public String getImageSource(){
        return mImageSource;
    }

    /**
     * Get the image author
     */
    public String getImageAuthor(){
        return mImageAuthor;
    }

    /**
     * Get the image author URL
     */
    public String getmImageAuthorURL(){
        return mImageAuthorURL;
    }

    /**
     * Get the image license
     */
    public String getImageLicense(){
        return mImageLicense;
    }

    /**
     * Get the image license URL
     */
    public String getImageLicenseURL(){
        return mImageLicenseURL;
    }

    /**
     * Get the image modifications
     */
    public String getImageModifications(){
        return mImageModifications;
    }
}
