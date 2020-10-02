package com.example.eva1_6_navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RedFragment extends Fragment {
    String sCade ="";
    int iVal=0;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sCade = getArguments().getString("PRUEBA");
        iVal = RedFragmentArgs.fromBundle(getArguments()).getMiValor();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textVwDatos = view.findViewById(R.id.txVwDatos);
        //textVwDatos.setText(sCade);
        textVwDatos.setText(iVal + "");
    }
}