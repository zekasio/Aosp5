package com.tapjoy.internal;

import com.tapjoy.TJConnectListener;
import com.tapjoy.internal.c6;

/* JADX INFO: loaded from: classes2.dex */
public class b6 implements TJConnectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c6 f1762a;

    public b6(c6 c6Var) {
        this.f1762a = c6Var;
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectFailure() {
        this.f1762a.a(false);
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectSuccess() {
        c6 c6Var = this.f1762a;
        c6.c cVar = c6.c.CONNECTED;
        c6.c cVar2 = c6.c.TRYING;
        c6Var.a(cVar);
        this.f1762a.a(true);
    }
}
