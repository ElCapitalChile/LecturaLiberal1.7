package com.elcapitalchile.lecturaliberal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class JuanBautistaAlberdi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juan_bautista_alberdi);


        final ImageButton btn = findViewById(R.id.botonLibros1 );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JuanBautistaAlberdi.this,webviewJuanBautistaAlberdi.class));
                overridePendingTransition( R.anim.zoom_back_in,R.anim.zoom_back_out );
                btn.setEnabled( false );
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
