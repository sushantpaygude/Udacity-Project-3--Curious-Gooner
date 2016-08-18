package com.example.sushant.udacityproject3_curiousgooner;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sushant on 15/8/16.
 */
public class StartScreenActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texttitle;
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        texttitle=(TextView)findViewById(R.id.text_title);
        start=(Button)findViewById(R.id.button_start);
        start.setOnClickListener(this);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/headliner.ttf");
        texttitle.setTypeface(typeface);
        typeface=Typeface.createFromAsset(getAssets(),"fonts/Capture_it.ttf");
        start.setTypeface(typeface);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
