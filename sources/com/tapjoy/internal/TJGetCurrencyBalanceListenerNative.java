package com.tapjoy.internal;

import com.tapjoy.TJGetCurrencyBalanceListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJGetCurrencyBalanceListenerNative implements TJGetCurrencyBalanceListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1738a;

    public TJGetCurrencyBalanceListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1738a = j;
    }

    public static Object create(long j) {
        return new TJGetCurrencyBalanceListenerNative(j);
    }

    public static native void onGetCurrencyBalanceResponseFailureNative(long j, String str);

    public static native void onGetCurrencyBalanceResponseNative(long j, String str, int i);

    @Override // com.tapjoy.TJGetCurrencyBalanceListener
    public void onGetCurrencyBalanceResponse(String str, int i) {
        onGetCurrencyBalanceResponseNative(this.f1738a, str, i);
    }

    @Override // com.tapjoy.TJGetCurrencyBalanceListener
    public void onGetCurrencyBalanceResponseFailure(String str) {
        onGetCurrencyBalanceResponseFailureNative(this.f1738a, str);
    }
}
