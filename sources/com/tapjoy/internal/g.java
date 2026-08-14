package com.tapjoy.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class g extends i<Integer> {
    public final int c;

    public g(SharedPreferences sharedPreferences, String str, int i) {
        super(sharedPreferences, str);
        this.c = i;
    }

    public void a(Integer num) {
        if (num != null) {
            a(num.intValue());
        } else {
            a();
        }
    }

    public int b() {
        return this.f1815a.getInt(this.b, this.c);
    }

    public Integer c() {
        return Integer.valueOf(b());
    }

    public void a(int i) {
        this.f1815a.edit().putInt(this.b, i).apply();
    }
}
