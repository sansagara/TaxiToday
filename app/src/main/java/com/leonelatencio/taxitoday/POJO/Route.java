package com.leonelatencio.taxitoday.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Route {
    @SerializedName("legs")
    @Expose
    private List<Leg> legs = new ArrayList();
    @SerializedName("overview_polyline")
    @Expose
    private OverviewPolyline overviewPolyline;

    public List<Leg> getLegs() {
        return this.legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public OverviewPolyline getOverviewPolyline() {
        return this.overviewPolyline;
    }

    public void setOverviewPolyline(OverviewPolyline overviewPolyline) {
        this.overviewPolyline = overviewPolyline;
    }
}
