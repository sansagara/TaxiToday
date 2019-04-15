package com.leonelatencio.taxitoday.REST;

import okhttp3.OkHttpClient.Builder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitMapClient {
    private static final String API_URL = "https://maps.googleapis.com/maps/";
    private static RetrofitMaps MAPS_REST_CLIENT;

    static {
        setupRestClient();
    }

    private RetrofitMapClient() {
    }

    public static RetrofitMaps get() {
        return MAPS_REST_CLIENT;
    }

    private static void setupRestClient() {
        Builder httpClient = new Builder();
        MAPS_REST_CLIENT = (RetrofitMaps) new Retrofit.Builder().baseUrl(API_URL).addConverterFactory(GsonConverterFactory.create()).client(httpClient.build()).build().create(RetrofitMaps.class);
    }
}
