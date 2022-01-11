package com.example.bridgeclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ParListActivity extends AppCompatActivity
{
    private Button button;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_list);

        button = (Button) findViewById(R.id.btnBack2);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity2();
            }
        });

        listView= (ListView) findViewById(R.id.ListView);
        ArrayList <String> array = new ArrayList();
        array.add("Edmund Gray");
        array.add("Kobi Shimon");
        array.add("Robi Rivlin");
        array.add("Conor Mcgregor");
        array.add("Shlomo Sixt");
        array.add("Ehud Manor");
        array.add("Ariel Sharon");
        array.add("Mahatma Gandi");
        array.add("Dobi Free");
        array.add("Harry Potter");
        array.add("Chris Ronaldo");
        array.add("Eran Zahavi");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(arrayAdapter);

    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, EventDetailsActivity.class);
        startActivity(intent);
    }
}