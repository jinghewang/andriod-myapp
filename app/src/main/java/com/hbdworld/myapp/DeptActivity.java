package com.hbdworld.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DeptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);
        //
        this.setTitle("dept-activity");
    }
}
