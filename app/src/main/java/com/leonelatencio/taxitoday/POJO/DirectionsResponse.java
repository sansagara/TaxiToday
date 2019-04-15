package com.leonelatencio.taxitoday.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class DirectionsResponse {
    @SerializedName("routes")
    @Expose
    private List<Route> routes = new ArrayList();

    public List<Route> getRoutes() {
        return this.routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
