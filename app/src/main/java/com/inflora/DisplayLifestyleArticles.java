package com.inflora;

import android.os.Bundle;

import com.inflora.databinding.ActivityDisplayLifestyleArticlesBinding;

public class DisplayLifestyleArticles extends DrawerBase {

    ActivityDisplayLifestyleArticlesBinding activityDisplayLifestyleArticlesBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDisplayLifestyleArticlesBinding = ActivityDisplayLifestyleArticlesBinding.inflate(getLayoutInflater());
        setContentView(activityDisplayLifestyleArticlesBinding.getRoot());
        allocatedActivityTitle("INFLORA");
    }
}