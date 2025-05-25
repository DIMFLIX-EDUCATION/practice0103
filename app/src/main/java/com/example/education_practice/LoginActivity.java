package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

    }

    public void goNext(View view) {
        if (!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
            Intent intent = new Intent(LoginActivity.this, MainPage.class);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}