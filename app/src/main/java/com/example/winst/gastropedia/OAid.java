package com.example.winst.gastropedia;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by WINST on 3/15/2017.
 */

public class OAid extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oaid);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.oday_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("First Day Tips");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView title = (TextView) findViewById(R.id.oaidtitle);

        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        LinearLayout table = (LinearLayout) findViewById(R.id.oaidtable);
        Resources res = getResources();
        String textString = res.getString(R.string.oaid);
        super.tableFill(textString,table);
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

}
