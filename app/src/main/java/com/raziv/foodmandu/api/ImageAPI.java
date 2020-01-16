package com.raziv.foodmandu.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ImageAPI {

        @FormUrlEncoded
        @POST("image")
        Call<Void> addimage(@Header("Authorization") String token, @Field("image") String image);

    }
