package com.example.relative_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.relative_application.datastorage.DataStorageActivity;
import com.example.relative_application.fragment.ContainerActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUI;
    private Button mBtnFragment;
    private Button mBtnEvent;
    private Button mBtnData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI = findViewById(R.id.btn_ui);
        mBtnFragment = findViewById(R.id.btn_fragment);
        mBtnEvent = findViewById(R.id.btn_event);
        mBtnData = findViewById(R.id.btn_data);
        Onclick onclick = new Onclick();

        mBtnUI.setOnClickListener(onclick);
        mBtnFragment.setOnClickListener(onclick);
        mBtnEvent.setOnClickListener(onclick);
        mBtnData.setOnClickListener(onclick);

        //请求访问外部储存权限
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);

    }

    class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this, UIActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(MainActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_event:
                    intent = new Intent(MainActivity.this,EventActivity.class);
                    break;
                case R.id.btn_data:
                    intent = new Intent(MainActivity.this, DataStorageActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
