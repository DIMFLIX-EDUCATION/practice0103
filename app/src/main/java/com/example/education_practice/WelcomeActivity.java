package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.education_practice.classes.MyAdapter;

public class WelcomeActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Education_practice);
        getSplashScreen();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        viewPager = findViewById(R.id.pager);
        button = findViewById(R.id.button2);

        FragmentStateAdapter pageAdapter = new MyAdapter(this);
        viewPager.setAdapter(pageAdapter);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == 0) {
                    button.setText("Начать");
                } else {
                    button.setText("Далее");
                }
            }
        });
    }


    public void toNextPage(View view) {

        if (viewPager.getCurrentItem() == 2) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);

    }
}