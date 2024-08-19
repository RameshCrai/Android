package com.nmc;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    private TextView displayName,displayEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayName = findViewById(R.id.display_name);
        displayEmail = findViewById(R.id.display_email);

        // Get the Intent that started this activity
        Intent intent = getIntent();

        // Retrieve the data from the Intent
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");

        // Display the data
        displayName.setText("Name: " + name);
        displayEmail.setText("Email: " + email);
    }
}