package com.example.coronavirus.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coronavirus.model.MyCountryModel;
import com.example.coronavirus.R;



public class CountryFragment extends Fragment {

    public CountryFragment() {
        // Required empty public constructor
    }

    public static CountryFragment getInstance(MyCountryModel myCountryModel){

        Bundle bundle = new Bundle();
        bundle.putSerializable("countryModel", myCountryModel);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        return countryFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_country, container, false);

        MyCountryModel myCountryModel = (MyCountryModel) getArguments().getSerializable("countryModel");

        return view;
    }
}
