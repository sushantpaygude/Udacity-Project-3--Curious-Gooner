package com.example.sushant.udacityproject3_curiousgooner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by sushant on 14/8/16.
 */
public class ScreenTwoActivity extends MainActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screentwo);

        radioGroup=(RadioGroup)findViewById(R.id.radio_group);
        correct_option=(RadioButton)findViewById(R.id.option_b);
        correct_answer=correct_option.getId();

        answer_select=(Button)findViewById(R.id.button_select);
        answer_select.setOnClickListener(this);
    }



}
