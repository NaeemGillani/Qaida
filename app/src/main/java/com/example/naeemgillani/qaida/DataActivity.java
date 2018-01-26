package com.example.naeemgillani.qaida;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {

    int count_images []={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10};
    int urdu_images []= {R.drawable.b1,R.drawable.bb1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13,R.drawable.b14,R.drawable.b15,R.drawable.b16,R.drawable.b17,R.drawable.b18,R.drawable.b19,R.drawable.b20,R.drawable.b21,R.drawable.b22,R.drawable.b23,R.drawable.b24,R.drawable.b25,R.drawable.b26,R.drawable.b27,R.drawable.b28,R.drawable.b29,R.drawable.b30,R.drawable.b31,R.drawable.b32,R.drawable.b33,R.drawable.b34,R.drawable.b35,R.drawable.b36};
    int english_images []= {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10,R.drawable.c11,R.drawable.c12,R.drawable.c13,R.drawable.c14,R.drawable.c15,R.drawable.c16,R.drawable.c17,R.drawable.c18,R.drawable.c19,R.drawable.c20,R.drawable.c21,R.drawable.c22,R.drawable.c23,R.drawable.c24,R.drawable.c25,R.drawable.c26};
    ImageView hButton;
    ImageView rButton;
    ImageView lButton;
    ImageView iView;
    int counter = 0;
    String lang;
    private final int count_maxcounter = 9;
    private final int urdu_maxcounter = 36;
    private final int english_maxcounter = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        hButton = (ImageView)findViewById(R.id.homebtn);
        rButton=(ImageView)findViewById(R.id.rightBtn);
        lButton=(ImageView)findViewById(R.id.leftbtn);
        iView =(ImageView)findViewById(R.id.imageView);



        Intent i = getIntent();
        lang = i.getStringExtra("language").toString();

        if(lang.equals("counting"))
        {
            iView.setImageResource(count_images[counter]);
        }
        else if(lang.equals("urdu"))
        {
            iView.setImageResource(urdu_images[counter]);
        }
        else if(lang.equals("english"))
        {
            iView.setImageResource(english_images[counter]);
        }







        hButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter++;
                if(lang.equals("counting"))
                {

                    if(counter>(count_maxcounter))
                        counter = 0;
                    iView.setImageResource(count_images[counter]);
                }
                else if(lang.equals("urdu"))
                {

                    if(counter>(urdu_maxcounter))
                        counter = 0;
                    iView.setImageResource(urdu_images[counter]);
                }
                else if(lang.equals("english"))
                {

                    if(counter>(english_maxcounter))
                        counter = 0;
                    iView.setImageResource(english_images[counter]);
                }

            }
        });
        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter--;
                if(lang.equals("counting"))
                {

                    if(counter<0)
                        counter = count_maxcounter;
                    iView.setImageResource(count_images[counter]);
                }
                else if(lang.equals("urdu"))
                {

                    if(counter<0)
                        counter = urdu_maxcounter;
                    iView.setImageResource(urdu_images[counter]);
                }

                else if(lang.equals("english"))
                {

                    if(counter<0)
                        counter = english_maxcounter;
                    iView.setImageResource(english_images[counter]);
                }

            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
