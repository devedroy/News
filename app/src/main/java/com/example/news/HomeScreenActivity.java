package com.example.news;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.news.databinding.ActivityHomeScreenBinding;

public class HomeScreenActivity extends AppCompatActivity {

    private ActivityHomeScreenBinding homeScreenBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homeScreenBinding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(homeScreenBinding.getRoot());

        homeScreenBinding.rvNewsHeadings.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}