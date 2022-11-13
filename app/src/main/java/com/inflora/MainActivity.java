package com.inflora;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.inflora.databinding.ActivityMainBinding;

public class MainActivity extends DrawerBase {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
}