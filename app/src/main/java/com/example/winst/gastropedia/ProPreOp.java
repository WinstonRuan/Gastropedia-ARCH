package com.example.winst.gastropedia;

import android.os.Bundle;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
/**
 * Created by WINST on 3/15/2017.
 */

public class ProPreOp extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_pre);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.ppre_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Pre-Operative Instructions");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        LinearLayout table = (LinearLayout) findViewById(R.id.propretable);
        Resources res = getResources();
        String textString = res.getString(R.string.preop);
        super.tableFill(textString,table);
    }
}
