package com.example.winst.gastropedia;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class FormulaInfant extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulainfant);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.nforinf_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Infant Formula");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        LinearLayout table = (LinearLayout) findViewById(R.id.forinfanttable);
        Resources res = getResources();
        String textString = res.getString(R.string.formulainfant);
        super.tableFill(textString,table);
    }

}
