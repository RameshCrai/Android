package com.nmc;

import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private Button buttonAbsolute, buttonSum, buttonLinear,
            buttonRelative, buttonTable, buttonParse, buttonConstraint,buttonFrage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        buttonAbsolute = findViewById(R.id.buttonAbsolute);
        buttonSum = findViewById(R.id.buttonSum);
        buttonLinear = findViewById(R.id.buttonLinear);
        buttonRelative = findViewById(R.id.buttonRelative);
        buttonTable = findViewById(R.id.buttonTable);
        buttonParse = findViewById(R.id.buttonParsingValue);
        buttonConstraint = findViewById(R.id.buttonConstraint);
        buttonFrage = findViewById(R.id.buttonFragement);


        buttonLinear.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LinearLayout.class);
            startActivity(intent);
        });


        buttonTable.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TableLayout.class);
            startActivity(intent);
        });

        buttonConstraint.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
            startActivity(intent);
        });

        buttonRelative.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
            startActivity(intent);
        });


        // Set click listeners
        buttonAbsolute.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AbsoluteLayout.class);
            startActivity(intent);
        });

        buttonSum.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CalculateSum.class);
            startActivity(intent);
        });

        buttonParse.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ParseActivityOne.class);
            startActivity(intent);
        });
        buttonFrage.setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, FragementDemoActivity.class);
            startActivity(intent);
        });
    }
}
