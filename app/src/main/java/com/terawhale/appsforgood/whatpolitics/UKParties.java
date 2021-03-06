package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UKParties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukparties);
    }
    public void conservative(View view) {
        Intent conservativePage = new Intent(this,conservativePage.class);
        startActivity(conservativePage);
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);

    }
    public void labour(View view) {
        Intent labourPage = new Intent(this, labourPage.class);
        startActivity((labourPage));
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }
    public void libDems (View view) {
        Intent LibDems = new Intent(this,libdem_page.class);
        startActivity(LibDems);
        overridePendingTransition(R.anim.slide_in_bottom,R.anim.slide_out_top);
    }
    public void returnParties(View view) {
        Intent Return = new Intent(this,PartiesHome.class);
        startActivity(Return);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}
