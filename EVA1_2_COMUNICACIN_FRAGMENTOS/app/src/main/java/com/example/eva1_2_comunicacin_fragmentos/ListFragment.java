package com.example.eva1_2_comunicacin_fragmentos;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

public class ListFragment extends Fragment {

    //Datos de la lista
    String [] datos =  {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Novembre",
            "Diciembre",
            "Enero2",
            "Febrero2",
            "Marzo2",
            "Abril2",
            "Mayo2",
            "Junio2",
            "Julio2"
    };
    MainActivity main;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout)inflater.inflate(R.layout.fragment_list, container, false);
        //Aqui llenamos la lista

        ListView lstVwDatos;
        lstVwDatos = frameLayout.findViewById(R.id.lstVwDatos);
        lstVwDatos.setAdapter(new ArrayAdapter<>(
                main,
                android.R.layout.simple_list_item_1,
                datos
        ));
        //Evento
        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main.onMessageFromFragToMain("LISTA",datos[position]);
            }
        });
        return frameLayout;

    }
}