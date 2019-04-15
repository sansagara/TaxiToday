package com.leonelatencio.taxitoday.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DolarTodayResponse {
    @SerializedName("USD")
    @Expose
    private USD USD;

    public USD getUSD() {
        return this.USD;
    }

    public void setUSD(USD uSD) {
        this.USD = uSD;
    }
}
