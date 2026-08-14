package com.vungle.warren.log;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.log.LogManager;
import java.lang.Thread;

/* JADX INFO: loaded from: classes3.dex */
class JVMCrashCollector implements Thread.UncaughtExceptionHandler {
    private String collectFilter = LogManager.sDefaultCollectFilter;
    private final Thread.UncaughtExceptionHandler defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
    private LogManager.SdkLoggingEventListener sdkLoggingEventListener;

    JVMCrashCollector(LogManager.SdkLoggingEventListener sdkLoggingEventListener) {
        this.sdkLoggingEventListener = sdkLoggingEventListener;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.sdkLoggingEventListener.isCrashReportEnabled() && thread != null && th != null) {
            boolean z = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                StackTraceElement[] stackTrace = cause.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (stackTrace[i].getClassName().startsWith(this.collectFilter)) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                this.sdkLoggingEventListener.saveLog(VungleLogger.LoggerLevel.CRASH, AppMeasurement.CRASH_ORIGIN, Log.getStackTraceString(th), th.getClass().toString(), String.valueOf(thread.getId()));
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    void updateConfig(String str) {
        this.collectFilter = str;
    }
}
