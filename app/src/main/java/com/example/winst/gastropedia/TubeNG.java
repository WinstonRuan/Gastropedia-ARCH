package com.example.winst.gastropedia;

import android.os.Bundle;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class TubeNG extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tube_ng);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tng_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("NG Tube");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        LinearLayout table = (LinearLayout) findViewById(R.id.tngbuttable);
        Resources res = getResources();
        String textString = res.getString(R.string.ngtube);
        super.tableFill(textString, table);
    }
}
