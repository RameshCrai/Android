package com.nmc;

import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class PopupMenuExample extends AppCompatActivity {
    Button btnPup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        btnPup = findViewById(R.id.buttonPopup);
        btnPup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    private void showPopupMenu(View view) {
        // Create a PopupMenu
        PopupMenu popupMenu = new PopupMenu(this, view);
        // Inflate the menu from XML
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());
        // Handle menu item clicks

           popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    int id = item.getItemId();
                    if (id == R.id.action_edit) {
                        Toast.makeText(PopupMenuExample.this, "Edit clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    } else if (id == R.id.action_delete) {
                        Toast.makeText(PopupMenuExample.this, "Delete clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    } else if (id == R.id.action_share) {
                        Toast.makeText(PopupMenuExample.this, "Share clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                    return false;
                }
            });
        // Show the popup menu
        popupMenu.show();
    }
}
