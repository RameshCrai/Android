package com.nmc;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class ParseActivityTwo extends AppCompatActivity {

    TextView txtDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parse_two);

        txtDisplay = findViewById(R.id.lblDisplay);
        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        txtDisplay.setText(fname);
    }
}