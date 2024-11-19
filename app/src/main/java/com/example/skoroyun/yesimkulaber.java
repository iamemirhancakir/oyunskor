package com.example.skoroyun;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class yesimkulaber extends AppCompatActivity {

    Button b_start, b_main;

    TextView tv_info;

    long startTime, endTime, currentTime, bestTime=10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yesimkulaber);

        b_start = findViewById(R.id.b_start);
        b_main = findViewById(R.id.b_main);

        tv_info= findViewById(R.id.tv_info);

        b_start.setEnabled(true);
        b_main.setEnabled(false);

        tv_info.setText("EN YÜKSEK SKOR: " +bestTime + " ms");

        b_start.setOnClickListener(v -> {
            b_start.setEnabled(false);
            b_main.setText("");

            Handler handler = new Handler();
            handler.postDelayed(() -> {
                startTime=System.currentTimeMillis();
                b_main.setBackgroundColor(
                        ContextCompat.getColor(getApplicationContext(), R.color.blue));
                b_main.setText("DURDUR");
                b_main.setEnabled(true);
            }, 2000);
        });

        b_main.setOnClickListener(v -> {
            endTime=System.currentTimeMillis();
            currentTime=endTime-startTime;
            b_main.setBackgroundColor(
                    ContextCompat.getColor(getApplicationContext(), R.color.red));
            b_main.setText(currentTime + "ms");
            b_start.setEnabled(true);
            b_main.setEnabled(false);

            if (currentTime<bestTime){
                bestTime=currentTime;
                tv_info.setText("EN YÜKSEK SKOR: " +bestTime + " ms");
            }
        });

    }
}