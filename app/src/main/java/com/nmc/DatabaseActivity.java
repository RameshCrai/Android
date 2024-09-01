package com.nmc;


import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class DatabaseActivity extends AppCompatActivity {
    EditText edtId,edtName,edtAddress;
    Button btnInsert,btnSelect,btnUpdate,btnDelete;
    TextView txtrestult;
    MyDbHelper myDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        myDbHelper=new MyDbHelper(this);
        btnInsert = findViewById(R.id.btnInsert);
        edtId = findViewById(R.id.edtId);
        edtName = findViewById(R.id.edtName);
        edtAddress = findViewById(R.id.edtAddress);
        btnSelect = findViewById(R.id.btnSelect);
        txtrestult = findViewById(R.id.txtData);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDbHelper.insertData(Integer.parseInt(edtId.getText().toString()),edtName.getText().toString(),edtAddress.getText().toString());
                Toast.makeText(getApplicationContext(),"Data Inserted Successfully !", Toast.LENGTH_SHORT).show();
            }
        });


        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor = myDbHelper.selectData();

                StringBuilder stringBuilder = new StringBuilder();

                if (cursor.moveToFirst()) {
                    do {
                        // Retrieve data from cursor
                        int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                        String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                        String address = cursor.getString(cursor.getColumnIndexOrThrow("address"));

                        // Append data to stringBuilder
                        stringBuilder.append("ID: ").append(id).append("\n");
                        stringBuilder.append("Name: ").append(name).append("\n");
                        stringBuilder.append("Address: ").append(address).append("\n\n");
                    } while (cursor.moveToNext());
                }

                // Close the cursor to release resources
                cursor.close();

                // Display the data in the TextView
                txtrestult.setText(stringBuilder.toString());

            }
        });
    }
}