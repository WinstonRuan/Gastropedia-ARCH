package com.example.winst.gastropedia;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by WINST on 3/15/2017.
 */

public class TubeActivity extends MainActivity
{

    private Button ngBut = null;        //initialize orientation
    private Button nDBut = null;          //initialize nutrition quick reference
    private Button salemBut = null;          //initialize the line section button
    private Button pegBut = null;          //initialize tube alphabet soup
    private Button pezzarBut = null;           //initialize tips and tricks
    private Button gBut = null;          //initialize ABP core contents
    private Button gjBut = null;           //preop button

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_tube);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tube_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Tubes");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        buttonCreate();
    }

    private void buttonCreate()
    {
        ngBut = (Button) findViewById(R.id.tubebutt1);
        nDBut = (Button) findViewById(R.id.tubebutt2);
        salemBut = (Button) findViewById(R.id.tubebutt3);
        pegBut = (Button) findViewById(R.id.tubebutt4);
        pezzarBut = (Button) findViewById(R.id.tubebutt5);
        gBut = (Button) findViewById(R.id.tubebutt6);
        gjBut = (Button) findViewById(R.id.tubebutt7);

        ngBut.setText("NG Tube");
        nDBut.setText("ND/NJ Tube");
        salemBut.setText("Salem SUMP");
        pegBut.setText("PEG Tube");
        pezzarBut.setText("Pezzar Tube");
        gBut.setText("G Button");
        gjBut.setText("GJ Tube");

        ngBut.setTextColor(Color.WHITE);
        nDBut.setTextColor(Color.WHITE);
        salemBut.setTextColor(Color.WHITE);
        pegBut.setTextColor(Color.WHITE);
        pezzarBut.setTextColor(Color.WHITE);
        gBut.setTextColor(Color.WHITE);
        gjBut.setTextColor(Color.WHITE);

        ngBut.setTextSize(20);
        nDBut.setTextSize(20);
        salemBut.setTextSize(20);
        pegBut.setTextSize(20);
        pezzarBut.setTextSize(20);
        gBut.setTextSize(20);
        gjBut.setTextSize(20);

        ngBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubeNG.class);
                startActivity(i);
            }
        });

        nDBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubeND.class);
                startActivity(i);
            }
        });

        salemBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubeSalem.class);
                startActivity(i);
            }
        });
        pegBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubePeg.class);
                startActivity(i);
            }
        });
        pezzarBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubePezzar.class);
                startActivity(i);
            }
        });
        gBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubeGbut.class);
                startActivity(i);
            }
        });
        gjBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(TubeActivity.this, TubeGJ.class);
                startActivity(i);
            }
        });
    }


}