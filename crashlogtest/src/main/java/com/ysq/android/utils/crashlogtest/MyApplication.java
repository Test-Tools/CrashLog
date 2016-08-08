package com.ysq.android.utils.crashlogtest;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.ysq.android.utils.crashlog.CrashLogHandlerUtils;

/**
 * Created by ysq on 16/8/8.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashLogHandlerUtils.getInstance(this).setSavePath(getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)).start();
        Log.d("保存路径", getFilesDir().toString());
    }
}
