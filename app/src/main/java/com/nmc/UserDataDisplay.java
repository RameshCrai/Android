package com.nmc;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class UserDataDisplay extends AppCompatActivity {
    TextView textViewName, textViewEmail, textViewPhone, textViewAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data_display);

        textViewName = findViewById(R.id.textViewName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewAddress = findViewById(R.id.textViewAddress);

        // Get data from intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        String address = intent.getStringExtra("ADDRESS");

        // Set data to TextViews
        textViewName.setText("Name: " + name);
        textViewEmail.setText("Email: " + email);
        textViewPhone.setText("Phone: " + phone);
        textViewAddress.setText("Address: " + address);
    }
}