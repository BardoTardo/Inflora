package com.inflora.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.inflora.app.lifestylefragment.TopFragment;
import com.inflora.app.lifestylefragment.CommunityFragment;
import com.inflora.app.lifestylefragment.NewFragment;

public class LifestyleViewPagerAdapter extends FragmentStateAdapter {

    public LifestyleViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TopFragment();
            case 1:
                return new NewFragment();
            case 2:
                return new CommunityFragment();
            default:
                return new TopFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
