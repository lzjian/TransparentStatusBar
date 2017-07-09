package com.lzjian.transparentstatusbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 设置状态栏半透明首先要满足SDK版本大于或等于19,
        // 然后在values-v19里设置android:windowTranslucentStatus参数为true,再调用如下方法
        StatusBarUtils.setStatusBarColor(this, R.color.app_color);

    }
}
