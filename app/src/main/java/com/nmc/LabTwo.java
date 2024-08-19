package com.nmc;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LabTwo extends AppCompatActivity {
    Button question1, question2, question3, question4, question5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_two);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        question4 = findViewById(R.id.question4);
        question5 = findViewById(R.id.question5);

        question1.setOnClickListener(v->{
            Intent intent = new Intent(LabTwo.this, CalculateSum.class);
            startActivity(intent);
        });
        question2.setOnClickListener(v->{
            Intent intent = new Intent(LabTwo.this, UserData.class);
            startActivity(intent);
        });

        question3.setOnClickListener(v->{
            Intent intent = new Intent(LabTwo.this, SimpleInterest.class);
            startActivity(intent);
        });

        question4.setOnClickListener(v->{
            Intent intent = new Intent(LabTwo.this, FragmentProgram.class);
            startActivity(intent);
        });

        question5.setOnClickListener(v->{
            Intent intent = new Intent(LabTwo.this, OptionMenu.class);
            startActivity(intent);
        });

    }
}