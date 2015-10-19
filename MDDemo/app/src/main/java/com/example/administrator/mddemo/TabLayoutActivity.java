package com.example.administrator.mddemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewParent;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {


    TabLayout tablayout;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);


        List<String> titles = new ArrayList<>();
        List<Fragment> fragments = new ArrayList<>();

        for (int i=0;i<3;i++){
            titles.add("tab"+i);
            fragments.add(new MyFragment("tab"+i));
        }

        FragmentADp adpater = new FragmentADp(getSupportFragmentManager(),fragments,titles);
        viewpager.setAdapter(adpater);

        tablayout.setupWithViewPager(viewpager);
        tablayout.setTabsFromPagerAdapter(adpater);
    }

}
