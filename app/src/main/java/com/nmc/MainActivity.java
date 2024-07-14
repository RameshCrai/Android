package com.nmc;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    TextView welcomeText;
    TextView firstNameText;
    TextView lastNameText;
    TextView streamText;
    TextView phoneText;
    TextView bioText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeText = findViewById(R.id.welcomeText);
        firstNameText = findViewById(R.id.firstNameText);
        lastNameText = findViewById(R.id.lastNameText);
        streamText = findViewById(R.id.streamText);
        phoneText = findViewById(R.id.phoneText);
        bioText = findViewById(R.id.bioText);
    }
}