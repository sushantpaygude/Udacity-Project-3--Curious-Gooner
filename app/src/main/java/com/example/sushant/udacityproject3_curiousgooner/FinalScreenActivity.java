package com.example.sushant.udacityproject3_curiousgooner;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sushant on 15/8/16.
 */
public class FinalScreenActivity extends MainActivity {
    TextView display_score;
    TextView display_verdict;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscreen);

        display_verdict=(TextView)findViewById(R.id.text_finalverdict);
        display_score=(TextView)findViewById(R.id.text_finalscore);

        if(final_score>5)
        {
            display_verdict.setText(getResources().getString(R.string.high_score));

        }
        else if(final_score>2 && final_score<6)
        {
            display_verdict.setText(getResources().getString(R.string.average_score));
        }
        else
        {
            display_verdict.setText(getResources().getString(R.string.low_score));
        }
        display_score.setSingleLine(false);
        display_score.setText("Your Score:"+final_score);
    }
}
