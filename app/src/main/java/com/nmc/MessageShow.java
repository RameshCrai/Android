package com.nmc;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MessageShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_show);

        EditText nameInput = findViewById(R.id.name_input);
        Button okButton = findViewById(R.id.ok_button);
        TextView helloMessage = findViewById(R.id.hello_message);

        // Set a click listener on the OK button
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text entered in the EditText
                String name = nameInput.getText().toString();

                // Display the hello message in the TextView
                helloMessage.setText("Hello, " + name + "!");
            }
        });
    }
}