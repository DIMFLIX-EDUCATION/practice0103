package com.example.sprint1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

    }

    public void goNext(View view) {
        if (!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
            Intent intent = new Intent(MainActivity.this, MainPage.class);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}