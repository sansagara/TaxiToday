package com.leonelatencio.taxitoday.REST;

import com.leonelatencio.taxitoday.POJO.DolarTodayResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitUSD {
    @GET("data.json")
    Call<DolarTodayResponse> getDolarToday();
}
