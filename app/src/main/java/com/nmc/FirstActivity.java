package com.nmc;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {
    private EditText inputName,inputEmail;
    private Button sendButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        inputName = findViewById(R.id.input_name);
        inputEmail = findViewById(R.id.input_email);
        sendButton = findViewById(R.id.button_send);

        // Set a click listener on the Send button
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text entered in the input fields
                String name = inputName.getText().toString();
                String email = inputEmail.getText().toString();

                // Create an Intent to start SecondActivity
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // Pass the data to SecondActivity
                intent.putExtra("name", name);
                intent.putExtra("email", email);

                // Start SecondActivity
                startActivity(intent);
            }
        });
    }
}