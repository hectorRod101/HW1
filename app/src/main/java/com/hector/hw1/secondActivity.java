// By: Hector Rodriguez Reyes
// Date: 09/30/19
// Class: CPSC 411
// Time: Tu/Th 4:00-5:15 PM

package com.hector.hw1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class secondActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // HorizontalScrollView to move horizontally to
        // check all outputs
        HorizontalScrollView hsv = new HorizontalScrollView(this);
        hsv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        // GridLayout for the main format with 4 columns,
        // vertical orientation and black background color
        GridLayout root = new GridLayout(this);
        root.setOrientation(GridLayout.VERTICAL);
        root.setRowCount(GridLayout.UNDEFINED);
        root.setBackgroundColor(Color.BLACK);
        root.setColumnCount(5);
        hsv.addView(root);


        // LinearLayout for each column for the GridLayout
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        root.addView(ll);

        // TextView to display the output
        TextView tv;

        // Constant for text size
        final int txtSize = 16;



        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        // Output: Column 1
        // Set margins
        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        GridLayout.Spec row_spec = GridLayout.spec(0);
        GridLayout.Spec col_spec = GridLayout.spec(0);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        ll.setLayoutParams(cParams);

        // Output: Numbers 1-11 with light-gray background
        for(int i = 0; i < 11; ++i){
            tv = new TextView(this);
            tv.setText(String.valueOf(i + 1));
            tv.setTextColor(Color.BLACK);
            tv.setBackgroundColor(Color.LTGRAY);
            tv.setHeight(64);
            tv.setWidth(80);
            tv.setTextSize(txtSize);
            tv.setGravity(Gravity.CENTER);
            ll.addView(tv, cParams);
        }



        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        // Output: Column 2
        // Set margins and new LinearLayout
        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        ll.setLayoutParams(cParams);
        root.addView(ll);

        // Blank
        tv = new TextView(this);
        tv.setText(" ");
        tv.setBackgroundColor(Color.BLACK);
        tv.setHeight(64);
        tv.setWidth(310);
        tv.setTextSize(txtSize);
        tv.setGravity(Gravity.CENTER);
        ll.addView(tv, cParams);

        // Output: properties with white background
        tv = new TextView(this);
        tv.setText("properties");
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextColor(Color.BLACK);
        tv.setHeight(129);
        tv.setWidth(310);
        tv.setTextSize(txtSize);
        tv.setGravity(Gravity.CENTER);
        ll.addView(tv, cParams);

        // Output: Rule and blank boxes with blue background
        for(int i = 0; i < 3; ++i){
            tv = new TextView(this);
            tv.setBackgroundColor(0xCCCCFFFF);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(64);
            tv.setWidth(310);
            tv.setTextSize(txtSize);
            tv.setGravity(Gravity.CENTER);

            if(i == 0){
                tv.setText("Rule");
                tv.setTypeface(null, Typeface.BOLD);
            }
            ll.addView(tv, cParams);
        }

        // Output: Rule and blank boxes with blue background
        for(int i = 0; i < 5; ++i){
            tv = new TextView(this);
            tv.setBackgroundColor(Color.WHITE);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(64);
            tv.setWidth(310);
            tv.setTextSize(txtSize);

            if(i == 0){
                tv.setText("Rule");
                tv.setTypeface(null, Typeface.BOLD);
            }
            else{
                tv.setText("R" + i * 10);
            }
            ll.addView(tv, cParams);
        }



        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        // Output: Column 3
        // Set margins and new LinearLayout
        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        col_spec = GridLayout.spec(2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        ll.setLayoutParams(cParams);
        root.addView(ll);

        // Output: Rules void hello
        tv = new TextView(this);
        tv.setText("Rules void hello");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setHeight(64);
        tv.setWidth(550);
        tv.setTextSize(txtSize);
        tv.setGravity(Gravity.RIGHT);
        ll.addView(tv, cParams);

        // Output: name and category
        for(int i = 0; i < 2; ++i) {
            tv = new TextView(this);
            tv.setBackgroundColor(Color.WHITE);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(63);
            tv.setWidth(550);
            tv.setTextSize(txtSize);
            tv.setGravity(Gravity.CENTER);

            if(i == 0){
                tv.setText("name");
            }
            else{
                tv.setHeight(64);
                tv.setText("category");
            }

            ll.addView(tv, cParams);
        }

        // Output: C1 and min <= hour && hour <= max
        for(int i = 0; i < 2; ++i){
            tv = new TextView(this);
            tv.setBackgroundColor(0xCCCCFFFF);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(64);
            tv.setWidth(550);
            tv.setTextSize(txtSize);
            tv.setGravity(Gravity.CENTER);

            if(i == 0){
                tv.setText("C1");
                tv.setTypeface(null, Typeface.BOLD);
            }
            else{
                tv.setText("min <= hour && hour <= max");
            }

            ll.addView(tv, cParams);
        }

        // LinearLayout for the two column output of
        // int min, int max, From, To, and the numbers
        LinearLayout ll_2 = new LinearLayout(this);
        ll_2.setOrientation(LinearLayout.HORIZONTAL);
        ll.addView(ll_2);

        for(int j = 0; j < 6; ++j) {
            ll_2 = new LinearLayout(this);
            ll_2.setOrientation(LinearLayout.HORIZONTAL);
            ll.addView(ll_2);

            if (j == 0) {
                // Output: int min and int max
                for (int i = 0; i < 2; ++i) {
                    tv = new TextView(this);
                    tv.setBackgroundColor(0xCCCCFFFF);
                    tv.setTextColor(Color.BLACK);
                    tv.setHeight(64);
                    tv.setWidth(275);
                    tv.setTextSize(txtSize);
                    tv.setGravity(Gravity.CENTER);

                    if (i == 0) {
                        tv.setText("int min");
                    } else {
                        tv.setText("int max");
                    }

                    ll_2.addView(tv, cParams);
                }
            } else if (j == 1) {
                // Output: From and To
                for (int i = 0; i < 2; ++i) {
                    tv = new TextView(this);
                    tv.setBackgroundColor(0xFFFFFFCC);
                    tv.setTextColor(Color.BLACK);
                    tv.setTypeface(Typeface.DEFAULT_BOLD);
                    tv.setHeight(64);
                    tv.setWidth(275);
                    tv.setTextSize(txtSize);

                    if (i == 0) {
                        tv.setText("From");
                    } else {
                        tv.setText("To");
                    }

                    ll_2.addView(tv, cParams);
                }
            } else {
                // Output: numbers
                for (int i = 0; i < 2; ++i) {
                    tv = new TextView(this);
                    tv.setBackgroundColor(0xFFFFFFCC);
                    tv.setTextColor(Color.BLACK);
                    tv.setGravity(Gravity.RIGHT);
                    tv.setHeight(64);
                    tv.setWidth(275);
                    tv.setTextSize(txtSize);

                    if(j == 2) {

                        if (i == 0) {
                            tv.setText("0");
                        } else {
                            tv.setText("11");
                        }
                    }
                    else if(j == 3) {

                        if (i == 0) {
                            tv.setText("12");
                        } else {
                            tv.setText("17");
                        }
                    }
                    else if(j == 4) {

                        if (i == 0) {
                            tv.setText("18");
                        } else {
                            tv.setText("21");
                        }
                    }
                    else{

                        if (i == 0) {
                            tv.setText("22");
                        } else {
                            tv.setText("23");
                        }
                    }

                    ll_2.addView(tv, cParams);

                }
            }

        }



        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        // Output: Column 4
        // Set margins and new LinearLayout
        ///////////////////////////////////////////////////
        ///////////////////////////////////////////////////
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        col_spec = GridLayout.spec(3);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(1,1,1,1);
        ll.setLayoutParams(cParams);
        root.addView(ll);


        // Output: Rules void hello
        tv = new TextView(this);
        tv.setText("1 (int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setHeight(64);
        tv.setWidth(800);
        tv.setTextSize(txtSize);
        ll.addView(tv, cParams);

        // Output: Day Hour Classification, Day and Time
        for(int i = 0; i < 2; ++i) {
            tv = new TextView(this);
            tv.setBackgroundColor(Color.WHITE);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(63);
            tv.setWidth(800);
            tv.setTextSize(txtSize);

            if(i == 0){
                tv.setText("Day Hour Classification");
            }
            else{
                tv.setHeight(64);
                tv.setText("Day and Time");
            }

            ll.addView(tv, cParams);
        }

        // Output: A1, System.out.println(greeting + ",World!),
        //         and String greeting
        for(int i = 0; i < 3; ++i){
            tv = new TextView(this);
            tv.setBackgroundColor(0xCCCCFFFF);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(64);
            tv.setWidth(800);
            tv.setTextSize(txtSize);
            tv.setGravity(Gravity.CENTER);

            if(i == 0){
                tv.setText("A1");
                tv.setTypeface(null, Typeface.BOLD);
            }
            else if(i == 1){
                tv.setText("System.out.println(greeting + \",World!\")");
            }
            else{
                tv.setText("String greeting");
            }

            ll.addView(tv, cParams);
        }


        // Output: Greeting, Good Morning, Good Afternoon,
        //         Good Evening, and Good Night
        for(int i = 0; i < 5; ++i){
            tv = new TextView(this);
            tv.setBackgroundColor(0xFFFFCC99);
            tv.setTextColor(Color.BLACK);
            tv.setHeight(64);
            tv.setWidth(800);
            tv.setTextSize(txtSize);

            if(i == 0){
                tv.setText("Greeting");
                tv.setTypeface(null, Typeface.BOLD);
            }
            else if(i == 1){
                tv.setText("Good Morning");
            }
            else if(i == 2){
                tv.setText("Good Afternoon");
            }
            else if(i == 3){
                tv.setText("Good Evening");
            }
            else{
                tv.setText("Good Night");
            }

            ll.addView(tv, cParams);
        }

        setContentView(hsv,cParams);
    }
}
