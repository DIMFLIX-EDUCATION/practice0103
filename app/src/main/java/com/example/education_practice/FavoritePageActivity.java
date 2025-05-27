package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FavoritePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_page);
    }

    public void goMain(View view) {
        Intent intent = new Intent(FavoritePageActivity.this, MainPage.class);
        startActivity(intent);
    }

    public void goProductCard(View view) {
        Intent intent = new Intent(FavoritePageActivity.this, ProductCardActivity.class);
        startActivity(intent);
    }
}