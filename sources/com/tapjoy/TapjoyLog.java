package com.tapjoy;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.w1;
import com.tapjoy.internal.z6;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyLog {
    public static boolean b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1730a = 6;
    public static int c = f1730a;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TapjoyLog.a();
            TapjoyLog.d("TapjoyLog", "Enabling WebView debugging");
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    public static /* synthetic */ String a() {
        return "TapjoyLog";
    }

    public static void a(String str, boolean z) {
        if (!z && TapjoyAppSettings.getInstance() != null && TapjoyAppSettings.getInstance().a() != null) {
            d("TapjoyLog", "setLoggingLevel -- log setting already persisted");
            return;
        }
        if (str.equals(TapjoyConstants.LOG_LEVEL_INTERNAL)) {
            c = 2;
            new Handler(Looper.getMainLooper()).post(new a());
        } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_ON)) {
            c = 4;
        } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_OFF)) {
            c = 6;
        } else {
            d("TapjoyLog", "unrecognized loggingLevel: " + str);
            c = 6;
        }
        StringBuilder sbA = w1.a("logThreshold=");
        sbA.append(c);
        d("TapjoyLog", sbA.toString());
    }

    public static void d(String str, String str2) {
        a(3, str, str2);
    }

    public static void e(String str, String str2) {
        e(str, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, str2));
    }

    public static void i(String str, String str2) {
        a(4, str, str2);
    }

    public static boolean isLoggingEnabled() {
        return b;
    }

    public static void setDebugEnabled(boolean z) {
        b = z;
        z6.r.a(z);
        if (b) {
            a(TapjoyConstants.LOG_LEVEL_DEBUG_ON, false);
        } else {
            a(TapjoyConstants.LOG_LEVEL_DEBUG_OFF, false);
        }
    }

    public static void setInternalLogging(boolean z) {
        if (z) {
            a(TapjoyConstants.LOG_LEVEL_INTERNAL, true);
        }
    }

    public static void v(String str, String str2) {
        a(2, str, str2);
    }

    public static void w(String str, String str2) {
        a(5, str, str2);
    }

    public static void e(String str, TapjoyErrorMessage tapjoyErrorMessage) {
        if (tapjoyErrorMessage != null) {
            if (c == 2 || tapjoyErrorMessage.getType() != TapjoyErrorMessage.ErrorType.INTERNAL_ERROR) {
                a(6, str, tapjoyErrorMessage.toString());
            }
        }
    }

    public static void a(int i, String str, String str2) {
        String str3 = "TapjoyLog:" + str;
        if (c <= i) {
            if (str2.length() > 4096) {
                int i2 = 0;
                while (i2 <= str2.length() / 4096) {
                    int i3 = i2 * 4096;
                    i2++;
                    int length = i2 * 4096;
                    if (length > str2.length()) {
                        length = str2.length();
                    }
                    Log.println(i, str3, str2.substring(i3, length));
                }
                return;
            }
            Log.println(i, str3, str2);
        }
    }
}
