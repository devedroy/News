package com.example.news.models;

public class News {
    String newsTitle;
    String newsContent;
    String newsImageUrl;

    public News(String newsTitle, String newsContent, String newsImageUrl) {
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newsImageUrl = newsImageUrl;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public String getNewsImageUrl() {
        return newsImageUrl;
    }
}
