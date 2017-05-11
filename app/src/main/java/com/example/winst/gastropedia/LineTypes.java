package com.example.winst.gastropedia;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class LineTypes extends MainActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_types);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.ltype_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Types");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


//        TextView text = (TextView) findViewById(R.id.ltype);
//        text.setMovementMethod(new ScrollingMovementMethod());
        LinearLayout table = (LinearLayout) findViewById(R.id.typeid);
        Resources res = getResources();
        String textString = res.getString(R.string.linetypes);
        super.tableFill(textString, table);

    }

//    private void tableFill()
//    {
//        Resources res = getResources();
//        String textString = res.getString(R.string.linetypes);
//        String[] lineTypeArray = textString.split(System.getProperty("line.separator"));
//        LinearLayout layout = (LinearLayout) findViewById(R.id.typeid);
//
//        for(int i =0; i < lineTypeArray.length; i++)
//        {
//            lineTypeArray[i] = lineTypeArray[i].trim();
//            LinearLayout temp = new LinearLayout(this);
//            temp.setOrientation(LinearLayout.HORIZONTAL);
//            temp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT));
//
//            TextView texter = new TextView(this);
//            TextView bullet = new TextView(this);
//
//            if (lineTypeArray[i].charAt(0) == '-')
//            {
//                texter.setText(lineTypeArray[i].substring(1));
//                bullet.setText("-");
//                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                bullet.setPadding(5,0,0,0);
//                layout.addView(temp);
//
//            }
//            else if (lineTypeArray[i].charAt(0) == 'o')
//            {
//                texter.setText(lineTypeArray[i].substring(1));
//                bullet.setText("o");
//                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.setPadding(30,0,0,0);
//                layout.addView(temp);
//
//            }
//            else if (lineTypeArray[i].charAt(0) == '\uF0A7')
//            {
//                texter.setText(lineTypeArray[i].substring(1));
//                bullet.setText("•");
//                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.setPadding(60,0,0,0);
//                layout.addView(temp);
//
//            }
//            else if(lineTypeArray[i].charAt(0) == '•')
//            {
//                texter.setText(lineTypeArray[i].substring(1));
//                bullet.setText("‣");
//                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                temp.setPadding(90,0,0,0);
//                layout.addView(temp);
//
//            }
//        }
//
//
//    }
}
