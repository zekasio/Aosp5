package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0810Sn extends L8 {
    public final /* synthetic */ C0809Sm A00;
    public final /* synthetic */ boolean A01;

    public C0810Sn(C0809Sm c0809Sm, boolean z) {
        this.A00 = c0809Sm;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AbstractC0656Mp abstractC0656MpA08 = this.A00.A0E.A08();
        if (abstractC0656MpA08 == null) {
            return;
        }
        abstractC0656MpA08.setPageDetailsVisible((this.A01 || abstractC0656MpA08.A05()) ? false : true);
        abstractC0656MpA08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
