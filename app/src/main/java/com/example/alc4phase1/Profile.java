package com.example.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Profile");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}
