package com.example.quiz1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    public static int count;
    private Button mBtnCounter;
    private TextView mStatus;
    private Button mTrue1;
    private Button mTrue2;
    private Button mTrue3;
    private Button mTrue4;
    private Button mTrue5;
    private SharePreferenceManager mSharePreferenceManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrue1 = findViewById(R.id.true1);
        mTrue2 = findViewById(R.id.true2);
        mTrue3 = findViewById(R.id.true3);
        mTrue4 = findViewById(R.id.true4);
        mTrue5 = findViewById(R.id.true5);
        mBtnCounter = findViewById(R.id.btnCounter);
        mSharePreferenceManager = new SharePreferenceManager(this);

        mBtnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

         Intent intent=new Intent(MainActivity.this, ResultActivity.class);
intent.putExtra("key1","5");
                    startActivity(intent);



                }
            });

        }
    protected void onResume() {
        super.onResume();
        initViews();
        

    }
    public void initViews(){
        String  userAnswerCounter=mSharePreferenceManager.read(ResultActivity.USER_RESULT);

        if(userAnswerCounter!=null){
            mStatus.setText(Integer.toString(MainActivity.count));
        }
        else{
            mStatus.setText(R.string.non_existing_last_result);
        }
    }


    public void login(View view){
        if(view.getId()==R.id.true1){
            count++;
        }
        if(view.getId()==R.id.true2){
            count++;
        }
        if(view.getId()==R.id.true3){
            count++;
        }
        if(view.getId()==R.id.true4){
            count++;
        }
        if(view.getId()==R.id.true5){
            count++;
        }

    }

    }
