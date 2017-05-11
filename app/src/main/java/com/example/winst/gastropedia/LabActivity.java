package com.example.winst.gastropedia;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

/**
 * Created by WINST on 3/15/2017.
 */

public class LabActivity extends MainActivity {
    private Button constipBut = null;        //initialize orientation
    private Button liverBut = null;          //initialize nutrition quick reference
    private Button miscBut = null;          //initialize the line section button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.lab_tool);
        if(myToolbar != null)
        {
            setSupportActionBar(myToolbar);
            getSupportActionBar().setTitle("Lab and Images");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

//        initButt();
    }

//    private void initButt() {
//        constipBut = (Button) findViewById(R.id.probutt1);
//        liverBut = (Button) findViewById(R.id.probutt2);
//        miscBut = (Button) findViewById(R.id.probutt3);
//
//        constipBut.setText("Constipation/Clean Outs");
//        liverBut.setText("Liver Patients");
//        miscBut.setText("Misc");
//
//        constipBut.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                Intent i = new Intent(LabActivity.this, ProPreOp.class);
//                startActivity(i);
//            }
//        });
//
//        liverBut.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                Intent i = new Intent(LabActivity.this, ProColo.class);
//                startActivity(i);
//            }
//        });
//
//        miscBut.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                Intent i = new Intent(LabActivity.this, ProAntro.class);
//                startActivity(i);
//            }
//        });
//    }
}