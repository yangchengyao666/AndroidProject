package com.example.relative_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.relative_application.util.ToastUtil;
import com.example.relative_application.widget.MyButton;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnEvent;
    private MyButton btnMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mBtnEvent = findViewById(R.id.btn_events);

        //1.通过内部类实现事件处理
        //mBtnEvent.setOnClickListener(new Onclick());

        //2.通过匿名内部类实现
//        mBtnEvent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ToastUtil.showMsg(EventActivity.this,"click...");
//            }
//        });

        //3.通过事件源所在类实现
//        mBtnEvent.setOnClickListener(EventActivity.this);

        //4.通过外部类实现
        mBtnEvent.setOnClickListener(new MyClickListener(EventActivity.this));

        btnMy = findViewById(R.id.btn_mybutton);
        if(btnMy != null)
            Log.v("难受",btnMy.toString());
    }

    //通过内部类实现事件处理
//    class Onclick implements View.OnClickListener{
//        //Intent intent;
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()){
//                case R.id.btn_events:
//                    ToastUtil.showMsg(EventActivity.this,"click...");
//                    break;
//            }
//        }
//    }

    //通过事件源所在类实现
    @Override
    public void onClick(View v) {
        switch (v.getId()){
                case R.id.btn_events:
                    ToastUtil.showMsg(EventActivity.this,"click...");
                    break;
            }
    }

    //5.下面这个函数必须是public void,并且传入view，这个函数是在布局文件中调用的
    public void show(View v){
        switch (v.getId()){
            case R.id.btn_events:
                ToastUtil.showMsg(EventActivity.this,"click...");
                break;
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
        }
        return false;
    }
}
