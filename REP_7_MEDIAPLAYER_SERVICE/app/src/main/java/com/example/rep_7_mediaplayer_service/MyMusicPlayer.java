package com.example.rep_7_mediaplayer_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyMusicPlayer extends Service {
    public MyMusicPlayer() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
