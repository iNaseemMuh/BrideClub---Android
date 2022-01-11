package com.example.bridgeclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WinnersActivity extends AppCompatActivity
{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners);
        setTitle("Winners List");
        button = (Button) findViewById(R.id.Back3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

    }

    public void openActivity1()
    {
        Intent intent = new Intent(this, NewWelcomeActivity.class);
        startActivity(intent);
    }
}