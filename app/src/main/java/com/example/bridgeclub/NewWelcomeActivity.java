package com.example.bridgeclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NewWelcomeActivity extends AppCompatActivity
{
    private CardView Meeting;
    private CardView Winners;
    private CardView Contact;
    private CardView About;
    private TextView title;
    private Button button;
    private Button button2;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_welcome);
        Intent wintent = getIntent();
        TextView title = findViewById(R.id.welcomeText);
        //title.setText("Welcome " + wintent.getStringExtra("username") + "!");
        CardView Meeting = (CardView) findViewById(R.id.MeetingCard);
        CardView Winners = (CardView) findViewById(R.id.WinnerCard);
        CardView Contact = (CardView) findViewById(R.id.ContactCard);
        CardView About = (CardView) findViewById(R.id.AboutCard);
        button = (Button) findViewById(R.id.LogOutButton);
        button2 = (Button) findViewById(R.id.manageButton);


        Meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewWelcomeActivity.this,EventsActivity.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
            }
        });

        Winners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewWelcomeActivity.this,WinnersActivity.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
            }
        });

        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewWelcomeActivity.this,MessageActivity.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewWelcomeActivity.this,AboutUs.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(NewWelcomeActivity.this,MainActivity.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(NewWelcomeActivity.this,EditUsers.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
            }
        });
    }


}