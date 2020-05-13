package com.example.coronavirus.services;

import com.example.coronavirus.model.GlobalModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WorldServices {

    @GET()
    Call<GlobalModel> getWorldInformation(@Url String worldUrl);
}
