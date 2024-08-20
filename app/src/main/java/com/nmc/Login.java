package com.nmc;

import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Login extends AppCompatActivity {
    MyDatabaseHelper db;
    EditText edtLoginEmail, edtLoginPhone;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new MyDatabaseHelper(this);
        edtLoginEmail = findViewById(R.id.edtLoginEmail);
        edtLoginPhone = findViewById(R.id.edtLoginPhone);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtLoginEmail.getText().toString();
                String phone = edtLoginPhone.getText().toString();

                if (email.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(Login.this, "Please Fill Email and Phone ??", Toast.LENGTH_SHORT).show();
                } else {
                    Cursor res = db.getUser(email, phone);
                    if (res != null && res.getCount() > 0) {
                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, Dashboard.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}