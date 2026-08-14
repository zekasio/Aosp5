package com.vungle.warren.utility;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadUtil {
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    public static boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return mainLooper.isCurrentThread();
        }
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null && mainLooper.getThread().equals(looperMyLooper.getThread());
    }

    public static void runOnUiThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            UI_HANDLER.post(runnable);
        }
    }
}
