package com.example.verrane.efficenprototype;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InbuiltAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbuilt_app_menu);
    }

    public void flipkarapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.flipkart.android");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void amazonapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("in.amazon.mShop.android.shopping");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }



    public void olaapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.olacabs.customer");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void uberapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.ubercab");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void zoomcarapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.zoomcar");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }



    public void facebookapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void whatsappapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void youtubeapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }




    public void swiggyapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("in.swiggy.android");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void zomatoapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.application.zomato.ordering");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }
    public void ubereatsapp(View view){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.ubercab.eats");
        if(i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
    }


}
