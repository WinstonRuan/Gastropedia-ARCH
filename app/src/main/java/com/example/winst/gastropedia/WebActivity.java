package com.example.winst.gastropedia;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

/**
 * Created by WINST on 3/19/2017.
 */

public class WebActivity extends MainActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        com.github.barteksc.pdfviewer.PDFView web = (com.github.barteksc.pdfviewer.PDFView) findViewById(R.id.pdfview);
        String pdfName = getIntent().getStringExtra("EXTRA_SESSION_ID").trim() +".pdf";
        web.fromAsset(pdfName)
                .defaultPage(0)
                .enableSwipe(true)
                .enableAnnotationRendering(false)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();

        //String ur = getIntent().getStringExtra("EXTRA_SESSION_ID");


//        Log.d("ASDFASDFDSAFDS", pdfName);
//        web.setWebViewClient(new WebViewClient());
//        web.loadUrl(ur);
//        setContentView(web);
    }
}
