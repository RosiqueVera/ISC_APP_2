package com.example.rep_5_servicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Intent intentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentService = new Intent(this,MyService.class);


        intentService = new Intent(this, MyService.class);
        BroadcastReceiver receiver = new MainActivity.MyBroadcastReceiver();

        IntentFilter intentFilter = new IntentFilter("MI_SERVICIO");
        registerReceiver(receiver,intentFilter);
    }

    public void start(View v){
        startService(intentService);
    }

    public void stop(View v){
        stopService(intentService);
    }

    class MyBroadcastReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.wtf("MyService","THREAD");
        }
    }
}