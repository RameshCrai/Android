package com.nmc;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class StudentListview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_listview);

        ListView listview = findViewById(R.id.studentListView);

        String[] students = {"Ramesh","Sanju","kanti","Rohan"};

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,students);
        listview.setAdapter(arrayAdapter);
    }
}