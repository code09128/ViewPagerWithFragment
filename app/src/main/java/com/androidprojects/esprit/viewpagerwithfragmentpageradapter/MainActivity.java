package com.androidprojects.esprit.viewpagerwithfragmentpageradapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseGlobalFunction.replaceFragment(this, R.id.f_c, new MainFragment(getSupportFragmentManager()));
    }
}
