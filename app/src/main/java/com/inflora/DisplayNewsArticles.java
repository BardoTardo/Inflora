package com.inflora;

import android.os.Bundle;

import com.inflora.databinding.ActivityDisplayNewsArticlesBinding;

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