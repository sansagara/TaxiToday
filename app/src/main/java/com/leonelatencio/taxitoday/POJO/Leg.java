package com.leonelatencio.taxitoday.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leg {
    @SerializedName("distance")
    @Expose
    private Distance distance;
    @SerializedName("duration")
    @Expose
    private Duration duration;

    public Distance getDistance() {
        return this.distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
