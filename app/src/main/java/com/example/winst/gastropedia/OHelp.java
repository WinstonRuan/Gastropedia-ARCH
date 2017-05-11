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

public class OHelp extends MainActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohelp);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.ohelp_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Helpful People and Numbers");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        LinearLayout table = (LinearLayout) findViewById(R.id.ohelptable);
        Resources res = getResources();
        String textString = res.getString(R.string.ohelp);
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
