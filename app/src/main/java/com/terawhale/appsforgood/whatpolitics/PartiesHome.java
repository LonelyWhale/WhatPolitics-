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
    public void UKWide (View view) {
            Intent UK = new Intent(this,UKParties.class);
            startActivity(UK);
            overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }
    public void england(View view){
        Intent England = new Intent(this,England.class);
        startActivity(England);
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
    }
    public void scotland (View view) {
        Intent Scotland = new Intent(this,Scotland.class);
        startActivity(Scotland);
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }
    public void wales (View view) {
        Intent Wales = new Intent(this,Wales.class);
        startActivity(Wales);
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }
    public void nIreland (View view) {
        Intent NIreland = new Intent(this,NIreland.class);
        startActivity(NIreland);
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }

}
