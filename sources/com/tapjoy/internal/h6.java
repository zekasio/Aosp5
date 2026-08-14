package com.tapjoy.internal;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 {
    public static String a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if ("9774d56d682e549c".equals(string)) {
            return null;
        }
        return a.a(string);
    }
}
