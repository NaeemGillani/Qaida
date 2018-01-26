package com.example.naeemgillani.qaida;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    ImageView btn1;
    ImageView btn2;
    ImageView btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btn1 = (ImageView) findViewById(R.id.button);
        btn2 = (ImageView)findViewById(R.id.button2);

        btn3 = (ImageView)findViewById(R.id.button3);







        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,DataActivity.class);
                i.putExtra("language","counting");

                startActivity(i);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(HomeActivity.this,DataActivity.class);
                in.putExtra("language","urdu");
                startActivity(in);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inn = new Intent(HomeActivity.this,DataActivity.class);
                inn.putExtra("language","english");
                startActivity(inn);

            }
        });



    }
}
