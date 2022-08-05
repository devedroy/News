package com.example.news.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.news.databinding.NewsLayoutBinding;
import com.example.news.models.News;

import java.util.List;

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.HomeScreenViewHolder> {

    private Context context;
    private List<News> newsList;

    public HomeScreenAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public HomeScreenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeScreenViewHolder(NewsLayoutBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeScreenViewHolder holder, int position) {
        holder.newsLayoutBinding.tvNewsTitle.setText(newsList.get(position).getArticles().get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        if (newsList != null)
            return newsList.size();
        else
            return 0;
    }

    public class HomeScreenViewHolder extends RecyclerView.ViewHolder {
        private NewsLayoutBinding newsLayoutBinding;

        public HomeScreenViewHolder(@NonNull NewsLayoutBinding newsLayoutBinding) {
            super(newsLayoutBinding.getRoot());
            this.newsLayoutBinding = newsLayoutBinding;
        }
    }
}
