package com.example.verrane.efficenprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WebAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app_menu);
    }

    public void flipkartweb(View view){
        Intent i = new Intent(WebAppActivity.this, FlipkartWebsiteActivity.class);
        startActivity(i);
    }
    public void amazonweb(View view){
        Intent i = new Intent(WebAppActivity.this, AmazonWebsiteActivity.class);
        startActivity(i);
    }




    public void olaweb(View view){
        Intent i = new Intent(WebAppActivity.this, OlaWebsiteActivity.class);
        startActivity(i);
    }
    public void uberweb(View view){
        Intent i = new Intent(WebAppActivity.this, UberWebsiteActivity.class);
        startActivity(i);
    }
    public void zoomcarweb(View view){
        Intent i = new Intent(WebAppActivity.this, ZoomcarWebsiteActivity.class);
        startActivity(i);
    }




    public void facebookweb(View view){
        Intent i = new Intent(WebAppActivity.this, FacebookWebsiteActivity.class);
        startActivity(i);
    }
    public void whatsappweb(View view){
        Intent i = new Intent(WebAppActivity.this, WhatsappWebsiteActivity.class);
        startActivity(i);
    }
    public void youtubeweb(View view){
        Intent i = new Intent(WebAppActivity.this, YoutubeWebsiteActivity.class);
        startActivity(i);
    }




    public void swiggyweb(View view){
        Intent i = new Intent(WebAppActivity.this, SwiggyWebsiteActivity.class);
        startActivity(i);
    }
    public void zomatoweb(View view){
        Intent i = new Intent(WebAppActivity.this, ZomatoWebsiteActivity.class);
        startActivity(i);
    }
    public void ubereatsweb(View view){
        Intent i = new Intent(WebAppActivity.this, UbereatsWebsiteActivity.class);
        startActivity(i);
    }

}
