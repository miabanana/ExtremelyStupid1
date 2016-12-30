package com.huayinghuang.extremelystupid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTitle;
    private ImageView mFuck;
    private RelativeLayout mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTitle = (TextView)findViewById(R.id.title);
        mFuck = (ImageView)findViewById(R.id.fuck);
        mLogin = (RelativeLayout)findViewById(R.id.fbLogin);
//        mLogin.setOnClickListener((v)->);
    }

    private void beforeAnimation() {
        mTitle.setVisibility(View.INVISIBLE);
        mLogin.setVisibility(View.INVISIBLE);
    }
}
