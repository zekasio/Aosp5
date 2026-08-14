package com.tapjoy.internal;

import com.tapjoy.internal.s4;

/* JADX INFO: loaded from: classes2.dex */
public class r4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s4.a f1897a;

    public r4(s4.a aVar) {
        this.f1897a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s4.this.f1904a.completeConnectCall();
    }
}
