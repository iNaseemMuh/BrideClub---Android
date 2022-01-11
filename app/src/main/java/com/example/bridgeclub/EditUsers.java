package com.example.bridgeclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class EditUsers extends AppCompatActivity
{
    ListView lv;
    EditText nameTxt;
    Button addBtn, updateBtn, deleteBtn, backBtn;
    ArrayList <String> names = new ArrayList<>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_users);
        lv = (ListView) findViewById(R.id.listView1);
        nameTxt = (EditText) findViewById(R.id.nameTxt);
        addBtn = (Button) findViewById(R.id.addbtn);
        updateBtn = (Button) findViewById(R.id.updatebtn);
        deleteBtn = (Button) findViewById(R.id.deletebtn);
        backBtn = (Button) findViewById(R.id.backBtn);



        //Temp User List

        names.add("Edmund Gray");
        names.add("Kobi Shimon");
        names.add("Robi Rivlin");
        names.add("Conor Mcgregor");
        names.add("Shlomo Sixt");
        names.add("Ehud Manor");
        names.add("Ariel Sharon");
        names.add("Mahatma Gandi");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        lv.setAdapter(adapter);

        //Set Selected Item
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                nameTxt.setText(names.get(position));
            }
        });

        //Back
        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(EditUsers.this,NewWelcomeActivity.class));
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation= AnimationUtils.loadAnimation(EditUsers.this, R.anim.fadein);
                addBtn.startAnimation(animation);
                add();
            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation= AnimationUtils.loadAnimation(EditUsers.this, R.anim.fadein);
                addBtn.startAnimation(animation);
                update();
            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Animation animation= AnimationUtils.loadAnimation(EditUsers.this, R.anim.fadein);
                addBtn.startAnimation(animation);
                delete();
            }
        });

    }

    //Add
    private void add()
    {
        String name = nameTxt.getText().toString();

        if(!name.isEmpty() && name.length()>0)
        {
            adapter.add(name);

            adapter.notifyDataSetChanged();
            nameTxt.setText("");
        }
    }


    //Update
    private void update()
    {
        String name = nameTxt.getText().toString();
        int pos = lv.getCheckedItemPosition();

        if(!name.isEmpty() && name.length()>0)
        {
            adapter.remove(names.get(pos));
            adapter.insert(name, pos);
            adapter.notifyDataSetChanged();
            nameTxt.setText("");

        }
    }

    //Delete
    private void delete()
    {
        int pos = lv.getCheckedItemPosition();

        if(pos > -1)
        {
            adapter.remove(names.get(pos));
            adapter.notifyDataSetChanged();
            nameTxt.setText("");

        }
    }

}