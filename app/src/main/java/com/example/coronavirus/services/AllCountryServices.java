package com.example.coronavirus.services;

import com.example.coronavirus.model.CountryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface AllCountryServices {

    @GET()
    Call<List<CountryModel>> getAllCountriesInformation(@Url String allCountiesUrl);
}


