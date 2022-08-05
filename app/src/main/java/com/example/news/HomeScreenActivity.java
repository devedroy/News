package com.example.news;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.news.adapter.HomeScreenAdapter;
import com.example.news.databinding.ActivityHomeScreenBinding;
import com.example.news.models.News;
import com.example.news.viewModel.NewsListViewModel;

import java.util.List;

public class HomeScreenActivity extends AppCompatActivity {

    private ActivityHomeScreenBinding homeScreenBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homeScreenBinding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(homeScreenBinding.getRoot());

        homeScreenBinding.rvNewsHeadings.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        homeScreenBinding.rvNewsHeadings.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

//        List<News> newsList;
//        HomeScreenAdapter adapter = new HomeScreenAdapter(this, newsList);

//        NewsListViewModel listViewModel = new ViewModelProvider(this).get(NewsListViewModel.class);
    }
}