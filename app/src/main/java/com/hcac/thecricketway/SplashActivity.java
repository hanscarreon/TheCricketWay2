package com.hcac.thecricketway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class SplashActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;
    DataController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        controller = new DataController(this);
        controller.clearContents();
        controller.getTeams();
        controller.getLeagues();
        controller.getGames();

        getData();

    }

    public void getData(){
        countDownTimer = new CountDownTimer(1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if(controller.retrieveTeams() != null && controller.retrieveLeagues() != null && controller.retrieveGames() != null){
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    getData();
                }
            }
        }.start();
    }
}