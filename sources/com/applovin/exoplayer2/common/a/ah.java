package com.applovin.exoplayer2.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public static <T> T[] a(T[] tArr, int i) {
        return (T[]) aj.a(tArr, i);
    }

    static Object[] a(Object... objArr) {
        return b(objArr, objArr.length);
    }

    static Object[] b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }
}
