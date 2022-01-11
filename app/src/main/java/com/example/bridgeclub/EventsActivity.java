package com.example.bridgeclub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

public class EventsActivity extends AppCompatActivity
{
    private Button button;
    private CalendarView Calendar;
    private TextView tv;
    private String date;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        setTitle("Events");
        button = (Button) findViewById(R.id.BtnRegisterEvent);
        button2 = (Button) findViewById(R.id.btnBack);
        Calendar = (CalendarView) findViewById(R.id.calendarView);
        tv = findViewById(R.id.textView4);

        Calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth)
            {
                date = dayOfMonth + "/" + month + "/" + year;
                tv.setText(date);
            }
        });
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openActivity2();
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);

            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(EventsActivity.this,NewWelcomeActivity.class));
                overridePendingTransition(R.anim.lefttoright,R.anim.righttoleft);

            }
        });

    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, EventDetailsActivity.class);

        intent.putExtra("passdate",date);
        startActivity(intent);
    }

}