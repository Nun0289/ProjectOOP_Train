package com.example.traintable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.security.PrivateKey;

public class SplashScreen extends AppCompatActivity {
    private Handler objHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent objIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(objIntent);
                finish();
            }
        },2500);
    }
}
