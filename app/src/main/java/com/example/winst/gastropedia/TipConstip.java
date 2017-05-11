package com.example.winst.gastropedia;

import android.os.Bundle;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
/**
 * Created by WINST on 3/15/2017.
 */

public class TipConstip extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_constip);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tconst_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Constipation/Clean Outs");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        LinearLayout table = (LinearLayout) findViewById(R.id.tipconsttable);
                Resources res = getResources();
                String textString = res.getString(R.string.tipconstip);
                super.tableFill(textString,table);

    }
}
