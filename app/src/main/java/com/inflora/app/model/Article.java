package com.inflora.app.model;

public class Article {
    private String Title;
    private String Content;
    private int Views;
    private String Date;
    private String ImageURL;

    public Article(String title, String content, int views, String date, String imageurl) {
        this.Title = title;
        this.Content = content;
        this.Views = views;
        this.Date = date;
        this.ImageURL = imageurl;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public Article() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public int getViews() {
        return Views;
    }

    public void setViews(int views) {
        this.Views = views;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}
