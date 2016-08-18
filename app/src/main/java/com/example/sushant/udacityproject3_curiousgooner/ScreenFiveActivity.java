package com.example.sushant.udacityproject3_curiousgooner;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sushant on 15/8/16.
 */
public class ScreenFiveActivity extends ScreenFourActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenfive);
        actual_answer="13";
        editText=(EditText)findViewById(R.id.answer_box);
        answer_select=(Button)findViewById(R.id.button_select);

        answer_select.setOnClickListener(this);


    }
}
