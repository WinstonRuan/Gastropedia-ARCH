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

public class ProActivity extends MainActivity
{
    private Button preOpBut = null;        //initialize orientation
    private Button colBut = null;          //initialize nutrition quick reference
    private Button antroBut = null;          //initialize the line section button

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_pro);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.pro_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Procedures");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        initButt();
    }

    private void initButt()
    {
        preOpBut = (Button) findViewById(R.id.probutt1);
        colBut = (Button) findViewById(R.id.probutt2);
        antroBut = (Button) findViewById(R.id.probutt3);

        preOpBut.setText("Pre-Operative Instructions");
        colBut.setText("Colonic Manometry");
        antroBut.setText("Antroduodenal Manometry");

        preOpBut.setTextColor(Color.WHITE);
        colBut.setTextColor(Color.WHITE);
        antroBut.setTextColor(Color.WHITE);

        preOpBut.setTextSize(20);
        colBut.setTextSize(20);
        antroBut.setTextSize(17 );

        preOpBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(ProActivity.this, ProPreOp.class);
                startActivity(i);
            }
        });

        colBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(ProActivity.this, ProColo.class);
                startActivity(i);
            }
        });

        antroBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(ProActivity.this, ProAntro.class);
                startActivity(i);
            }
        });
    }
}