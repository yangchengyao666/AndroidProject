package com.example.relative_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Button extends AppCompatActivity {

    private Button button3;
    private TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__button);
        button3 = (Button) findViewById(R.id.btn_3);
        textview1 = (TextView)findViewById(R.id.tv_1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(Activity_Button.this,"我被点击了",Toast.LENGTH_LONG).show();
            }
        });
        textview1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Activity_Button.this,"textview1被点击了",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"我被点击了",Toast.LENGTH_SHORT).show();
    }
}
