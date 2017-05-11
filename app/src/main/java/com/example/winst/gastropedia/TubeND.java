package com.example.winst.gastropedia;

import android.os.Bundle;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class TubeND extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tube_nd);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tnd_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("ND/NJ Tube");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        LinearLayout table = (LinearLayout) findViewById(R.id.tndbutttable);
        Resources res = getResources();
        String textString = res.getString(R.string.ndtube);
        super.tableFill(textString, table);
    }
}