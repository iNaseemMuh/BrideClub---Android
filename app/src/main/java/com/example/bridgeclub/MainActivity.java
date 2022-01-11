package com.example.bridgeclub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Title=(TextView)findViewById(R.id.BridgeApp);
        TextView RegisterText=(TextView)findViewById(R.id.RegisterText);
        ImageView cards=(ImageView)findViewById(R.id.Image1);
        EditText username=(EditText)findViewById(R.id.Username);
        EditText password=(EditText)findViewById(R.id.Password);
        Button Register=(Button)findViewById(R.id.Register);
        Button Login=(Button)findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.fadein);
                Login.startAnimation(animation);
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                {
                    ShowDialog();
                }

                else
                {
                    Intent intent = new Intent(MainActivity.this, NewWelcomeActivity.class);
                    intent.putExtra("username", username.getText().toString());
                    startActivity(intent);
                    overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);
                }
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this,Register.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);

            }
        });
    }

    public void ShowDialog()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Must Enter Username and Password!");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });

        alert.create().show();
    }
}