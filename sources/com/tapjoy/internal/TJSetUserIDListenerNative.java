package com.tapjoy.internal;

import com.tapjoy.TJSetUserIDListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJSetUserIDListenerNative implements TJSetUserIDListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1740a;

    public TJSetUserIDListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1740a = j;
    }

    public static Object create(long j) {
        return new TJSetUserIDListenerNative(j);
    }

    public static native void onSetUserIDFailureNative(long j, String str);

    public static native void onSetUserIDSuccessNative(long j);

    @Override // com.tapjoy.TJSetUserIDListener
    public void onSetUserIDFailure(String str) {
        onSetUserIDFailureNative(this.f1740a, str);
    }

    @Override // com.tapjoy.TJSetUserIDListener
    public void onSetUserIDSuccess() {
        onSetUserIDSuccessNative(this.f1740a);
    }
}
