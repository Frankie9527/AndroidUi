package org.android.ui;

import android.annotation.SuppressLint;
import android.app.Application;


/**
 * author：jyh
 * QQ：847145851
 * time：2019/4/3
 * describe：
 **/
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init();
    }
    @SuppressLint("StaticFieldLeak")
    private static Application mContext;

    public static Application getContext(){
        return mContext;
    }
}
