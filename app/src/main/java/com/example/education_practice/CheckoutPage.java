package com.example.education_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CheckoutPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);
    }

    public void onClickExitBtn(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
        finish();
    }


    public void congratulations(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder
                .setView(R.layout.congratulations)
                .create().show();
    }


    public void returnToMain(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
        finish();
    }
}
