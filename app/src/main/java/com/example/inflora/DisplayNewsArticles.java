package com.example.inflora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.inflora.databinding.ActivityDisplayNewsArticlesBinding;

public class DisplayNewsArticles extends DrawerBase {

    ActivityDisplayNewsArticlesBinding activityDisplayNewsArticlesBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDisplayNewsArticlesBinding = ActivityDisplayNewsArticlesBinding.inflate(getLayoutInflater());
        setContentView(activityDisplayNewsArticlesBinding.getRoot());
        allocatedActivityTitle("INFLORA");
    }
}