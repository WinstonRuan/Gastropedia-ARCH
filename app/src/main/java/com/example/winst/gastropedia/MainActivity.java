package com.example.winst.gastropedia;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private Button orientBut = null;        //initialize orientation
    private Button nutrBut = null;          //initialize nutrition quick reference
    private Button lineBut = null;          //initialize the line section button
    private Button tubeBut = null;          //initialize tube alphabet soup
    private Button tipBut = null;           //initialize tips and tricks
    private Button coreBut = null;          //initialize ABP core contents
    private Button preBut = null;           //preop button
    private Button labImg = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Gastropedia");
//            getSupportActionBar().setHomeButtonEnabled(true);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        buttonCreate();
    }

    void doShit(Toolbar asdf)
    {
        Toolbar myToolbar = asdf;
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Lines");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
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

    /**
     * Method buttonCreate()
     *
     * Generates the buttons on the TextView.
     */
    private void buttonCreate()
    {
        orientBut = (Button) findViewById(R.id.butt1);
        nutrBut = (Button) findViewById(R.id.butt2);
        lineBut = (Button) findViewById(R.id.butt3);
        tubeBut = (Button) findViewById(R.id.butt4);
        tipBut = (Button) findViewById(R.id.butt7);
        coreBut = (Button) findViewById(R.id.butt8);
        preBut = (Button) findViewById(R.id.butt6);
        labImg = (Button) findViewById(R.id.butt5);

        orientBut.setText("Orientation to the Floor");
        nutrBut.setText("Nutrition Quick Reference");
        lineBut.setText("Lines");
        tubeBut.setText("Tubes");
        tipBut.setText("Tips and Tricks");
        coreBut.setText("ABP Core Content");
        preBut.setText("Procedures");               //one button should be preop checklist
        labImg.setText("Lab and Images");

        orientBut.setTextColor(Color.WHITE);
        nutrBut.setTextColor(Color.WHITE);
        lineBut.setTextColor(Color.WHITE);
        tubeBut.setTextColor(Color.WHITE);
        tipBut.setTextColor(Color.WHITE);
        coreBut.setTextColor(Color.WHITE);
        preBut.setTextColor(Color.WHITE);
        labImg.setTextColor(Color.WHITE);

        orientBut.setTextSize(20);
        nutrBut.setTextSize(20);
        lineBut.setTextSize(20);
        tubeBut.setTextSize(20);
        tipBut.setTextSize(20);
        coreBut.setTextSize(20);
        preBut.setTextSize(20);
        labImg.setTextSize(20);



        orientBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, OrientActivity.class);
                startActivity(i);
            }
        });

        nutrBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, NutriActivity.class);
                startActivity(i);
            }
        });

        lineBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, LineActivity.class);
                startActivity(i);
            }
        });
        tubeBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, TubeActivity.class);
                startActivity(i);
            }
        });
        tipBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, TipActivity.class);
                startActivity(i);
            }
        });
        coreBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, ABPActivity.class);
                startActivity(i);
            }
        });
        preBut.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, ProActivity.class);
                startActivity(i);
            }
        });
        labImg.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, LabActivity.class);
                startActivity(i);
            }
        });
    }

    /**
     * Method: tableFill
     *
     * textString is a string of all the text.
     * layout is the layout of the view.
     */
    void tableFill(String textString, LinearLayout layout)
    {

        String[] lineTypeArray = textString.split(System.getProperty("line.separator"));
        layout.setPadding(5,5,5,0);
        for(int i =0; i < lineTypeArray.length; i++)
        {
            lineTypeArray[i] = lineTypeArray[i].trim();
            LinearLayout temp = new LinearLayout(this);
            temp.setOrientation(LinearLayout.HORIZONTAL);
            temp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT));

            TextView texter = new TextView(this);
            TextView bullet = new TextView(this);

            if (lineTypeArray[i].charAt(0) == '-')
            {
                texter.setText(lineTypeArray[i].substring(1));
                texter.setTextColor(Color.BLACK);

                //TO CHANGE THE TEXT SIZE OF THE TEXT CHANGE THE NUMBER IN THE PRENTHESIS
                texter.setTextSize(20);

                bullet.setText("-");
                bullet.setGravity(Gravity.CENTER_VERTICAL);
                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

                bullet.setPadding(5,0,0,0);
                layout.addView(temp);


            }
            else if (lineTypeArray[i].charAt(0) == 'o')
            {
                texter.setText(lineTypeArray[i].substring(1));
                texter.setTextColor(Color.BLACK);
                bullet.setText("o");
                bullet.setGravity(Gravity.CENTER_VERTICAL);

                //TO CHANGE THE TEXT SIZE OF THE TEXT CHANGE THE NUMBER IN THE PRENTHESIS
                texter.setTextSize(15);


                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.setPadding(50,0,0,0);
                layout.addView(temp);

            }
            else if (lineTypeArray[i].charAt(0) == '\uF0A7')
            {
                texter.setText(lineTypeArray[i].substring(1));
                bullet.setText("•");
                texter.setTextColor(Color.BLACK);
                bullet.setGravity(Gravity.CENTER_VERTICAL);

                //TO CHANGE THE TEXT SIZE OF THE TEXT CHANGE THE NUMBER IN THE PRENTHESIS
                texter.setTextSize(15);


                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.setPadding(70,0,0,0);
                layout.addView(temp);

            }
            else if(lineTypeArray[i].charAt(0) == '•')
            {
                texter.setText(lineTypeArray[i].substring(1));
                bullet.setText("‣");
                texter.setTextColor(Color.BLACK);

                //TO CHANGE THE TEXT SIZE OF THE TEXT CHANGE THE NUMBER IN THE PRENTHESIS
                texter.setTextSize(15);


                temp.addView(bullet,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.addView(texter, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                temp.setPadding(90,0,0,0);
                layout.addView(temp);

            }
        }





        }


}



