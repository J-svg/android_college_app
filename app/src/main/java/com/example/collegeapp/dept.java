package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class dept extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);
    }
    public void ksca(View v){
        String s="https://ksca.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void mech(View v){
        String s="https://mechanical.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void cse(View v){
        String s="https://cse.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void civil(View v){
        String s="https://civil.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void elec(View v){
        String s="https://electrical.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void electro(View v){
        String s="https://electronics.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void aps(View v){
        String s="http://ksas.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void chem(View v){
        String s="https://chemical.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void poly(View v){
        String s="https://kp.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void arch(View v){
        String s="https://ksap.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }

    public void iti(View v){
        String s="https://iti.kiit.ac.in/";
        Uri u= Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }


}
