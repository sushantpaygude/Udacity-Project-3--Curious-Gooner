package com.example.sushant.udacityproject3_curiousgooner;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by sushant on 15/8/16.
 */
public class ScreenSixActivity extends MainActivity{
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;

    static int correct_answer1,correct_answer2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screensix);

        checkBox1=(CheckBox)findViewById(R.id.checkbox_a);
        checkBox2=(CheckBox)findViewById(R.id.checkbox_b);
        checkBox3=(CheckBox)findViewById(R.id.checkbox_c);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);

        answer_select=(Button)findViewById(R.id.button_select);
        answer_select.setOnClickListener(this);

        correct_answer1=checkBox1.getId();
        correct_answer2=checkBox2.getId();
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.checkbox_a:

                if(checkBox1.isChecked())
                {
                    Log.e("1 is checked",""+1);
                    int checkBoxChecked=checkBox1.getId();
                    getCorrectCheckbox(checkBoxChecked,correct_answer1,correct_answer2);
                    checkBox1.setEnabled(false);
                }
                break;
            case R.id.checkbox_b:
                if(checkBox2.isChecked())
                {
                    int checkBoxChecked=checkBox2.getId();
                    getCorrectCheckbox(checkBoxChecked,correct_answer1,correct_answer2);
                    checkBox2.setEnabled(false);
                }
                break;
            case R.id.checkbox_c:
            if(checkBox3.isChecked())
            {
                int checkBoxChecked=checkBox3.getId();
                getCorrectCheckbox(checkBoxChecked,correct_answer1,correct_answer2);
                checkBox3.setEnabled(false);
            }
                break;
            case R.id.button_select:
                if (correct_checked==2)
                {
                    final_score+=1;
                }
                Log.e("Final Score:",""+final_score);
                question_number+=1;
                nextActivity(question_number);
                break;
        }
    }

    public void getCorrectCheckbox(int checkBoxChecked,int correct_answer1,int correct_answer2)
    {
        if((checkBoxChecked==correct_answer1)|| (checkBoxChecked==correct_answer2))
            {
                correct_checked+=1;
            }

        else
            {
                correct_checked-=1;
            }
        Log.e("Correct checked:",""+correct_checked);
    }
}
