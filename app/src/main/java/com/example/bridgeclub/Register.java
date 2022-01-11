package com.example.bridgeclub;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

public class Register extends Activity
{
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        button = (Button) findViewById(R.id.Register);
        button2 = (Button) findViewById(R.id.regLogin);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ShowDialog();
                Animation animation= AnimationUtils.loadAnimation(Register.this, R.anim.fadein);
                button.startAnimation(animation);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Register.this,MainActivity.class));
                Animation animation= AnimationUtils.loadAnimation(Register.this, R.anim.bounce);
                button2.startAnimation(animation);
            }
        });



    }

    public void ShowDialog()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Registration Complete!");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });

        alert.create().show();
    }
}
