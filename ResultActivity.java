package com.example.quiz1;

import android.app.Activity;


import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;


public class ResultActivity extends Activity {
    public EditText result;
    public static String USER_RESULT="result";
    public SharePreferenceManager mSharedPreferenceManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result=findViewById(R.id.result);
        mSharedPreferenceManager=new SharePreferenceManager(this);
        initViews();

getIntent().getStringExtra("key1");

    }
    private void initViews(){
        String userAnswerCount=mSharedPreferenceManager.read(ResultActivity.USER_RESULT);
        if(userAnswerCount!=null){
            result.setText(userAnswerCount);
        }
    }
}
