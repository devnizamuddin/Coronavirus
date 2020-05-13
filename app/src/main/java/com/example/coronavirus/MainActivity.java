package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coronavirus.model.CountryModel;
import com.example.coronavirus.services.AllCountryServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://corona.lmao.ninja/v2/";
    TextView sample_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sample_text = findViewById(R.id.sample_text);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        AllCountryServices allCountryServices = retrofit.create(AllCountryServices.class);
        Call<List<CountryModel>> getAllCountriesInformation =
                allCountryServices.getAllCountriesInformation("countries");
        getAllCountriesInformation.enqueue(new Callback<List<CountryModel>>() {
            @Override
            public void onResponse(Call<List<CountryModel>> call, Response<List<CountryModel>> response) {
                if (response.code() == 200){

                    List<CountryModel> allCountiesInformaiton = response.body();
                    Toast.makeText(MainActivity.this, ""+allCountiesInformaiton.get(0).getCountry(), Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(MainActivity.this, ""+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<CountryModel>> call, Throwable t) {

                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_LONG).show();
                sample_text.setText(t.getMessage());
            }
        });

        /*WorldServices worldServices = retrofit.create(WorldServices.class);
        Call<GlobalModel> getWorldInformation = worldServices.getWorldInformation("all");
        getWorldInformation.enqueue(new Callback<GlobalModel>() {
            @Override
            public void onResponse(Call<GlobalModel> call, Response<GlobalModel> response) {
                if (response.code() == 200){
                    GlobalModel worldModel = response.body();
                    sample_text.setText(worldModel.getCases().toString());
                }
                else {
                    sample_text.setText(response.code());
                }
            }

            @Override
            public void onFailure(Call<GlobalModel> call, Throwable t) {


                sample_text.setText(t.getMessage());
                Toast.makeText(MainActivity.this, "Error: "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}
