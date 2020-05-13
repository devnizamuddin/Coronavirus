package com.example.coronavirus.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coronavirus.model.CountryModel;
import com.example.coronavirus.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryFragment extends Fragment {

    public CountryFragment() {
        // Required empty public constructor
    }

    public static CountryFragment getInstance(CountryModel countryModel){

        Bundle bundle = new Bundle();
        bundle.putSerializable("countryModel",countryModel);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        return countryFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_country, container, false);

        CountryModel countryModel = (CountryModel) getArguments().getSerializable("countryModel");

        return view;
    }
}
