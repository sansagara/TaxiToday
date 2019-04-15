package com.leonelatencio.taxitoday.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Distance {
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("value")
    @Expose
    private Double value;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
