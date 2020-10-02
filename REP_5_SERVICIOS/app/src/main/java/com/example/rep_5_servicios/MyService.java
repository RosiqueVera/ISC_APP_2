package com.example.rep_5_servicios;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    Thread thread;
    Intent MyIntent;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.wtf("Mi servicio","OnCreate");



    }

    @Override
    public void onStart(final Intent intent, int startId) {
        super.onStart(intent, startId);

        Log.wtf("Mi servicio","OnStart");

        thread = new Thread(){
            @Override
            public void run() {
                super.run();

                while (true){
                    try {
                        Thread.sleep(1000);
                        //Log.wtf("MyService","THREAD");

                        MyIntent = new Intent("MI_SERVICIO");
                                //MyIntent.putExtra
                        sendBroadcast(MyIntent);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };
        thread.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.wtf("Mi servicio","OnDestroy");
        thread.interrupt();
    }
}
