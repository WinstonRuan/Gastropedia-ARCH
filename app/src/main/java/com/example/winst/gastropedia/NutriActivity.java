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


public class NutriActivity extends MainActivity
{
    private Button nOverview = null;        //initialize OVerview
    private Button nFormula = null;          //initialize formula
    private Button nTpn = null;          //initialize the TPN section button
    private Button nDiet = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_nutrition);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.nut_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Nutrition Quick Reference");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        iniButton();
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

    private void iniButton()
    {
        nOverview = (Button) findViewById(R.id.nutriBut1);
        nFormula = (Button) findViewById(R.id.nutriBut2);
        nTpn = (Button) findViewById(R.id.nutriBut3);
        nDiet = (Button) findViewById(R.id.nutriBut4);

        nOverview.setText("Basic Overview");
        nFormula.setText("Formulas");
        nTpn.setText("TPN");
        nDiet.setText("Diet Orders");

        nOverview.setTextColor(Color.WHITE);
        nFormula.setTextColor(Color.WHITE);
        nTpn.setTextColor(Color.WHITE);
        nDiet.setTextColor(Color.WHITE);

        nOverview.setTextSize(20);
        nFormula.setTextSize(20);
        nTpn.setTextSize(20);
        nDiet.setTextSize(20);

        nOverview.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutriActivity.this, NutOverview.class);
                startActivity(i);
            }
        });
        nFormula.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutriActivity.this, NutFormula.class);
                startActivity(i);
            }
        });
        nTpn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutriActivity.this, NutTpn.class);
                startActivity(i);
            }
        });
        nDiet.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutriActivity.this, NutDiet.class);
                startActivity(i);
            }
        });
    }
}