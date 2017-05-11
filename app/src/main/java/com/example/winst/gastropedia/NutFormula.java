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

public class NutFormula extends MainActivity
{
    private Button forInf = null;        //initialize OVerview
    private Button forChild = null;          //initialize formula
    private Button forAdult = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_nutformula);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.nfor_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Formulas");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        initButt();
    }

    private void initButt()
    {
        forInf = (Button) findViewById(R.id.forbutt1);
        forChild = (Button) findViewById(R.id.forbutt2);
        forAdult = (Button) findViewById(R.id.forbutt3);

        forInf.setText("Infant Formula");
        forChild.setText("Child Formula");
        forAdult.setText("Adult Formula");

        forInf.setTextColor(Color.WHITE);
        forChild.setTextColor(Color.WHITE);
        forAdult.setTextColor(Color.WHITE);

        forInf.setTextSize(20);
        forChild.setTextSize(20);
        forAdult.setTextSize(20);



        forInf.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutFormula.this, FormulaInfant.class);
                startActivity(i);
            }
        });

        forChild.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutFormula.this, FormulaChild.class);
                startActivity(i);
            }
        });

        forAdult.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(NutFormula.this, FormulaAdult.class);
                startActivity(i);
            }
        });

    }
}
