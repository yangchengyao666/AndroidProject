package com.example.relative_application.jump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.relative_application.R;
import com.example.relative_application.util.ToastUtil;

public class BActivity extends AppCompatActivity {

    private TextView mTvTitle;
    private Button mBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        mTvTitle = findViewById(R.id.tv_title);
        final Bundle bundle = getIntent().getExtras();//从前一页面取数据
        String name = bundle.getString("name");
        int num = bundle.getInt("number");
        mTvTitle.setText(name + "," + num);
        mBtn = findViewById(R.id.btn_finish);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle1 = new Bundle();
                bundle1.putString("title","我回来了");
                intent.putExtras(bundle1);
                setResult(Activity.RESULT_OK,intent);
                finish();//关闭当前页面
            }
        });
    }

}
