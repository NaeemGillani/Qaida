package com.example.naeemgillani.qaida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;


public class WelcomeActivity extends AppCompatActivity {

    private final int Splash_Display_Length=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(WelcomeActivity.this,HomeActivity.class);
                WelcomeActivity.this.startActivity(i);
                WelcomeActivity.this.finish();
            }
        },Splash_Display_Length);








    }
}
