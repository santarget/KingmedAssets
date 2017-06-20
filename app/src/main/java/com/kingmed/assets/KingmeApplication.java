package com.kingmed.assets;

import android.app.Application;

import com.kingmed.assets.common.Constants;
import com.kingmed.assets.common.CrashHandler;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by ssy on 2017/5/19.
 */

public class KingmeApplication extends Application {
    private static final String TAG = "KingmeApplication";
    private static KingmeApplication instance;
    public static boolean hasLogin;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CrashReport.initCrashReport(getApplicationContext(), Constants.BUGLY_APP_ID, true);//true 开启调试模式
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }

    public static KingmeApplication getInstance() {
        return instance;
    }
}
