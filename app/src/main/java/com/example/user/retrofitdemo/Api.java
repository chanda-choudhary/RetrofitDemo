package com.example.user.retrofitdemo;

import android.annotation.TargetApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Chanda on 14/08/2018
 */
public interface Api {

    String BASE_URL="https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
