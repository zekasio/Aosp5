package com.tapjoy.internal;

import com.tapjoy.TapjoyLog;

/* JADX INFO: loaded from: classes2.dex */
public class m4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4 f1851a;

    public m4(n4 n4Var) {
        this.f1851a = n4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1851a.c.b();
        } catch (Exception e) {
            StringBuilder sbA = w1.a("Failed to start with exception: ");
            sbA.append(e.getMessage());
            TapjoyLog.d("TJOMViewabilityAgent", sbA.toString());
        }
    }
}
