package com.inflora.app;

import android.os.Bundle;

import androidx.viewpager2.widget.ViewPager2;

import com.example.inflora.R;
import com.example.inflora.databinding.ActivityDisplayLifestyleArticlesBinding;
import com.google.android.material.tabs.TabLayout;

public class DisplayLifestyleArticles extends DrawerBase {

    ActivityDisplayLifestyleArticlesBinding activityDisplayLifestyleArticlesBinding;

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    LifestyleViewPagerAdapter lifestyleViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDisplayLifestyleArticlesBinding = ActivityDisplayLifestyleArticlesBinding.inflate(getLayoutInflater());
        setContentView(activityDisplayLifestyleArticlesBinding.getRoot());
        allocatedActivityTitle("INFLORA");

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.view_pager);
        lifestyleViewPagerAdapter = new LifestyleViewPagerAdapter(this);
        viewPager2.setAdapter(lifestyleViewPagerAdapter);

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