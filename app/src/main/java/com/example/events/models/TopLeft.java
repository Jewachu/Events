
package com.example.events.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class TopLeft {

    @SerializedName("x")
    @Expose
     Integer x;
    @SerializedName("y")
    @Expose
    Integer y;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopLeft() {
    }

    /**
     * 
     * @param y
     * @param x
     */
    public TopLeft(Integer x, Integer y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }


}
