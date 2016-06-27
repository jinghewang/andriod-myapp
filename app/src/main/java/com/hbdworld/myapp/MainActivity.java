package com.hbdworld.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---
        LinearLayout layout = (LinearLayout)this.findViewById(R.id.root);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        String scheme = intent.getScheme();
        if (scheme != null){
            TextView textView = new TextView(this);
            textView.setText("key:" + "scheme" + "   value:" + scheme);
            layout.addView(textView);

            Set<String> sets = uri.getQueryParameterNames();
            for (String set : sets) {
                textView = new TextView(this);
                textView.setText("key:" + set + "   value:" + uri.getQueryParameter(set));
                layout.addView(textView);
            }
        }
    }
}
