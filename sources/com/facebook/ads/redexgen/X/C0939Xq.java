package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0939Xq extends L8 {
    public final /* synthetic */ C0946Xx A00;

    public C0939Xq(C0946Xx c0946Xx) {
        this.A00 = c0946Xx;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() throws Throwable {
        for (C03248u event : C03238t.A02()) {
            C03238t.A0A(this.A00, event.A02(), event.A00(), event.A01(), false);
        }
        C03238t.A02().clear();
    }
}
