package com.tapjoy.internal;

import com.tapjoy.TJEarnedCurrencyListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJEarnedCurrencyListenerNative implements TJEarnedCurrencyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1737a;

    public TJEarnedCurrencyListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1737a = j;
    }

    public static Object create(long j) {
        return new TJEarnedCurrencyListenerNative(j);
    }

    public static native void onEarnedCurrencyNative(long j, String str, int i);

    @Override // com.tapjoy.TJEarnedCurrencyListener
    public void onEarnedCurrency(String str, int i) {
        onEarnedCurrencyNative(this.f1737a, str, i);
    }
}
