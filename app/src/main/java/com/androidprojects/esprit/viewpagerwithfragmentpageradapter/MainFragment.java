package com.androidprojects.esprit.viewpagerwithfragmentpageradapter;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dustin0128 on 2018/4/3.
 */
@SuppressLint("ValidFragment")
public class MainFragment extends Fragment {
    private ViewPager viewPager;
    TabsPagerAdapter myAdapter;
    View view;
    FragmentManager f;

    public MainFragment(FragmentManager f) {
        this.f = f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
          view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ViewPager vpPager = (ViewPager) view.findViewById(R.id.viewpager);
        myAdapter = new TabsPagerAdapter(f);
        vpPager.setAdapter(myAdapter);
    }
}
