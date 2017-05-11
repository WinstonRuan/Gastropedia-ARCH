package com.example.winst.gastropedia;

import android.os.Bundle;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class TipLiver extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_liver);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tliver_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Liver Patients");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        LinearLayout table = (LinearLayout) findViewById(R.id.tiplivertable);
        Resources res = getResources();
        String textString = res.getString(R.string.tipliver);
        super.tableFill(textString, table);
    }
}
