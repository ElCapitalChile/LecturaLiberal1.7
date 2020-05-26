package com.elcapitalchile.lecturaliberal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class AdamSmith extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView( R.layout.activity_adam_smith );


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7249898338272849/1436825979");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        //ca-app-pub-7249898338272849/1436825979

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                startActivity(new Intent(AdamSmith.this,webviewAdamSmith.class));
                overridePendingTransition( R.anim.zoom_back_in,R.anim.zoom_back_out );

                // Code to be executed when the interstitial ad is closed.
            }
        });



        final ImageButton btn = findViewById(R.id.botonLibros1 );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    startActivity(new Intent(AdamSmith.this,webviewAdamSmith.class));
                    overridePendingTransition( R.anim.zoom_back_in,R.anim.zoom_back_out );
                    btn.setEnabled( false );
                }

            }
        });








    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in,R.anim.right_out );


    }


    @Override
    protected void onResume() {
        super.onResume();
        final ImageButton btn = findViewById(R.id.botonLibros1 );
        btn.setEnabled( true );

    }







}
