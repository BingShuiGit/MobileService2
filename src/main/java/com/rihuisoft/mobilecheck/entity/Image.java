package com.rihuisoft.mobilecheck.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by rihui on 2016/5/17.
 */
@XmlRootElement(name = "Image")
public class Image {
    private int imageId;
    private int imageType;
    private String imageName;
    private String imageDescribe;
    private String imageUrl;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageType() {
        return imageType;
    }

    public void setImageType(int imageType) {
        this.imageType = imageType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageDescribe() {
        return imageDescribe;
    }

    public void setImageDescribe(String imageDescribe) {
        this.imageDescribe = imageDescribe;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
