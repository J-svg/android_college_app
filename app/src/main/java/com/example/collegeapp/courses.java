package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
    }

    public void course(View v){
        String s="https://kiit.ac.in/academics/courses/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
}
