package com.yuan.a2024jissen.utils;

import android.app.Application;

import com.yuan.a2024jissen.db.DBManager;

/* 表示全局应用的类*/
public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化数据库
        DBManager.initDB(getApplicationContext());
    }
}
