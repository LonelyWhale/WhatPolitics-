package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class libdem_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libdem_page);
    }
    public void libManifestoSend(View view) {
        Intent manifesto = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.libdems.org.uk/manifesto"));
        startActivity(manifesto);
    }
}
