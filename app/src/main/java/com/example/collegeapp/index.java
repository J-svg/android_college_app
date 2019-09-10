package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void kiit(View v){
        String s="https://kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void dep(View v){
        Intent in = new Intent(index.this, dept.class);
        startActivity(in);
    }

    public void gal(View v){
        String s="https://kiit.ac.in/tour/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void fac(View v){
        String s="https://kiit.ac.in/academics/faculty/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void cou(View v){
        Intent in = new Intent(index.this, courses.class);
        startActivity(in);
    }

    public void fees(View v){
        String s="https://kiit.ac.in/academics/scholarships-fellowships/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void faci(View v){
        String s="https://kiit.ac.in/explore/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void extra(View v){
        String s="https://kiit.ac.in/campuslife/sports/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

}
