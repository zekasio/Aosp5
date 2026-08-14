package com.tapjoy.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class f extends i<Double> {
    public final double c;

    public f(SharedPreferences sharedPreferences, String str, double d) {
        super(sharedPreferences, str);
        this.c = d;
    }

    public SharedPreferences.Editor a(SharedPreferences.Editor editor, Double d) {
        if (d == null) {
            return editor.remove(this.b);
        }
        return editor.putString(this.b, Double.toString(d.doubleValue()));
    }

    public double b() {
        String string = this.f1815a.getString(this.b, null);
        if (string != null) {
            try {
                return Double.parseDouble(string);
            } catch (NumberFormatException unused) {
            }
        }
        return this.c;
    }
}
