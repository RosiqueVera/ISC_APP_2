package com.example.eva1_2_comunicacin_fragmentos;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DataFragment extends Fragment {

    TextView txtVwDatos;
    MainActivity main;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout linearLayout =(LinearLayout)inflater.inflate(R.layout.fragment_data, container, false);

        txtVwDatos = linearLayout.findViewById(R.id.txtVwDatos);

        Button btnDatos = linearLayout.findViewById(R.id.btnData);
        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.onMessageFromFragToMain("DATA","Mensaje del fragmento de datos");
            }
        });

        // Inflate the layout for this fragment
        return linearLayout;
    }

    //Interfaz de comunicación
    public void onMessageFromMainToFragment(String s){
       txtVwDatos.setText(s);
    }
}