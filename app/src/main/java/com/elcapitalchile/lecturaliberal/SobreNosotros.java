package com.elcapitalchile.lecturaliberal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SobreNosotros extends AppCompatActivity {

    TextView terminos;
    TextView politicas;



    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView( R.layout.activity_sobre_nosotros );


        terminos = findViewById( R.id.txt_terminos );
        terminos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SobreNosotros.this,webviewTerminos.class));
                overridePendingTransition(R.anim.left_in,R.anim.left_out);
                terminos.setEnabled(false);
            }
        });

        politicas = findViewById( R.id.txt_politicas );
        politicas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SobreNosotros.this,webviewPrivacyPolicy.class));
                overridePendingTransition(R.anim.left_in,R.anim.left_out);
                terminos.setEnabled(false);
            }
        });




    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in,R.anim.right_out);

    }



    @Override
    protected void onResume() {
        super.onResume();
        terminos.setEnabled(true);

    }


}
