package com.nmc;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DisplaySi extends AppCompatActivity {
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_si);

        textViewResult = findViewById(R.id.textViewResult);

        // Get data from intent
        Intent intent = getIntent();
        double simpleInterest = intent.getDoubleExtra("SIMPLE_INTEREST", 0);

        // Set data to TextView
        textViewResult.setText("Simple Interest: " + simpleInterest);
    }
}