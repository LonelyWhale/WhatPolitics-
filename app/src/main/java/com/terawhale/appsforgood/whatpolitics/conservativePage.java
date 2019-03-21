package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.net.Uri;
import android.widget.TextView;


public class conservativePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conservative_page);
    }
    public void conManifestoSend(View view) {
        Intent manifesto = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.conservatives.com/manifesto"));
        startActivity(manifesto);
    }
    public void returnUKParties(View view) {
        Intent Return = new Intent(this,PartiesHome.class);
        startActivity(Return);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}
