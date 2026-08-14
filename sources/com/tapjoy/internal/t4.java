package com.tapjoy.internal;

import com.tapjoy.internal.u4;

/* JADX INFO: loaded from: classes2.dex */
public class t4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u4.a f1912a;

    public t4(u4.a aVar) {
        this.f1912a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        u4.this.f1920a.completeLimitedConnectCall();
    }
}
