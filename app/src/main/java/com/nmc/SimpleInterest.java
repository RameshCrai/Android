package com.nmc;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SimpleInterest extends AppCompatActivity {
    EditText editTextPrincipal, editTextRate, editTextTime;
    Button buttonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        editTextPrincipal = findViewById(R.id.editTextPrincipal);
        editTextRate = findViewById(R.id.editTextRate);
        editTextTime = findViewById(R.id.editTextTime);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double principal = Double.parseDouble(editTextPrincipal.getText().toString());
                    double rate = Double.parseDouble(editTextRate.getText().toString());
                    double time = Double.parseDouble(editTextTime.getText().toString());

                    double simpleInterest = (principal * rate * time) / 100;

                    Intent intent = new Intent(SimpleInterest.this, DisplaySi.class);
                    intent.putExtra("SIMPLE_INTEREST", simpleInterest);
                    startActivity(intent);
                } catch (NumberFormatException e) {
                    Toast.makeText(SimpleInterest.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}