package com.example.winst.gastropedia;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by WINST on 3/15/2017.
 */

public class TipActivity extends MainActivity{
        private Button constipBut = null;        //initialize orientation
        private Button liverBut = null;          //initialize nutrition quick reference
        private Button miscBut = null;          //initialize the line section button

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_buttons_tip);

            Toolbar myToolbar = (Toolbar) findViewById(R.id.tip_tool);
            if(myToolbar != null)
            {
                setSupportActionBar(myToolbar);
                getSupportActionBar().setTitle("Tips and Tricks");
                getSupportActionBar().setHomeButtonEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }

            initButt();
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

        private void initButt() {
            constipBut = (Button) findViewById(R.id.tipButt1);
            liverBut = (Button) findViewById(R.id.tipButt2);
            miscBut = (Button) findViewById(R.id.tipButt3);

            constipBut.setText("Constipation/Clean Outs");
            liverBut.setText("Liver Patients");
            miscBut.setText("Misc");

            constipBut.setTextColor(Color.WHITE);
            liverBut.setTextColor(Color.WHITE);
            miscBut.setTextColor(Color.WHITE);

            constipBut.setTextSize(20);
            liverBut.setTextSize(20);
            miscBut.setTextSize(20);

            constipBut.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(TipActivity.this, TipConstip.class);
                    startActivity(i);
                }
            });

            liverBut.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(TipActivity.this, TipLiver.class);
                    startActivity(i);
                }
            });

            miscBut.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(TipActivity.this, TipMisc.class);
                    startActivity(i);
                }
            });
        }
}