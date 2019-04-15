package com.leonelatencio.taxitoday.REST;

import com.leonelatencio.taxitoday.POJO.DirectionsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitMaps {
    @GET("api/directions/json?key=AIzaSyCwKgv00EaiRwjBGvhbSqjcfIMAtDBtWt0")
    Call<DirectionsResponse> getDistanceDuration(@Query("units") String str, @Query("origin") String str2, @Query("destination") String str3, @Query("mode") String str4);
}
