package com.example.verrane.efficenprototype;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void webAppIntent(View view){
        Intent i = new Intent(MainActivity.this, WebAppActivity.class);
        startActivity(i);
    }

    public void inbuiltAppIntent(View view){
        Intent i = new Intent(MainActivity.this, InbuiltAppActivity.class);
        startActivity(i);
    }

}
