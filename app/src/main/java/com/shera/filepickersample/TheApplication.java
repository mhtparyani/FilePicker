package com.shera.filepickersample;

import android.app.Application;

/**
 * Created by Shera
 * Date: 2019/04/27
 * Time: 14:46
 */

public class TheApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new LocalFileUncaughtExceptionHandler(this,
                Thread.getDefaultUncaughtExceptionHandler()));
    }
}
