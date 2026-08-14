package com.tapjoy.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1918a;

    public u1(String str) {
        this.f1918a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f1918a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return number instanceof Integer ? intValue() == number.intValue() : number instanceof Long ? longValue() == number.longValue() : number instanceof Float ? floatValue() == number.floatValue() : number instanceof Double ? doubleValue() == number.doubleValue() : this.f1918a.equals(number.toString());
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f1918a);
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f1918a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f1918a);
            }
        } catch (NumberFormatException unused2) {
            return new BigInteger(this.f1918a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f1918a);
        } catch (NumberFormatException unused) {
            return new BigInteger(this.f1918a).longValue();
        }
    }

    public String toString() {
        return this.f1918a;
    }
}
