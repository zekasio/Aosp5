package com.tapjoy.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class e extends i<Boolean> {
    public final boolean c;

    public e(SharedPreferences sharedPreferences, String str, boolean z) {
        super(sharedPreferences, str);
        this.c = z;
    }

    public void a(boolean z) {
        this.f1815a.edit().putBoolean(this.b, z).apply();
    }
}
