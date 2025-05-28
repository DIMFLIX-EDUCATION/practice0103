package com.example.education_practice;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forg_pass);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void click(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder
                .setView(R.layout.popup_check_email)
                .create().show();
    }

    public void onClickExitBtn(View view) {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
        finish();
    }

    public void goToOTR(View view) {
        Intent intent = new Intent(this, OtrLog.class);
        startActivity(intent);
        finish();
    }
}