package com.nmc;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class listViewExample extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        listView = findViewById(R.id.mylist);
        String[] names = {"Ram","Shyam","Sita","Gita","Rita","Nita","Hari","Pari"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listview_items,R.id.text,names);
        listView.setAdapter(adapter);
    }
}