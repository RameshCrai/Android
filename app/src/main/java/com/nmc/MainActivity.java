package com.nmc;

import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private Button buttonAbsolute, buttonSum, buttonLinear,
            buttonRelative, buttonTable, buttonParse,
            buttonConstraint,buttonFrage, btnOptMenu, btnContMenu,
    buttonPopup, buttonDialog, buttonLview, buttonCview,
            buttonRview, btndatabase, googleBtn;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        buttonAbsolute = findViewById(R.id.buttonAbsolute);
        buttonSum = findViewById(R.id.buttonSum);
        buttonLinear = findViewById(R.id.buttonLinear);
        buttonRelative = findViewById(R.id.buttonRelative);
        buttonTable = findViewById(R.id.buttonTable);
        buttonParse = findViewById(R.id.buttonParsingValue);
        buttonConstraint = findViewById(R.id.buttonConstraint);
        buttonFrage = findViewById(R.id.buttonFragement);
        btnOptMenu = findViewById(R.id.buttonOptionMenu);
        btnContMenu = findViewById(R.id.buttonContextMenu);
        buttonPopup = findViewById(R.id.buttonPopupMenu);
        buttonDialog = findViewById(R.id.buttonDialogBox);
        buttonLview = findViewById(R.id.buttonListView);
//        buttonGview = findViewById(R.id.buttonGrideView);
        buttonCview = findViewById(R.id.buttonCustome);
        buttonRview = findViewById(R.id.buttonRecyclerView);
        btndatabase = findViewById(R.id.buttonDatabase);
        googleBtn = findViewById(R.id.googlemap);


        buttonLinear.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LinearLayout.class);
            startActivity(intent);
        });


        buttonTable.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TableLayout.class);
            startActivity(intent);
        });

        buttonConstraint.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
            startActivity(intent);
        });

        buttonRelative.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
            startActivity(intent);
        });


        // Set click listeners
        buttonAbsolute.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AbsoluteLayout.class);
            startActivity(intent);
        });

        buttonSum.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CalculateSum.class);
            startActivity(intent);
        });

        buttonParse.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ParseActivityOne.class);
            startActivity(intent);
        });
        buttonFrage.setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, FragementDemoActivity.class);
            startActivity(intent);
        });
        btnOptMenu.setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, OptionMenu.class);
            startActivity(intent);
        });
        btnContMenu.setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, ContextMenuExample.class);
            startActivity(intent);
        });

        buttonPopup.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PopupMenuExample.class);
            startActivity(intent);
        });

        buttonDialog.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, dialogueExample.class);
            startActivity(intent);
        });


        buttonLview.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, listViewExample.class);
            startActivity(intent);
        });


        buttonCview.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CustomListViewExample.class);
            startActivity(intent);
        });


        buttonRview.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RecyclerViewExample.class);
            startActivity(intent);
        });

        btndatabase.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DatabaseActivity.class);
            startActivity(intent);
        });

        googleBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        });

    }
}
