
package com.example.events.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Description {

    @SerializedName("text")
    @Expose
     String text;
    @SerializedName("html")
    @Expose
     String html;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param text
     * @param html
     */
    public Description(String text, String html) {
        super();
        this.text = text;
        this.html = html;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }


}
