package com.inceptionteam.UI;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.inceptionteam.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        timer();
    }
    private void timer(){
        new Handler(  ).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent( getApplicationContext(), MainActivity.class );
                startActivity( intent );

                finish();
            }
        },1500 );
    }
}