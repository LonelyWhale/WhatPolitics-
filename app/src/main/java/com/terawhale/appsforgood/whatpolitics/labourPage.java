package com.terawhale.appsforgood.whatpolitics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class labourPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labour_page);
    }
    public void LabManifestoSend(View view) {
        Intent manifesto = new Intent(Intent.ACTION_VIEW, Uri.parse("https://labour.org.uk/manifesto/"));
        startActivity(manifesto);
    }
}