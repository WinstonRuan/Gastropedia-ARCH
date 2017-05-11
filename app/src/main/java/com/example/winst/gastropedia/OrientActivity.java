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

public class OrientActivity extends MainActivity
{
    private Button genBut = null;
    private Button helpBut = null;
    private Button aidBut = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_orient);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.orient_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Orientation to the Floor");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        createBut();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_search:

                return true;
            case R.id.action_settings:

                return true;

            default:
                //If here there is no recognized actions
                //invoke superclass
                return super.onOptionsItemSelected(item);
        }
    }

    private void createBut()
    {
        genBut = (Button) findViewById(R.id.geninfo);
        helpBut = (Button) findViewById(R.id.numhelp);
        aidBut = (Button) findViewById(R.id.aidtip);

        genBut.setText("General Information");
        helpBut.setText("Helpful People and Numbers");
        aidBut.setText("First Day Tips");

        genBut.setTextColor(Color.WHITE);
        helpBut.setTextColor(Color.WHITE);
        aidBut.setTextColor(Color.WHITE);

        genBut.setTextSize(20);
        helpBut.setTextSize(20);
        aidBut.setTextSize(20);

        genBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(OrientActivity.this, OGenInfo.class);
                startActivity(i);
            }
        });

        helpBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(OrientActivity.this, OHelp.class);
                startActivity(i);
            }
        });

        aidBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(OrientActivity.this, OAid.class);
                startActivity(i);
            }
        });
    }
}
