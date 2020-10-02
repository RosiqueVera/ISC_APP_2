package com.example.eva1_3_frag_din;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarRojo(View v){
        RedFragment redFragment =  new RedFragment();
        FragmentTransaction ft =  getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frmLytFrag,redFragment);
        ft.commit();
    }
    public void mostarAzul(View v){
        BlueFragment blueFragment =  new BlueFragment();
        FragmentTransaction ft =  getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frmLytFrag,blueFragment);
        ft.commit();
    }
}