package com.nmc;


import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewExample extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_recycler_view_example);
        recyclerView = findViewById(R.id.recyclerview);
        //creating array
        String[] name = {
                "Ram", "Shyam", "Hari",
                "Gita", "Sita"
        };
        String[] address = {
                "Birtamode", "Kathmandu", "Pokhara",
                "Birtamode", "Kathmandu"
        };
        int[] image = {
                R.drawable.voice, R.drawable.datascience,
                R.drawable.physics, R.drawable.sparkling,
                R.drawable.algorithm
        };
        //setting layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //passing array to Adapter class
        adapter = new RecyclerViewAdapter(this, name, address, image);
        recyclerView.setAdapter(adapter);
    }
}