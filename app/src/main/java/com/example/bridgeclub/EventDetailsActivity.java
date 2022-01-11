package com.example.bridgeclub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventDetailsActivity extends AppCompatActivity

{
    private TextView tv;
    private Button button;
    private Button button2;
    private Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        setTitle("Events Details");
        tv = findViewById(R.id.DateText);

        Intent intent = this.getIntent();
        if(intent !=null)
        {
            String strdata = intent.getExtras().getString("passdate");
            tv.setText(strdata);
        }

        button = (Button) findViewById(R.id.RegisterMeeting);
        button2 = (Button) findViewById(R.id.Back);
        button3 = (Button) findViewById(R.id.btnShow);


        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ShowDialog();
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity3();
            }
        });


    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, EventsActivity.class);
        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent = new Intent(this, ParListActivity.class);
        startActivity(intent);
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