package com.leonelatencio.taxitoday.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Duration {
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("value")
    @Expose
    private Integer value;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
