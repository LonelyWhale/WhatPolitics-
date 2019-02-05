package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class historyHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_home);
    }
    public void homeReturn(View view){
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

    }
    public void votingPage(View view) {
        Intent voting = new Intent(this, voting.class);
        startActivity(voting);
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }
}
