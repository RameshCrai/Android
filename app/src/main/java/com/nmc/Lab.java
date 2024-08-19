package com.nmc;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Lab extends AppCompatActivity {

    Button labbtn1, labbtn2, labbtn3, labbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);

        labbtn1 = findViewById(R.id.lab1);
        labbtn2 = findViewById(R.id.lab2);
        labbtn3 = findViewById(R.id.lab3);
        labbtn4 = findViewById(R.id.lab4);

        labbtn1.setOnClickListener(v -> {
            Intent intent = new Intent(Lab.this, LabOne.class);
            startActivity(intent);
        });

        labbtn2.setOnClickListener(v -> {
            Intent intent = new Intent(Lab.this, LabTwo.class);
            startActivity(intent);
        });

        labbtn3.setOnClickListener(v -> {
            Intent intent = new Intent(Lab.this, LabThree.class);
            startActivity(intent);
        });

        labbtn4.setOnClickListener(v -> {
            Intent intent = new Intent(Lab.this, LabFour.class);
            startActivity(intent);
        });
    }
}
