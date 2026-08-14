package com.tapjoy.internal;

import com.tapjoy.TJSpendCurrencyListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJSpendCurrencyListenerNative implements TJSpendCurrencyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1741a;

    public TJSpendCurrencyListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1741a = j;
    }

    public static Object create(long j) {
        return new TJSpendCurrencyListenerNative(j);
    }

    public static native void onSpendCurrencyResponseFailureNative(long j, String str);

    public static native void onSpendCurrencyResponseNative(long j, String str, int i);

    @Override // com.tapjoy.TJSpendCurrencyListener
    public void onSpendCurrencyResponse(String str, int i) {
        onSpendCurrencyResponseNative(this.f1741a, str, i);
    }

    @Override // com.tapjoy.TJSpendCurrencyListener
    public void onSpendCurrencyResponseFailure(String str) {
        onSpendCurrencyResponseFailureNative(this.f1741a, str);
    }
}
