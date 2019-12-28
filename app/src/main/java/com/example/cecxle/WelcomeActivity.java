package com.example.cecxle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class WelcomeActivity extends AppCompatActivity {


    private static  int WELCOME_TIME_OUT = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

//How to make text gradient in layout activity? found this
//
//        TextView secondTextView = new TextView(this);
//        Shader textShader=new LinearGradient(0, 0, 0, 20,
//                new int[]{Color.GREEN,Color.BLUE},
//                new float[]{0, 1}, Shader.TileMode.CLAMP);
//        secondTextView.getPaint().setShader(textShader);

        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent mainIntent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(mainIntent);

            }
        },WELCOME_TIME_OUT);
    }
}
