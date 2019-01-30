package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PartiesHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parties_home);
    }
    public void homeSend(View view) {
        Intent homePage = new Intent(this,MainActivity.class);
        startActivity(homePage);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void conservative(View view) {
        Intent conservativePage = new Intent(this,conservativePage.class);
        startActivity(conservativePage);
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);

    }


}
