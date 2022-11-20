package com.inflora.app;

public class ArticleInformation {
    private String Title;
    private String Content;
    private int Views;
    private String Date;

    public ArticleInformation() {
    }

    public ArticleInformation(String title, String content, int views, String date) {
        Title = title;
        Content = content;
        Views = views;
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getViews() {
        return Views;
    }

    public void setViews(int views) {
        Views = views;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
