package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JM A02;

    public JI(JM jm, int i, long j) {
        this.A02 = jm;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A02.A01.AAe(this.A00, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
