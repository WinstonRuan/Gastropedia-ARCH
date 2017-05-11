package com.example.winst.gastropedia;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by WINST on 3/15/2017.
 */

public class LineActivity extends MainActivity
{
    private Button lineOver = null;          //initialize the TPN section button
    private Button lineType = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_line);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.line_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Lines");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        iniButton();
    }

    private void iniButton()
    {
        lineOver = (Button) findViewById(R.id.linebutt1);
        lineType = (Button) findViewById(R.id.linebutt2);

        lineOver.setText("Overview");
        lineType.setText("Types");

        lineOver.setTextColor(Color.WHITE);
        lineType.setTextColor(Color.WHITE);

        lineOver.setTextSize(20);
        lineType.setTextSize(20);

        lineOver.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(LineActivity.this, LineOverview.class);
                startActivity(i);
            }
        });
        lineType.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(LineActivity.this, LineTypes.class);
                startActivity(i);
            }
        });
    }
}