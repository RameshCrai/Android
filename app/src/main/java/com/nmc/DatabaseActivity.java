package com.nmc;


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
    TextView txtData;
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

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDbHelper.insertData(Integer.parseInt(edtId.getText().toString()),edtName.getText().toString(),edtAddress.getText().toString());
                Toast.makeText(getApplicationContext(),"Data Inserted Successfully !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}