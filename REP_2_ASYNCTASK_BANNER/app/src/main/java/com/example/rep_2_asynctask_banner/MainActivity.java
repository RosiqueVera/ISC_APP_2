package com.example.rep_2_asynctask_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    int[] imagenes = {R.drawable.f1, R.drawable.f2, R.drawable.f3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);

        MiClass miClass = new MiClass();


        miClass.execute(1000);

    }


    class MiClass extends AsyncTask<Integer, Integer, Void> {


        @Override
        protected Void doInBackground(Integer... integers) {

            int i = 0;
            while (i <= 2) {
                try {
                    Thread.sleep(integers[0]);
                    publishProgress(imagenes[i]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                i =  i==2 ? 0: i+1;
            }


            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            img.setImageResource(values[0]);
        }


    }
}
