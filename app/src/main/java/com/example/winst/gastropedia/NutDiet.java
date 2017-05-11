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

public class NutDiet extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutdiet);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.ndiet_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Diet Orders");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Resources res = getResources();
        String textString = res.getString(R.string.ndiet);
        LinearLayout layout = (LinearLayout) findViewById(R.id.ndiettable);

        super.tableFill(textString,layout);
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

//    private void tableFill() {
//        Resources res = getResources();
//        String textString = res.getString(R.string.ndiet);
//        String[] lineOverArray = textString.split(System.getProperty("line.separator"));
//
//        Log.d("Messageasdf", lineOverArray[2]);
//        for (int i = 0; i < lineOverArray.length; i++) {
//
//            TableRow row = new TableRow(this);
//            ImageView img = new ImageView(this);
//            lineOverArray[i].trim();
//            Log.d("Messageasdf", lineOverArray[i]);
//            TextView t = new TextView(this);
//            TableLayout tabes = (TableLayout) findViewById(R.id.ndiettable);
//            //Log.d("Messageasdf", Integer.toString(lineOverArray[i].indexOf('-')));
//
//            if (lineOverArray[i].charAt(0) == '-')
//            {
//                img.setImageResource(R.drawable.bullet_circle_fill);
//                img.setLayoutParams(new TableRow.LayoutParams(40, 30));
//
//                lineOverArray[i] = lineOverArray[i].substring(lineOverArray[i].indexOf('-') + 1);
//
//                img.setPadding(15, 0, 0, 0);
//
//                row.setGravity(Gravity.CENTER_VERTICAL);
//                t.setText(lineOverArray[i]);
//                t.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT));
//                t.setTextColor(Color.BLACK);
//                //sets the text to bold
//                t.setTypeface(t.getTypeface(), Typeface.BOLD);
//                row.addView(img);
//                row.addView(t);
//                tabes.addView(row, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
//                continue;
//            }
//            else if (lineOverArray[i].charAt(0) == 'o')
//            {
//                img.setImageResource(R.drawable.bullet_circle_out);
//                img.setLayoutParams(new TableRow.LayoutParams(80, 30));
//                lineOverArray[i] = lineOverArray[i].substring(lineOverArray[i].indexOf('o') + 1);
//                //Log.d("Messagout", Integer.toString(lineOverArray[i].indexOf('o')));
//                img.setPadding(40, 0, 0, 0);
//            }
//            else if (lineOverArray[i].charAt(0) == '\uF0A7')
//            {
//                img.setImageResource(R.drawable.bullet_square_fill);
//                img.setLayoutParams(new TableRow.LayoutParams(100, 20));
//                lineOverArray[i] = lineOverArray[i].substring(lineOverArray[i].indexOf('\uF0A7') + 1);
//                //Log.d("Messagsq", Integer.toString(lineOverArray[i].indexOf('\uF0A7')));
//                img.setPadding(80, 0, 0, 0);
//            }
//
//
//
//            row.setGravity(Gravity.CENTER_VERTICAL);
//            t.setText(lineOverArray[i]);
//            t.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
//            t.setTextColor(Color.BLACK);
//            row.addView(img);
//            row.addView(t);
//            tabes.addView(row, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
        }

