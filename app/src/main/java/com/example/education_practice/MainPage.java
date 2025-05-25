package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void goOutdoor(View view) {
        Intent intent = new Intent(MainPage.this, OutdoorPageActivity.class);
        startActivity(intent);
    }

    public void goPopular(View view) {
        Intent intent = new Intent(MainPage.this, PopularPageActivity.class);
        startActivity(intent);
    }
}