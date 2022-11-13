package com.inflora.app;

import android.os.Bundle;

import com.example.inflora.databinding.ActivityMainBinding;

public class MainActivity extends DrawerBase {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
}