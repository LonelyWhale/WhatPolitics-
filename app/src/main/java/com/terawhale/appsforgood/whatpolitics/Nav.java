package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
    }
    public void partiesSend(View view) {
        Intent partiesPage = new Intent(this,PartiesHome.class);
        startActivity(partiesPage);
    }
    public void homeReturn (View view) {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
    public void historySend(View view) {
        Intent history = new Intent(this, historyHome.class);
        startActivity(history);
    }
}
