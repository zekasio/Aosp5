package com.applovin.exoplayer2.common.a;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class aj {
    static <K, V> Map<K, V> a(int i) {
        return l.a(i);
    }

    static <K, V> Map<K, V> a() {
        return l.a();
    }

    static <T> T[] a(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
