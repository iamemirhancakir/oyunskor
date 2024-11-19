package com.example.skoroyun;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_taskagitmakas).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, taskagitmakas.class);
            startActivity(intent);
        });

        findViewById(R.id.button_yesimkulaber).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, yesimkulaber.class);
            startActivity(intent);
        });


    }
}