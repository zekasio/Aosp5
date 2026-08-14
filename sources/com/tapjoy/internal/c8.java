package com.tapjoy.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1775a;
    public int b;

    public static c8 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            c8 c8Var = new c8();
            int length = str.length() - 1;
            char cCharAt = str.charAt(length);
            if (cCharAt == 'w') {
                c8Var.f1775a = Float.valueOf(str.substring(0, length)).floatValue();
                c8Var.b = 1;
            } else if (cCharAt == 'h') {
                c8Var.f1775a = Float.valueOf(str.substring(0, length)).floatValue();
                c8Var.b = 2;
            } else {
                c8Var.f1775a = Float.valueOf(str).floatValue();
                c8Var.b = 0;
            }
            return c8Var;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public float a(float f, float f2) {
        int i = this.b;
        if (i == 1) {
            return (this.f1775a * f) / 100.0f;
        }
        if (i == 2) {
            return (this.f1775a * f2) / 100.0f;
        }
        return this.f1775a;
    }
}
