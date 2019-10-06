// By: Hector Rodriguez Reyes
// Date: 09/30/19
// Class: CPSC 411
// Time: Tu/Th 4:00-5:15 PM

package com.hector.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.linear_layout_hw1);

        LinearLayout lv = findViewById(R.id.llNum);

        LinearLayout.LayoutParams vParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        vParams.setMargins(1,1,1,1);

        for(int i = 0; i < 11; ++i){
            TextView tv = new TextView(this );
            tv.setText(String.valueOf(i + 1));
            tv.setTextColor(Color.BLACK);
            tv.setBackgroundColor(Color.LTGRAY);
            tv.setHeight(64);
            tv.setTextSize(15);
            tv.setGravity(1);
            lv.addView(tv, vParams);
        }

    }
}
