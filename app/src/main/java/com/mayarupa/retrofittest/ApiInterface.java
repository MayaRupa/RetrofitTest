package com.mayarupa.retrofittest;

import retrofit2.Call;
import retrofit2.http.POST;

import java.util.List;

import retrofit2.http.POST;

/**
 * Created by reza on 03/01/18.
 */

public interface ApiInterface {

    @POST("numbers")
    Call<List<Image>> getImage();
}
