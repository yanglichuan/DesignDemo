package com.example.administrator.mddemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class SnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);


        findViewById(R.id.bbb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(findViewById(R.id.bbb),"点击了按钮",Snackbar.LENGTH_LONG);
                snackbar.show();;
                snackbar.setAction("知道了",new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });
            }
        });


    }

}
