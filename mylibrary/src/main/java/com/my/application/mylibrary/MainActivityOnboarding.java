package com.my.application.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.my.application.mylibrary.Adapter.OnboardingAdapter;

public class MainActivityOnboarding extends AppCompatActivity {
    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_onboarding);

        initializeFragments();
        initVariables();
    }
    private void initializeFragments() {
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    private void initVariables() {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

}
