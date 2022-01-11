package com.example.bridgeclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AboutUs extends AppCompatActivity
{
    Frag1 frag1 = new Frag1();
    Frag2 frag2 = new Frag2();
    private Button button1;
    private Button button2;
    private Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        button1 = (Button) findViewById(R.id.btnAbout1);
        button2 = (Button) findViewById(R.id.btnAbout2);
        button3 = (Button) findViewById(R.id.btnBack3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getSupportFragmentManager();
                Frag1 f1 = new Frag1();
                fm.beginTransaction().replace(R.id.Frame1, f1).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getSupportFragmentManager();
                Frag2 f2 = new Frag2();
                fm.beginTransaction().replace(R.id.Frame1, f2).commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AboutUs.this,NewWelcomeActivity.class));
            }
        });
    }
}