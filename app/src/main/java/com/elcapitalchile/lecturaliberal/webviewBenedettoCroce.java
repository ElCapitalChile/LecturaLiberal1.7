package com.elcapitalchile.lecturaliberal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webviewBenedettoCroce extends AppCompatActivity {
    private WebView webView;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_webview_benedetto_croce );
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/open?id=1weqb9Mti0uGDoTXVQCXqGA9rYcZ-Zj9e");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.zoom_back_in,R.anim.zoom_back_out );
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate( R.menu.atras,menu );
        return true;

    }

    @SuppressLint("SetJavaScriptEnabled")
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();



        if (id==R.id.descargarPDFs){
            Intent i = new Intent( webviewBenedettoCroce.this, Instrucciones.class );
            startActivity( i );
            overridePendingTransition(R.anim.right_in,R.anim.right_out);
        }


        return super.onOptionsItemSelected( item );

    }


}
