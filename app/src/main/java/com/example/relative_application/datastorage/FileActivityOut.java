package com.example.relative_application.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.relative_application.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//外部存储，存储在sd卡上
public class FileActivityOut extends AppCompatActivity {

    private EditText mEtName;
    private Button mBtnSave,mBtnShow;
    private TextView mTvShow;
    private final String mFileName = "test.txt";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        mEtName = findViewById(R.id.ed_name);
        mBtnSave = findViewById(R.id.btn_save);
        mBtnShow = findViewById(R.id.btn_show);
        mTvShow = findViewById(R.id.tv_show);

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(mEtName.getText().toString().trim());//trim取出前后空格
            }
        });
        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvShow.setText(read());
            }
        });
    }
    //存储数据
    private void save(String content){
        FileOutputStream fileOutputStream = null;
        try {
            //在sd卡新建一个文件夹mypack，把文件存到里面
            File dir = new File(getExternalFilesDir(null),"mypack");
            if(!dir.exists()){
                dir.mkdirs();//如果不存在就新建这个文件夹
            }
            File file = new File(dir,mFileName);
            if(!file.exists()){
                file.createNewFile();
            }//新建test.txt

            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //读取数据
    private String read(){
        FileInputStream fileInputStream = null;
        try {//File.separator是“/”的意思
            File file = new File(getExternalFilesDir(null).getAbsolutePath() + File.separator + "mypack",mFileName);
            fileInputStream = new FileInputStream(file);
            byte[] buff = new byte[1024];
            StringBuilder sb = new StringBuilder("");//StringBuilder可以实现字符串的拼接,不直接用String
            int len = 0;
            while ((len = fileInputStream.read(buff)) > 0){
                sb.append(new String(buff,0,len));
            }
            return sb.toString();
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
