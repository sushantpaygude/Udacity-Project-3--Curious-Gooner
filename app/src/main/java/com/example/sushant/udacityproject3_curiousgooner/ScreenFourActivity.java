package com.example.sushant.udacityproject3_curiousgooner;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sushant on 14/8/16.
 */
public class ScreenFourActivity extends MainActivity implements View.OnClickListener {
    EditText editText;
    String user_answer;
    String actual_answer="Dennis Bergkamp";
    Bundle extras;
   // Button answer_select2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenfour);
        editText=(EditText)findViewById(R.id.answer_box);
        answer_select=(Button)findViewById(R.id.button_select);

        answer_select.setOnClickListener(this);

//        extras=getIntent().getExtras();





    }

    @Override
    public void onClick(View v) {
        user_answer=editText.getText().toString();
        checkAnswer(user_answer, actual_answer);


    }


//    public void onClick1(View v)
//    {
//        checkAnswer(user_answer,actual_answer);
//        Log.e("Here:", "" +user_answer);
//    }

    public void checkAnswer(String user_answer,String actual_answer)
    {
        if(user_answer.equalsIgnoreCase(actual_answer)==true)
        {
            Log.e("Result:", "" + user_answer.equals(actual_answer));
            final_score+=1;
        }
        Log.e("Here:", "" + final_score);
        question_number+=1;
        nextActivity(question_number);

//        Log.e("final score", "" + final_score);
//        Log.e("question:", "" + question_number);
    }
}
