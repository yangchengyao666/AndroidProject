package com.example.relative_application;

import android.app.Activity;
import android.view.View;

import com.example.relative_application.util.ToastUtil;
//传入一个activity
public class MyClickListener implements View.OnClickListener {

    private Activity mActivity;

    public MyClickListener(Activity activity){
        this.mActivity = activity;
    }
    @Override
    public void onClick(View v) {
        ToastUtil.showMsg(mActivity,"click...");
    }
}
