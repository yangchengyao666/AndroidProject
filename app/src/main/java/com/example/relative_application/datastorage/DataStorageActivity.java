package com.example.relative_application.datastorage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.IntentCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.relative_application.R;

public class DataStorageActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnSharedPreferences;
    private Button mBtnFile;
    private Button mBtnFileOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage);
        mBtnSharedPreferences = findViewById(R.id.btn_sharedpreferences);
        mBtnFile = findViewById(R.id.btn_file);
        mBtnFileOut = findViewById(R.id.btn_file_out);
        mBtnSharedPreferences.setOnClickListener(this);
        mBtnFile.setOnClickListener(this);
        mBtnFileOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btn_sharedpreferences:
                intent = new Intent(DataStorageActivity.this,SharedPreferencesActivity.class);
                break;
            case R.id.btn_file:
                intent = new Intent(DataStorageActivity.this,FileActivity.class);
                break;
            case R.id.btn_file_out:
                intent = new Intent(DataStorageActivity.this,FileActivityOut.class);
                break;
        }
        startActivity(intent);
    }
}
