package com.example.administrator.mddemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FragmentADp extends FragmentStatePagerAdapter {

    public List<Fragment> mList = null;
    public List<String> mTitles = null;
    public FragmentADp(FragmentManager manager,List<Fragment> list,List<String> title){
        super(manager);
        this.mList = list;
        this.mTitles = title;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
