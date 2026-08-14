package com.tapjoy.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f1815a;
    public String b;

    public i(SharedPreferences sharedPreferences, String str) {
        this.f1815a = sharedPreferences;
        this.b = str;
    }

    public void a() {
        this.f1815a.edit().remove(this.b).apply();
    }
}
