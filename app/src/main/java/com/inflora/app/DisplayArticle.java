package com.inflora.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.inflora.R;
import com.squareup.picasso.Picasso;

public class DisplayArticle extends AppCompatActivity {

    private TextView articleTitle, articleDate, articleViews, articleContent;
    private ImageView articleImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_article);

        articleTitle = findViewById(R.id.articleTitle);
        articleDate = findViewById(R.id.articleDate);
        articleViews = findViewById(R.id.articleViews);
        articleContent = findViewById(R.id.articleContent);
        articleImage = findViewById(R.id.articleImage);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String date = intent.getStringExtra("date");
        String views = intent.getStringExtra("views");
        String content = intent.getStringExtra("content");
        String imgUrl = intent.getStringExtra("imgUrl");

        articleTitle.setText(title);
        articleDate.setText(date);
        articleViews.setText(views);
        articleContent.setText(content);

        Picasso.get().load(imgUrl).placeholder(R.mipmap.ic_launcher).into(articleImage);
    }
}