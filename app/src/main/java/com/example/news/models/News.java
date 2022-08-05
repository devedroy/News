package com.example.news.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class News {

    @Expose
    @SerializedName("articles")
    private List<ArticlesEntity> articles;
    @Expose
    @SerializedName("totalResults")
    private int totalresults;
    @Expose
    @SerializedName("status")
    private String status;

    public List<ArticlesEntity> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesEntity> articles) {
        this.articles = articles;
    }

    public int getTotalresults() {
        return totalresults;
    }

    public void setTotalresults(int totalresults) {
        this.totalresults = totalresults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ArticlesEntity {
        @Expose
        @SerializedName("content")
        private String content;
        @Expose
        @SerializedName("publishedAt")
        private String publishedat;
        @Expose
        @SerializedName("urlToImage")
        private String urltoimage;
        @Expose
        @SerializedName("url")
        private String url;
        @Expose
        @SerializedName("description")
        private String description;
        @Expose
        @SerializedName("title")
        private String title;
        @Expose
        @SerializedName("author")
        private String author;
        @Expose
        @SerializedName("source")
        private SourceEntity source;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPublishedat() {
            return publishedat;
        }

        public void setPublishedat(String publishedat) {
            this.publishedat = publishedat;
        }

        public String getUrltoimage() {
            return urltoimage;
        }

        public void setUrltoimage(String urltoimage) {
            this.urltoimage = urltoimage;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public SourceEntity getSource() {
            return source;
        }

        public void setSource(SourceEntity source) {
            this.source = source;
        }
    }

    public static class SourceEntity {
        @Expose
        @SerializedName("name")
        private String name;
        @Expose
        @SerializedName("id")
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
