package com.example.coronavirus.services;

import com.example.coronavirus.model.MyCountryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface MyCountryServices {

    @GET()
    Call<MyCountryModel> getAllCountriesInformation(@Url String allCountiesUrl);
}


