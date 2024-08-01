package com.nmc;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;

public class FragementDemoActivity extends AppCompatActivity {
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragement_demo);

        btn1 = findViewById(R.id.btnFirst);
        btn2 = findViewById(R.id.btnSecond);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragement1 fragment1 = new Fragement1();  // Corrected to Fragment1
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.myfragmentone, fragment1);
                ft.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragement2 fragment2 = new Fragement2();  // Assuming you want to load Fragment2 here
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.myfragmenttwo, fragment2);
                ft.commit();
            }
        });
    }
}