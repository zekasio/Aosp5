package com.tapjoy.internal;

import com.tapjoy.TJConnectListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJConnectListenerNative implements TJConnectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1736a;

    public TJConnectListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1736a = j;
    }

    public static Object create(long j) {
        return new TJConnectListenerNative(j);
    }

    public static native void onConnectFailureNative(long j);

    public static native void onConnectSuccessNative(long j);

    @Override // com.tapjoy.TJConnectListener
    public void onConnectFailure() {
        onConnectFailureNative(this.f1736a);
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectSuccess() {
        onConnectSuccessNative(this.f1736a);
    }
}
