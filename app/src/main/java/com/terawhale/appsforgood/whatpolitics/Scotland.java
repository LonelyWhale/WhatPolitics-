package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scotland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scotland);
    }
    public void returnParties(View view) {
        Intent Return = new Intent(this,PartiesHome.class);
        startActivity(Return);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}
