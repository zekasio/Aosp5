package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Cq {
    public final InterfaceC0417Co A00;

    public abstract void A0B(C0551Ij c0551Ij, long j) throws C0360Af;

    public abstract boolean A0C(C0551Ij c0551Ij) throws C0360Af;

    public Cq(InterfaceC0417Co interfaceC0417Co) {
        this.A00 = interfaceC0417Co;
    }

    public final void A00(C0551Ij c0551Ij, long j) throws C0360Af {
        if (A0C(c0551Ij)) {
            A0B(c0551Ij, j);
        }
    }
}
