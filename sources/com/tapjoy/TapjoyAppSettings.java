package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tapjoy.internal.w1;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyAppSettings {
    public static final String TAG = "TapjoyAppSettings";
    public static TapjoyAppSettings d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1718a;
    public SharedPreferences b;
    public String c;

    public TapjoyAppSettings(Context context) {
        this.f1718a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        this.b = sharedPreferences;
        String string = sharedPreferences.getString(TapjoyConstants.PREF_LOG_LEVEL, null);
        this.c = string;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String str = TAG;
        StringBuilder sbA = w1.a("restoreLoggingLevel from sharedPref -- loggingLevel=");
        sbA.append(this.c);
        TapjoyLog.d(str, sbA.toString());
        a(this.c);
    }

    public static TapjoyAppSettings getInstance() {
        return d;
    }

    public static void init(Context context) {
        TapjoyLog.d(TAG, "initializing app settings");
        d = new TapjoyAppSettings(context);
    }

    public final void a(String str) {
        TapjoyLog.a(str, true);
    }

    public void clearLoggingLevel() {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.remove(TapjoyConstants.PREF_LOG_LEVEL);
        editorEdit.apply();
        this.c = null;
        boolean zIsLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str = TAG;
        StringBuilder sbA = w1.a("Tapjoy remote device debugging 'Disabled'. The SDK Debug-setting is: ");
        sbA.append(zIsLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.i(str, sbA.toString());
        TapjoyLog.setDebugEnabled(zIsLoggingEnabled);
    }

    public String getConnectResult(String str, long j) {
        String string = this.b.getString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, null);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str) && str.equals(this.b.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, null))) {
            long j2 = this.b.getLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, -1L);
            if (j2 < 0 || j2 >= j) {
                return string;
            }
        }
        return null;
    }

    public void removeConnectResult() {
        if (this.b.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, null) != null) {
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT);
            editorEdit.remove(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH);
            editorEdit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            TapjoyLog.i(TAG, "Removed connect result");
            editorEdit.apply();
        }
    }

    public void saveConnectResultAndParams(String str, String str2, long j) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, str);
        editorEdit.putString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, str2);
        if (j >= 0) {
            editorEdit.putLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, j);
        } else {
            editorEdit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
        }
        TapjoyLog.i(TAG, "Stored connect result");
        editorEdit.apply();
    }

    public void saveLoggingLevel(String str) {
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.d(TAG, "saveLoggingLevel -- server logging level is NULL or Empty string");
            return;
        }
        String str2 = TAG;
        StringBuilder sbA = w1.a("saveLoggingLevel -- currentLevel=");
        sbA.append(this.c);
        sbA.append(";newLevel=");
        sbA.append(str);
        TapjoyLog.d(str2, sbA.toString());
        if (TextUtils.isEmpty(this.c) || !this.c.equals(str)) {
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.putString(TapjoyConstants.PREF_LOG_LEVEL, str);
            editorEdit.apply();
            this.c = str;
            TapjoyLog.a(str, true);
        }
        boolean zIsLoggingEnabled = TapjoyLog.isLoggingEnabled();
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging set to '");
        sb.append(str);
        sb.append("'. The SDK Debug-setting is: ");
        sb.append(zIsLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.i(str2, sb.toString());
    }

    public String a() {
        return this.c;
    }
}
