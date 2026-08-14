package com.tapjoy.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class h extends i<Long> {
    public final long c;

    public h(SharedPreferences sharedPreferences, String str, long j) {
        super(sharedPreferences, str);
        this.c = j;
    }

    public SharedPreferences.Editor a(SharedPreferences.Editor editor, Long l) {
        if (l == null) {
            return editor.remove(this.b);
        }
        return editor.putLong(this.b, l.longValue());
    }

    public long b() {
        return this.f1815a.getLong(this.b, this.c);
    }
}
