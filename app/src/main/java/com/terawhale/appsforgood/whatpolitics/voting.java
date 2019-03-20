package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class voting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
    }
    public void returnHistory(View view) {
        Intent Return = new Intent(this,historyHome.class);
        startActivity(Return);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
