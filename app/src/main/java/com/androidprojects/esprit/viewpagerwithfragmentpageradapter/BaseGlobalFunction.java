package com.androidprojects.esprit.viewpagerwithfragmentpageradapter;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;


public class BaseGlobalFunction {
    public static void replaceFragment(Context context, int layout, Fragment fragment) {
        ((Activity)context).getFragmentManager()
                .beginTransaction()
                .addToBackStack(null)//按下返回鍵會回到上一個Fragment
                .replace(layout,fragment)
                .commit();
    }
}