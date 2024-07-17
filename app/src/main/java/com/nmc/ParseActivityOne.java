package com.nmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class ParseActivityOne extends AppCompatActivity {
    Button btnsend;
    EditText firstName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parse_activityone);

        btnsend = findViewById(R.id.btnSend);
        firstName = findViewById(R.id.txtFirstName);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = firstName.getText().toString();
                Intent intent = new Intent(ParseActivityOne.this,ParseActivityTwo.class);
                intent.putExtra("fname",fname);
                startActivity(intent);
            }
        });
    }
}