package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void goProductCard(View view) {
        Intent intent = new Intent(MainPage.this, ProductCardActivity.class);
        startActivity(intent);
    }

    public void goCart(View view) {
        Intent intent = new Intent(MainPage.this, CartActivity.class);
        startActivity(intent);
    }

    public void goOutdoor(View view) {
        Intent intent = new Intent(MainPage.this, OutdoorPageActivity.class);
        startActivity(intent);
    }

    public void doSearch(View view) {
        Intent intent = new Intent(MainPage.this, SearchPageActivity.class);
        intent.putExtra("Search_value", ((EditText) findViewById(R.id.search_value)).getText().toString());
        startActivity(intent);
    }

    public void goFavorite(View view) {
        Intent intent = new Intent(MainPage.this, FavoritePageActivity.class);
        startActivity(intent);
    }

    public void goPopular(View view) {
        Intent intent = new Intent(MainPage.this, PopularPageActivity.class);
        startActivity(intent);
    }
}