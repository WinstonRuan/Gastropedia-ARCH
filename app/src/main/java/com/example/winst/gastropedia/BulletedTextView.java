package com.example.winst.gastropedia;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BulletSpan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WINST on 3/17/2017.
 */

public class BulletedTextView extends android.support.v7.widget.AppCompatTextView
{
    public BulletedTextView(Context context)
    {
        super(context);
    }

    @Override
    public void setText(CharSequence text, BufferType type)
    {
        StringBuilder sb = new StringBuilder();
        List<Integer> markers = new ArrayList<Integer>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch) {

                case '\u2022':

                    // we found a bullet, mark the start of bullet span but don't append the bullet char
                    markers.add(sb.length());

                    // ... I do some other stuff here to skip whitespace etc.
                    break;

                case '\n':

                    // we found a newline char, mark the end of the bullet span
                    sb.append(ch);
                    markers.add(sb.length());

                    // ... I do some stuff here to weed out the newlines without matching bullets

                    break;

                // ... I have some special treatment for some other characters,
                //     for instance, a tab \t means a newline within the span

                default:
                    // any other character just add it to the string
                    sb.append(ch);
                    break;
            }
        }

        // ... at the end of the loop I have some code to check for an unclosed span

        //  create the spannable to put in the TextView
        SpannableString spannableString = new SpannableString(sb.toString());

        // go through the markers two at a time and set the spans
        for (int i = 0; i < markers.size(); i += 2) {
            int start = markers.get(i);
            int end = markers.get(i+1);
            spannableString.setSpan(new BulletSpan(16), start, end, Spannable.SPAN_PARAGRAPH);
        }

        super.setText(spannableString, BufferType.SPANNABLE);

    }
}
