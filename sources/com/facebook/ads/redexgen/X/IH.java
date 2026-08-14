package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IH extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C0860Um A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IH(C0860Um c0860Um, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c0860Um;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            L0.A00(th2, this);
        }
    }
}
