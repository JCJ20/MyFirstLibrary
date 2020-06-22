package com.my.application.mylibrary.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my.application.mylibrary.R;

import java.util.Objects;

public class FirstFragment extends Fragment {
    private ViewPager viewPager;
    private View view;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater,container);

        _initialize();

        return view;
    }

    private void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_first,container,false);

    }
    private void _initialize() {
        viewPager = Objects.requireNonNull(getActivity()).findViewById(R.id.viewPagerContainer);
    }

}
