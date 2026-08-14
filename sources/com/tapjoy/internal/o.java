package com.tapjoy.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f1868a;

    public o(Handler handler) {
        this.f1868a = handler;
    }

    @Override // com.tapjoy.internal.o0
    public boolean a(Runnable runnable) {
        return this.f1868a.post(runnable);
    }
}
