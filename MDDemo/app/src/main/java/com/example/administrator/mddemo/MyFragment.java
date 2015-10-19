package com.example.administrator.mddemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {


    public String mTitle;
    public MyFragment (String title){
        this.mTitle = title;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=    inflater.inflate(R.layout.fragment_layout,container, false);
        TextView tv = (TextView) view.findViewById(R.id.tttt);
        tv.setText(mTitle);
        return view;

    }
}
