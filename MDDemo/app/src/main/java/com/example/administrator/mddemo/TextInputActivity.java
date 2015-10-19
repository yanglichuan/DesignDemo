package com.example.administrator.mddemo;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class TextInputActivity extends AppCompatActivity {


    private TextInputLayout inputLayout;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testinput);

        inputLayout = (TextInputLayout) findViewById(R.id.inputlayout);
        inputLayout.setHint("请输入用户名");
        editText = (EditText) findViewById(R.id.eee);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 10){
                    inputLayout.setError("用户名字不能超过10");
                    inputLayout.setErrorEnabled(true);
                }else{
                    inputLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

}
