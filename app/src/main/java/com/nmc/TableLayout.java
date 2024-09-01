package com.nmc;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TableLayout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        Button btndefault = findViewById(R.id.defaultbtn);
        Button btncustom = findViewById(R.id.custombtn);

        btndefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        btncustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSumDialog();
            }
        });
    }

        private void showDialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(TableLayout.this);
            builder.setTitle("Simple Dialog");
            builder.setMessage("This is a simple dialog box. Do you want to proceed?");

            // Set up the buttons
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Do something when user clicks "Yes"
                    Toast.makeText(TableLayout.this, "You clicked Yes", Toast.LENGTH_SHORT).show();
                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Do something when user clicks "No"
                    Toast.makeText(TableLayout.this, "You clicked No", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });

            builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Do something when user clicks "Cancel"
                    Toast.makeText(TableLayout.this, "You clicked Cancel", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });

            // Show the dialog
            builder.show();
    }


    private void openSumDialog() {
        Dialog dialog = new Dialog(TableLayout.this);
        dialog.setContentView(R.layout.dialog_sum);

        EditText etNumber1 = dialog.findViewById(R.id.etNumber1);
        EditText etNumber2 = dialog.findViewById(R.id.etNumber2);
        Button btnCalculate = dialog.findViewById(R.id.btnCalculate);
        TextView tvResult = dialog.findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = etNumber1.getText().toString();
                String num2Str = etNumber2.getText().toString();

                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int sum = num1 + num2;
                    tvResult.setText("Result: " + sum);
                } else {
                    tvResult.setText("Please enter both numbers.");
                }
            }
        });

        dialog.show();
    }
}