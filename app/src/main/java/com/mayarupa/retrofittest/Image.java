package com.mayarupa.retrofittest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by reza on 03/01/18.
 */

public class Image {
    @SerializedName("title")
    private String Name;

    @SerializedName("thumbnailUrl")
    private String ImageUrl;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUrl() {
        return ImageUrl;
    }

    public void setUrl(String url) {
        this.ImageUrl = url;
    }
}
