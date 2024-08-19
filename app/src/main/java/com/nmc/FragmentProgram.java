package com.nmc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_program);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new FirstFragmentLab())
                    .commit();
        }
    }
}