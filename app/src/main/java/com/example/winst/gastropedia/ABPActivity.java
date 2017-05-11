package com.example.winst.gastropedia;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by WINST on 3/15/2017.
 */

public class ABPActivity extends MainActivity
{
    private String blah=null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abp);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.abp_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("ABP Core Content");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Resources res = getResources();
        String textString = res.getString(R.string.pdfers);
        String textString2 = res.getString(R.string.urlers);
        LinearLayout layout = (LinearLayout) findViewById(R.id.abdtables);

        loadlinks(textString, layout);
    }

    private void loadlinks(String docnames, LinearLayout layout)
    {
        String[] docu = docnames.split(System.getProperty("line.separator"));

//        Button buttocks = new Button(this);
//        buttocks.setText(docu[1]);
//        blah = docu[1];
//        buttocks.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ABPActivity.this, WebActivity.class);
//                intent.putExtra("EXTRA_SESSION_ID", blah);
//                startActivity(intent);
//
//            }
//        });
//        layout.addView(buttocks, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));

        for(int i =0; i<docu.length; i++)
        {

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            Button butt = new Button(this);

            butt.setText(docu[i]);
            butt.setId(i);
            butt.setTextColor(Color.WHITE);


            final int id_  = butt.getId();
            blah = docu[i];
            final String[] asdf = docu;
//            Log.d("ffdssss", docu[i]);
            layout.addView(butt,params);

            //I do this so that the new button actually points where I want it to.
            Button butt1 = (Button) findViewById(id_);
            butt1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    String pdfName = asdf[id_];

                    Intent intent = new Intent(ABPActivity.this, WebActivity.class);
                    intent.putExtra("EXTRA_SESSION_ID", pdfName);
//                    Log.d("123456", pdfName);
                    startActivity(intent);

                }
            });

        }

    }
}