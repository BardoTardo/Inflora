package com.example.inflora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.inflora.databinding.ActivityDisplayLifestyleArticlesBinding;

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