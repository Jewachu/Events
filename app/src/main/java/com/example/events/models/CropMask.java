
package com.example.events.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class CropMask {

    @SerializedName("top_left")
    @Expose
    TopLeft topLeft;
    @SerializedName("width")
    @Expose
   Integer width;
    @SerializedName("height")
    @Expose
     Integer height;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CropMask() {
    }

    /**
     * 
     * @param height
     * @param topLeft
     * @param width
     */
    public CropMask(TopLeft topLeft, Integer width, Integer height) {
        super();
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public TopLeft getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(TopLeft topLeft) {
        this.topLeft = topLeft;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}
