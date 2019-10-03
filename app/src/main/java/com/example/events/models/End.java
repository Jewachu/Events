
package com.example.events.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class End {

    @SerializedName("timezone")
    @Expose
     String timezone;
    @SerializedName("local")
    @Expose
     String local;
    @SerializedName("utc")
    @Expose
     String utc;

    /**
     * No args constructor for use in serialization
     * 
     */
    public End() {
    }

    /**
     * 
     * @param timezone
     * @param utc
     * @param local
     */
    public End(String timezone, String local, String utc) {
        super();
        this.timezone = timezone;
        this.local = local;
        this.utc = utc;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }



}
