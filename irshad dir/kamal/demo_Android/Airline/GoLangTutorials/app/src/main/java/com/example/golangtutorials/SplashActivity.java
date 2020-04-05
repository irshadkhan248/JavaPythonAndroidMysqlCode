package com.example.golangtutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(4000);
                    Intent a=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(a);
                    finish();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

        }).start();
    }
}
