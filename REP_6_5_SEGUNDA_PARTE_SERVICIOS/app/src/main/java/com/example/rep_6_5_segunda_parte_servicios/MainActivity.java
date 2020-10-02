package com.example.rep_6_5_segunda_parte_servicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtreciver);
        BroadcastReceiver receiver = new MainActivity.MyBroadcastReceiver();

        IntentFilter intentFilter = new IntentFilter("MI_SERVICIO");
        registerReceiver(receiver, intentFilter);
    }


    class MyBroadcastReceiver extends BroadcastReceiver {
        private static final String TAG = "MyBroadcastReceiver";

        @Override
        public void onReceive(Context context, Intent intent) {
            textView.append(intent.getStringExtra("ENVIADOS"));
        }
    }
}