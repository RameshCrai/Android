package com.nmc;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LabOne extends AppCompatActivity {
    Button question2, question3, question4, question5, question6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_one);

        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        question4 = findViewById(R.id.question4);
        question5 = findViewById(R.id.question5);
        question6 = findViewById(R.id.question6);

        question2.setOnClickListener(v -> {
            Intent intent = new Intent(LabOne.this, ProfileLab2.class);
            startActivity(intent);
        });

        question3.setOnClickListener(v -> {
            Intent intent = new Intent(LabOne.this, MainActivity.class);
            startActivity(intent);
        });
        question4.setOnClickListener(v -> {
            Intent intent = new Intent(LabOne.this, MessageShow.class);
            startActivity(intent);
        });
        question5.setOnClickListener(v -> {
            Intent intent = new Intent(LabOne.this, UserInputBox.class);
            startActivity(intent);
        });
        question6.setOnClickListener(v -> {
            Intent intent = new Intent(LabOne.this, FirstActivity.class);
            startActivity(intent);
        });


    }
}