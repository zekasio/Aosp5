package com.vungle.warren;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.log.LogManager;

/* JADX INFO: loaded from: classes3.dex */
public class VungleLogger {
    public static final int LOGGER_MAX_ENTRIES = 100;
    private static final String TAG = "VungleLogger";
    private static final VungleLogger _instance = new VungleLogger();
    private LogManager logManager;
    private LoggerLevel loggingLevel = LoggerLevel.DEBUG;

    private VungleLogger() {
    }

    static void setupLoggerWithLogLevel(LogManager logManager, LoggerLevel loggerLevel, int i) {
        VungleLogger vungleLogger = _instance;
        vungleLogger.loggingLevel = loggerLevel;
        vungleLogger.logManager = logManager;
        logManager.setMaxEntries(i);
    }

    public static void verbose(String str, String str2) {
        log(LoggerLevel.VERBOSE, str, str2);
    }

    public static void verbose(boolean z, String str, String str2, String str3) {
        if (z) {
            Log.v(str, "[" + str2 + "] " + str3);
        }
        verbose(str2, str3);
    }

    public static void info(String str, String str2) {
        log(LoggerLevel.INFO, str, str2);
    }

    public static void info(boolean z, String str, String str2, String str3) {
        if (z) {
            Log.i(str, "[" + str2 + "] " + str3);
        }
        info(str2, str3);
    }

    public static void debug(String str, String str2) {
        log(LoggerLevel.DEBUG, str, str2);
    }

    public static void debug(boolean z, String str, String str2, String str3) {
        if (z) {
            Log.d(str, "[" + str2 + "] " + str3);
        }
        debug(str2, str3);
    }

    public static void warn(String str, String str2) {
        log(LoggerLevel.WARNING, str, str2);
    }

    public static void warn(boolean z, String str, String str2, String str3) {
        if (z) {
            Log.w(str, "[" + str2 + "] " + str3);
        }
        warn(str2, str3);
    }

    public static void error(String str, String str2) {
        log(LoggerLevel.ERROR, str, str2);
    }

    public static void error(boolean z, String str, String str2, String str3) {
        if (z) {
            Log.e(str, "[" + str2 + "] " + str3);
        }
        error(str2, str3);
    }

    public static void critical(boolean z, String str, String str2, String str3) {
        if (z) {
            Log.e(str, "[" + str2 + "] " + str3);
        }
        error(str2, str3);
    }

    public static void addCustomData(String str, String str2) {
        LogManager logManager = _instance.logManager;
        if (logManager == null) {
            Log.d(TAG, "Please setup Logger first.");
        } else {
            logManager.addCustomData(str, str2);
        }
    }

    public static void removeCustomData(String str) {
        LogManager logManager = _instance.logManager;
        if (logManager == null) {
            Log.d(TAG, "Please setup Logger first.");
        } else {
            logManager.removeCustomData(str);
        }
    }

    private static boolean isLoggable(LoggerLevel loggerLevel) {
        return loggerLevel.level >= _instance.loggingLevel.level;
    }

    private static void log(LoggerLevel loggerLevel, String str, String str2) {
        VungleLogger vungleLogger = _instance;
        LogManager logManager = vungleLogger.logManager;
        if (logManager == null) {
            Log.d(TAG, "Please setup Logger first.");
        } else if (logManager.isLoggingEnabled() && isLoggable(loggerLevel)) {
            vungleLogger.logManager.saveLog(loggerLevel, str, str2, null, null);
        }
    }

    public enum LoggerLevel {
        VERBOSE(0, "verbose"),
        DEBUG(1, TapjoyConstants.TJC_DEBUG),
        INFO(2, TJAdUnitConstants.String.VIDEO_INFO),
        WARNING(3, "warn"),
        ERROR(4, "error"),
        CRASH(5, AppMeasurement.CRASH_ORIGIN);

        private int level;
        private String levelString;

        LoggerLevel(int i, String str) {
            this.level = i;
            this.levelString = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.levelString;
        }
    }
}
