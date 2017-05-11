package com.example.winst.gastropedia;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class LineOverview extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_overview);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.lover_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Overview");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        LinearLayout table = (LinearLayout) findViewById(R.id.linetableoverview);
        Resources res = getResources();
        String textString = res.getString(R.string.lineover);
        super.tableFill(textString,table);
    }

//    private void tableFill()
//    {
//        Resources res = getResources();
//        String textString = res.getString(R.string.lineover);
//        String[] lineOverArray = textString.split(System.getProperty("line.separator"));
//
//        Log.d("Messageasdf", lineOverArray[2]);
//        for(int i=0; i<lineOverArray.length; i++)
//        {
//
//            TableRow row = new TableRow(this);
//            ImageView img = new ImageView(this);
//            lineOverArray[i].trim();
//            Log.d("Messageasdf", Integer.toString(lineOverArray.length));
//            //Log.d("Messageasdf", Integer.toString(lineOverArray[i].indexOf('-')));
//
//            if(lineOverArray[i].charAt(0) == '-')
//            {
//                img.setImageResource(R.drawable.bullet_circle_fill);
//                img.setLayoutParams(new TableRow.LayoutParams(40,30));
//
//                lineOverArray[i] =lineOverArray[i].substring(lineOverArray[i].indexOf('-')+1);
//                img.setPadding(15,0,0,0);
//            }
//            else if (lineOverArray[i].charAt(0) == 'o')
//            {
//                img.setImageResource(R.drawable.bullet_circle_out);
//                img.setLayoutParams(new TableRow.LayoutParams(80,30));
//                lineOverArray[i] =lineOverArray[i].substring(lineOverArray[i].indexOf('o')+1);
//                //Log.d("Messagout", Integer.toString(lineOverArray[i].indexOf('o')));
//                img.setPadding(40,0,0,0);
//            }
//            else if (lineOverArray[i].charAt(0) == '\uF0A7')
//            {
//                img.setImageResource(R.drawable.bullet_square_fill);
//                img.setLayoutParams(new TableRow.LayoutParams(100,20));
//                lineOverArray[i] = lineOverArray[i].substring(lineOverArray[i].indexOf('\uF0A7')+1);
//                //Log.d("Messagsq", Integer.toString(lineOverArray[i].indexOf('\uF0A7')));
//                img.setPadding(80,0,0,0);
//            }
//
//            TableLayout tabes = (TableLayout) findViewById(R.id.linetableoverview);
//            TextView t = new TextView(this);
//            row.setGravity(Gravity.CENTER_VERTICAL);
//            t.setText(lineOverArray[i]);
//            t.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT));
//            t.setTextColor(Color.BLACK);
//            row.addView(img);
//            row.addView(t);
//            tabes.addView(row, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
//        }
//
//    }
}
