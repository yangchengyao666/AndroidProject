package com.example.relative_application.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.relative_application.R;

import java.util.prefs.Preferences;

public class SharedPreferencesActivity extends AppCompatActivity {

    private EditText mEtName;
    private Button mBtnSave,mBtnShow;
    private TextView mTvShow;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor meditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        mEtName = findViewById(R.id.ed_name);
        mBtnSave = findViewById(R.id.btn_save);
        mBtnShow = findViewById(R.id.btn_show);
        mTvShow = findViewById(R.id.tv_show);

        //存储文件,存储在了android虚拟机里面  /data/data/<applicationid>(不是包名，默认是包名)/shared_prefs/data.xml
        mSharedPreferences = this.getSharedPreferences("data",MODE_PRIVATE);//文件名称,文件模式MODE_PRIVATE表示只有本应于app才可以读写
        meditor = mSharedPreferences.edit();
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //把EditText里面的内容保存到文件中
                meditor.putString("name",mEtName.getText().toString());
                meditor.apply();
            }
        });
        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvShow.setText(mSharedPreferences.getString("name",""));
            }
        });
    }
}
