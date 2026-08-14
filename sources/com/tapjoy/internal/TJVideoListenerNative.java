package com.tapjoy.internal;

import com.tapjoy.TJVideoListener;

/* JADX INFO: loaded from: classes2.dex */
public class TJVideoListenerNative implements TJVideoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1742a;

    public TJVideoListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f1742a = j;
    }

    public static Object create(long j) {
        return new TJVideoListenerNative(j);
    }

    public static native void onVideoCompleteNative(long j);

    public static native void onVideoErrorNative(long j, int i);

    public static native void onVideoStartNative(long j);

    @Override // com.tapjoy.TJVideoListener
    public void onVideoComplete() {
        onVideoCompleteNative(this.f1742a);
    }

    @Override // com.tapjoy.TJVideoListener
    public void onVideoError(int i) {
        onVideoErrorNative(this.f1742a, i);
    }

    @Override // com.tapjoy.TJVideoListener
    public void onVideoStart() {
        onVideoStartNative(this.f1742a);
    }
}
