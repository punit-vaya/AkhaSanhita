package com.punit.developer.akha_sanhita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;


public class Splach_Screen extends AppCompatActivity
{

    private final Handler waitHandler =  new Handler();
    private final Runnable waitCallback = new Runnable()
    {
        @Override
        public void run()
        {
            Intent intent = new Intent(Splach_Screen.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach__screen);
        waitHandler.postDelayed(waitCallback,2000);
    }

    @Override
    protected void onDestroy()
    {
        waitHandler.removeCallbacks(waitCallback);
        super.onDestroy();
    }
}
