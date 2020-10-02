package com.example.rep_6_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPlay, btnStop;
    MediaPlayer mediaPlayer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);
        mediaPlayer = MediaPlayer.create(this,R.raw.acdc_back_in_black);
    }



    public void iniciar(View v){
        if (mediaPlayer!=null){
            mediaPlayer.start();
        }


    }
    public void detener(View v){
        if (mediaPlayer!=null){
            mediaPlayer.stop();
        }
    }
}