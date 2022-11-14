package com.inflora.app;

import android.os.Bundle;

import androidx.viewpager2.widget.ViewPager2;

import com.example.inflora.R;
import com.example.inflora.databinding.ActivityDisplayNewsArticlesBinding;
import com.google.android.material.tabs.TabLayout;

public class DisplayNewsArticles extends DrawerBase {
    ActivityDisplayNewsArticlesBinding activityDisplayNewsArticlesBinding;

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    NewsViewPagerAdapter newsViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDisplayNewsArticlesBinding = ActivityDisplayNewsArticlesBinding.inflate(getLayoutInflater());
        setContentView(activityDisplayNewsArticlesBinding.getRoot());
        allocatedActivityTitle("INFLORA");

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.view_pager);
        newsViewPagerAdapter = new NewsViewPagerAdapter(this);
        viewPager2.setAdapter(newsViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });



    }
}