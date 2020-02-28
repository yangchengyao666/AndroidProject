package com.example.relative_application;


import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4 = (TextView) findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv4.getPaint().setAntiAlias(true);
    }
}
