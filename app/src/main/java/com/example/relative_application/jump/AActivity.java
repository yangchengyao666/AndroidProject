package com.example.relative_application.jump;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.relative_application.R;
import com.example.relative_application.util.ToastUtil;

public class AActivity extends AppCompatActivity {
    private Button Btnjump;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Btnjump = (Button) findViewById(R.id.jump);
        Btnjump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式跳转1
                Intent intent = new Intent(AActivity.this,BActivity.class);
                //数据传递
                Bundle bundle = new Bundle();
                bundle.putString("name","小小怪");
                bundle.putInt("number",666);
                intent.putExtras(bundle);
                //startActivity(intent);

                //从bActivity获取b回调的信息
                startActivityForResult(intent,0);








                //显式跳转2
//                Intent intent = new Intent();
//                intent.setClass(AActivity.this,BActivity.class);
//                startActivity(intent);

                //显式跳转3
//                Intent intent = new Intent();
//                intent.setClassName(AActivity.this,"com.example.relative_application.jump.BActivity");
//                startActivity(intent);

                //显式跳转4
//                Intent intent = new Intent();
//                intent.setComponent(new ComponentName(AActivity.this,"com.example.relative_application.jump.BActivity"));
//                startActivity(intent);

                //隐式调用
//                Intent intent = new Intent();
//                intent.setAction("com.ex.test.bactivity.suibianxie");
//                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ToastUtil.showMsg(AActivity.this,data.getExtras().getString("title"));
    }
}
