package com.leonelatencio.taxitoday.REST;

import okhttp3.OkHttpClient.Builder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUSDClient {
    private static final String API_URL = "https://s3.amazonaws.com/dolartoday/";
    private static RetrofitUSD USD_REST_CLIENT;

    static {
        setupRestClient();
    }

    private RetrofitUSDClient() {
    }

    public static RetrofitUSD get() {
        return USD_REST_CLIENT;
    }

    private static void setupRestClient() {
        Builder httpClient = new Builder();
        USD_REST_CLIENT = (RetrofitUSD) new Retrofit.Builder().baseUrl(API_URL).addConverterFactory(GsonConverterFactory.create()).client(httpClient.build()).build().create(RetrofitUSD.class);
    }
}
