package com.example.sushant.udacityproject3_curiousgooner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static int final_score=0;
    static int question_number=0;
    static int selected_option=0;
    static int correct_answer=0;
    static int correct_checked=0;
    Button answer_select;
    TextView question_box;
    RadioGroup radioGroup;
    RadioButton correct_option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_select=(Button)findViewById(R.id.button_select);
        question_box=(TextView)findViewById(R.id.text_question);
        radioGroup=(RadioGroup)findViewById(R.id.radio_group);
        correct_option=(RadioButton)findViewById(R.id.option_a);

        correct_answer=correct_option.getId();
        answer_select.setOnClickListener(this);

    }

    public void onSelectButtonClicked(int selected_option,int correct_answer)
    {


                if (selected_option==correct_answer)
                {
                    final_score+=1;

                }
        question_number+=1;
        nextActivity(question_number);
    }

    public void nextActivity(int question_number)
    {
        switch (question_number) {
            case 1:
                Intent intent = new Intent(this, ScreenTwoActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, ScreenThreeActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent=new Intent(this,ScreenFourActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent=new Intent(this,ScreenFiveActivity.class);
                startActivity(intent);
                break;
            case 5:
                intent=new Intent(this,ScreenSixActivity.class);
                startActivity(intent);
                break;
            case 6:
                correct_checked=0;
                intent=new Intent(this,ScreenSevenActivity.class);
                startActivity(intent);
                break;
            case 7:
                Toast.makeText(this,"Final Score:"+final_score,Toast.LENGTH_LONG).show();
                intent=new Intent(this,FinalScreenActivity.class);
                startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        selected_option=radioGroup.getCheckedRadioButtonId();
       onSelectButtonClicked(selected_option,correct_answer);
    }
}
