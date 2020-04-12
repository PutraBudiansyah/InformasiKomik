package com.example.informasikomiksijuki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        getSupportActionBar().setTitle("About Me");
    }
}
