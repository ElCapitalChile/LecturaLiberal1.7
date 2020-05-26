package com.elcapitalchile.lecturaliberal;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash_screen);

    }
    public static Integer SPLASH_TIME_OUT =4000;
    //PUTO EL QUE LEE

    @Override
    protected void onStart() {

        super.onStart();
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent =new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent); finish();




            }
        },SPLASH_TIME_OUT);


    }
    @Override
    protected void onResume() {
        super.onResume();



    }
    @Override
    protected void onPause() {
        super.onPause();

    }
    @Override
    protected void onStop() {
        super.onStop();
        SPLASH_TIME_OUT=700;



    }

    @Override
    protected void onRestart() {
        super.onRestart();


    }
}
