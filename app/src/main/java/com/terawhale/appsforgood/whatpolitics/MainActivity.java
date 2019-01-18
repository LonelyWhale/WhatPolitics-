package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();
    ImageView img;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.logo);
        animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
    }
    public void navDisplay(View view) {
        img.startAnimation(animation);
        mHandler.postDelayed(r,800);
    }
    public void partiesSend(View view) {
        Intent partiesPage = new Intent(this,PartiesHome.class);
        startActivity(partiesPage);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity.this,Nav.class));
        }
    };
}


