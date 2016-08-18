package com.example.sushant.udacityproject3_curiousgooner;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by sushant on 15/8/16.
 */
public class ScreenSevenActivity extends ScreenSixActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenseven);

        checkBox1=(CheckBox)findViewById(R.id.checkbox_a);
        checkBox2=(CheckBox)findViewById(R.id.checkbox_b);
        checkBox3=(CheckBox)findViewById(R.id.checkbox_c);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);

        answer_select=(Button)findViewById(R.id.button_select);
        answer_select.setOnClickListener(this);

        correct_answer1=checkBox2.getId();
        correct_answer2=checkBox3.getId();
    }
}
