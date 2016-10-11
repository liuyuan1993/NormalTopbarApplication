package com.example.administrator.normaltopbarapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by liuyuan on 2016/10/11 0011.
 */
public class NormalTopBar extends LinearLayout{
     TextView tvTitle;
     TextView tvBack;


    public NormalTopBar(Context context) {
        this(context, null);
    }

    public NormalTopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.layout_topbar, this);
        initView();
    }

    private void initView() {
       tvTitle=(TextView)findViewById(R.id.tv_title);
        tvBack=(TextView)findViewById(R.id.tv_back);

    }
    public void setBackVisiable(boolean visiable){
        if(visiable){
            tvBack.setVisibility(View.VISIBLE);
        }else{
            tvBack.setVisibility(View.INVISIBLE);
        }
    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setBackClickListener(OnClickListener listener){
        tvBack.setOnClickListener(listener);
    }



}
