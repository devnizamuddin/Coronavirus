package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coronavirus.model.GlobalModel;
import com.example.coronavirus.model.MyCountryModel;
import com.example.coronavirus.services.MyCountryServices;
import com.example.coronavirus.services.GlobalServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://corona.lmao.ninja/v2/";
    TextView sample_text;
    TextView affected_tv, death_tv, total_affected_tv, total_death_tv, total_recovered_tv;
    Retrofit retrofit;

    Button my_country_btn,global_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sample_text = findViewById(R.id.sample_text);
        affected_tv = findViewById(R.id.affected_tv);
        death_tv = findViewById(R.id.death_tv);
        total_affected_tv = findViewById(R.id.total_affected_tv);
        total_death_tv = findViewById(R.id.total_death_tv);
        total_recovered_tv = findViewById(R.id.total_recovered_tv);
        my_country_btn = findViewById(R.id.my_country_btn);
        global_btn = findViewById(R.id.global_btn);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        getMyCountriesData();


        my_country_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_country_btn.setBackgroundResource(R.drawable.white_button_backround);
                getMyCountriesData();

            }
        });

        global_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getGlobalData();

            }
        });





    }

    private void getGlobalData() {


        GlobalServices globalServices = retrofit.create(GlobalServices.class);
        Call<GlobalModel> getWorldInformation = globalServices.getWorldInformation("all");
        getWorldInformation.enqueue(new Callback<GlobalModel>() {
            @Override
            public void onResponse(Call<GlobalModel> call, Response<GlobalModel> response) {
                if (response.code() == 200){
                    GlobalModel globalModel = response.body();
                    setUpGlobalData(globalModel);
                }
                else {

                }
            }

            @Override
            public void onFailure(Call<GlobalModel> call, Throwable t) {


                sample_text.setText(t.getMessage());
                Toast.makeText(MainActivity.this, "Error: "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setUpGlobalData(GlobalModel globalModel) {

        affected_tv.setText(globalModel.getTodayCases().toString());
        death_tv.setText(globalModel.getTodayDeaths().toString());
        total_affected_tv.setText(globalModel.getCases().toString());
        total_death_tv.setText(globalModel.getDeaths().toString());
        total_recovered_tv.setText(globalModel.getRecovered().toString());

    }

    private void getMyCountriesData() {

        MyCountryServices myCountryServices = retrofit.create(MyCountryServices.class);
        Call<MyCountryModel> getAllCountriesInformation =
                myCountryServices.getAllCountriesInformation("countries/Bangladesh");
        getAllCountriesInformation.enqueue(new Callback<MyCountryModel>() {
            @Override
            public void onResponse(Call<MyCountryModel> call, Response<MyCountryModel> response) {
                if (response.code() == 200) {

                    MyCountryModel myCountryModel = response.body();
                    setMyCountryData(myCountryModel);
                } else {

                    Toast.makeText(MainActivity.this, "" + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MyCountryModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_LONG).show();
                sample_text.setText(t.getMessage());
            }
        });

    }

    private void setMyCountryData(MyCountryModel myCountryModel) {

        affected_tv.setText(myCountryModel.getTodayCases().toString());
        death_tv.setText(myCountryModel.getTodayDeaths().toString());
        total_affected_tv.setText(myCountryModel.getCases().toString());
        total_death_tv.setText(myCountryModel.getDeaths().toString());
        total_recovered_tv.setText(myCountryModel.getRecovered().toString());


    }
}
