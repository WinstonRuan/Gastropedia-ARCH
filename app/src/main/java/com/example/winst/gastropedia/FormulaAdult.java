package com.example.winst.gastropedia;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class FormulaAdult extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaadult);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.nforadult_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Adult Formula");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        LinearLayout table = (LinearLayout) findViewById(R.id.foradulttable);
        Resources res = getResources();
        String textString = res.getString(R.string.formulaadult);
        super.tableFill(textString,table);
    }



}
