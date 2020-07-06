package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Location_Activity extends AppCompatActivity {


    Spinner countries_sp;
    String shareFileName = "share";
    String key = "key";
    Button ok_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_);

        checkCountry();

        countries_sp = findViewById(R.id.countries_sp);
        ok_btn = findViewById(R.id.ok_btn);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.countries, R.layout.support_simple_spinner_dropdown_item);
        countries_sp.setAdapter(adapter);


        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String country = countries_sp.getSelectedItem().toString();
                saveToSharedPreferences(country);
            }
        });


    }

    void checkCountry() {

        SharedPreferences sharedPreferences = getSharedPreferences(shareFileName, MODE_PRIVATE);
        String country = sharedPreferences.getString(key, "default");
        Toast.makeText(this, "" + country, Toast.LENGTH_LONG).show();
        /*if (!country.equals("default")) {
            Toast.makeText(this, "Not", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }
        else {
            Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show();
        }
*/
    }

    private void saveToSharedPreferences(String country) {

        SharedPreferences sharedPreferences = getSharedPreferences(shareFileName, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, country);
    }
}