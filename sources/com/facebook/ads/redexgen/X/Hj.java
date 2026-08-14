package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Hj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ V8 A03;

    public Hj(V8 v8, int i, long j, long j2) {
        this.A03 = v8;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A03.A07.AAB(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
