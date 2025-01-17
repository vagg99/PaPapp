package com.example.papapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Library extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        if (sharedPreferences.getBoolean("isDarkModeOn", false)) {
            setTheme(R.style.Theme_Dark);
        } else {
            setTheme(R.style.Theme_Light);
        }
        setContentView(R.layout.library);
        ImageButton manage_and_rate = findViewById(R.id.mapActivityButton);
        manage_and_rate.setOnClickListener(view -> {

            Intent intent = new Intent( this, ManageAndRateTextbook.class);

            startActivity(intent);
        });
        ImageButton findReserveTextbook = findViewById(R.id.find_and_reserve_imgview);
        findReserveTextbook.setOnClickListener(view -> {

            Intent intent = new Intent( this, FindReserveTextbook.class);

            startActivity(intent);
        });
        ImageButton librariesMap = findViewById(R.id.searchOnMapButton);
        librariesMap.setOnClickListener(view -> {

            Intent intent = new Intent( this, ShowLibrariesOnMap.class);

            startActivity(intent);
        });

    }
}
