package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SearchPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        Intent intent = getIntent();
        String searchValue = intent.getStringExtra("Search_value");
        ((EditText) findViewById(R.id.search_value)).setText(searchValue);
    }

    public void goMain(View view) {
        Intent intent = new Intent(SearchPageActivity.this, MainPage.class);
        startActivity(intent);
    }

    public void goProductCard(View view) {
        Intent intent = new Intent(SearchPageActivity.this, ProductCardActivity.class);
        startActivity(intent);
    }

    public void doSearch(View view) {
        Intent intent = new Intent(SearchPageActivity.this, SearchPageActivity.class);
        startActivity(intent);
    }
}