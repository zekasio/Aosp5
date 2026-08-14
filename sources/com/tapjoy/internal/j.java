package com.tapjoy.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class j extends i<String> {
    public final String c;

    public j(SharedPreferences sharedPreferences, String str, String str2) {
        super(sharedPreferences, str);
        this.c = str2;
    }

    public void a(String str) {
        this.f1815a.edit().putString(this.b, str).apply();
    }

    public String b() {
        return this.f1815a.getString(this.b, this.c);
    }
}
