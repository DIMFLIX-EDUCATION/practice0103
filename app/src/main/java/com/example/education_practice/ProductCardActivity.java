package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProductCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_card);
    }

    public void goMain(View view) {
        Intent intent = new Intent(ProductCardActivity.this, MainPage.class);
        startActivity(intent);
    }

    public void goCart(View view) {
        Intent intent = new Intent(ProductCardActivity.this, CartActivity.class);
        startActivity(intent);
    }
}