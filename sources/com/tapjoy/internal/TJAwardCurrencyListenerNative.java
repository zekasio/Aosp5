package com.tapjoy.internal;

import com.tapjoy.TJAwardCurrencyListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJAwardCurrencyListenerNative implements TJAwardCurrencyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1735a;

    public TJAwardCurrencyListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1735a = j;
    }

    public static Object create(long j) {
        return new TJAwardCurrencyListenerNative(j);
    }

    public static native void onAwardCurrencyResponseFailureNative(long j, String str);

    public static native void onAwardCurrencyResponseNative(long j, String str, int i);

    @Override // com.tapjoy.TJAwardCurrencyListener
    public void onAwardCurrencyResponse(String str, int i) {
        onAwardCurrencyResponseNative(this.f1735a, str, i);
    }

    @Override // com.tapjoy.TJAwardCurrencyListener
    public void onAwardCurrencyResponseFailure(String str) {
        onAwardCurrencyResponseFailureNative(this.f1735a, str);
    }
}
