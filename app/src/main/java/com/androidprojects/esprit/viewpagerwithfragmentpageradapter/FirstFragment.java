package com.androidprojects.esprit.viewpagerwithfragmentpageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Amal on 27/03/2017.
 */

public class FirstFragment extends Fragment {
    private static FirstFragment mFirstFragment;

    public static FirstFragment getFirstFragment() {
        if(mFirstFragment == null)
            mFirstFragment = new FirstFragment();
        return mFirstFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        getChildFragmentManager();
        return view;
    }
}
