package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BN implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ BS A02;
    public final /* synthetic */ String A03;

    public BN(BS bs, String str, long j, long j2) {
        this.A02 = bs;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A02.A01.AA4(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
