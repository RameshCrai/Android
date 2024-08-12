package com.nmc;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomListViewExample extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_example);
        listView=findViewById(R.id.mylist);
        String[] title={
                "Title 1", "Title 2",
                "Title 3", "Title 4"};
        String[] description={
                "This is description 1",
                "This is description 2",
                "This is description 3",
                "This is description 4"
        };

        int[] image={
                //Replace with different images
                R.drawable.sparkling,
                R.drawable.physics,
                R.drawable.datascience,
                R.drawable.voice
        };
        //passing arrays to constructor of MyListAdapter
        MyListAdapter adapter=new MyListAdapter
                (this,title,description,image);
        listView.setAdapter(adapter);


    }
}