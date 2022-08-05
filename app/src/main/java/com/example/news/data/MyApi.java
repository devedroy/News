package com.example.news.data;

import com.example.news.models.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {

    @GET("everything?q=apple&from=2022-08-04&to=2022-08-04&sortBy=popularity&apiKey=0e788f81ae7e46c18b35187137e2e227")
    Call<List<News>> getNewsList();
}
