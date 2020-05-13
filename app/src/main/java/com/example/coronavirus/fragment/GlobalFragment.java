package com.example.coronavirus.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coronavirus.model.GlobalModel;
import com.example.coronavirus.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GlobalFragment extends Fragment {

    public GlobalFragment() {
        // Required empty public constructor
    }

    public static GlobalFragment getInstance(GlobalModel globalModel){

        Bundle bundle = new Bundle();
        bundle.putSerializable("globalModel",globalModel);
        GlobalFragment globalFragment = new GlobalFragment();
        globalFragment.setArguments(bundle);
        return globalFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_global, container, false);

        GlobalModel globalModel = (GlobalModel) getArguments().getSerializable("globalModel");
        return view;
    }
}
