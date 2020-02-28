package com.example.relative_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.relative_application.gridview.GridViewActivity;
import com.example.relative_application.jump.AActivity;
import com.example.relative_application.listview.ListViewActivity;
import com.example.relative_application.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView,mBtnListView,mBtnGridView,mRv;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgressBar;
    private Button mBtnCustomDialog;
    private Button mBtnPopUpWindow;
    private Button mBtnJump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnGridView = (Button) findViewById(R.id.btn_gridview);
        mRv = (Button) findViewById(R.id.btn_recycleview);
        mBtnWebView = (Button) findViewById(R.id.btn_webview);
        mBtnToast = (Button) findViewById(R.id.btn_toast);
        mBtnDialog = (Button) findViewById(R.id.btn_dialog);
        mBtnProgressBar = (Button) findViewById(R.id.btn_progressbar);
        mBtnCustomDialog = (Button) findViewById(R.id.btn_custom_dialog_view);
        mBtnPopUpWindow = (Button) findViewById(R.id.btn_pop_upwindow);
        mBtnJump = (Button) findViewById(R.id.btn_jump);
        setListeners();
    }
    private void setListeners(){
        OnClick onclick = new OnClick();
        mBtnButton.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnEditText.setOnClickListener(onclick);
        mBtnTextView.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mBtnListView.setOnClickListener(onclick);
        mBtnGridView.setOnClickListener(onclick);
        mRv.setOnClickListener(onclick);
        mBtnWebView.setOnClickListener(onclick);
        mBtnToast.setOnClickListener(onclick);
        mBtnDialog.setOnClickListener(onclick);
        mBtnProgressBar.setOnClickListener(onclick);
        mBtnCustomDialog.setOnClickListener(onclick);
        mBtnPopUpWindow.setOnClickListener(onclick);
        mBtnJump.setOnClickListener(onclick);
    }
    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch(v.getId()){
                case R.id.btn_button:
                    intent = new Intent(UIActivity.this,Activity_Button.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(UIActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(UIActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(UIActivity.this,ImageViewActivity.class);
                    break;
                case  R.id.btn_listview:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_recycleview:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent = new Intent(UIActivity.this,WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this,ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this,DialogActivity.class);
                    break;
                case R.id.btn_progressbar:
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                case R.id.btn_custom_dialog_view:
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;
                case R.id.btn_pop_upwindow:
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;
                case R.id.btn_jump:
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
