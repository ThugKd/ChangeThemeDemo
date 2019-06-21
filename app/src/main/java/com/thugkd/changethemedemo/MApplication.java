package com.thugkd.changethemedemo;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

/**
 * @author : Administrator
 * @date : 2019/6/20.
 */
public class MApplication extends Application {
    private static boolean isNightMode = false;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static void switchNightMode() {
        if (isNightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        isNightMode = !isNightMode;
    }
}
