package com.mayarupa.retrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by reza on 03/01/18.
 */

public class ApiClient {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/photos/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if (retrofit == null)
        {
            retrofit =new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
