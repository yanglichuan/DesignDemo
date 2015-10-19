package com.example.administrator.mddemo;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CoordiActivity extends AppCompatActivity {

    CoordinatorLayout home;
    FloatingActionButton btt;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordi);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.cc);
        collapsingToolbarLayout.setTitle("ylc");

        home = (CoordinatorLayout) findViewById(R.id.home);
        btt = (FloatingActionButton) findViewById(R.id.btt);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(home,"haha",Snackbar.LENGTH_LONG).setAction("open",null).show();
            }
        });


    }
}
