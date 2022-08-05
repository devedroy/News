package com.example.news.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.news.data.MyApi;
import com.example.news.data.RetrofitInstance;
import com.example.news.models.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsListViewModel {
    private MutableLiveData<List<News>> newsList;

    public NewsListViewModel() {
        this.newsList = new MutableLiveData<>();
    }

    public MutableLiveData<List<News>> getNewsListObserver() {
        return newsList;
    }

    public void makeApiCall() {
        MyApi api = RetrofitInstance.getRetrofitClient().create(MyApi.class);

        Call<List<News>> call = api.getNewsList();

        call.enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                newsList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                Log.e("Error: ", t.getMessage().toString());
            }
        });
    }
}
