package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0827Tf implements O0 {
    public final /* synthetic */ InterfaceC0657Mq A00;
    public final /* synthetic */ C0825Td A01;

    public C0827Tf(C0825Td c0825Td, InterfaceC0657Mq interfaceC0657Mq) {
        this.A01 = c0825Td;
        this.A00 = interfaceC0657Mq;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABg(String str) {
        this.A01.A0A.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABi(String str) {
        this.A01.A05 = true;
        this.A01.A09.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABz(int i) {
        if (this.A01.A05) {
            this.A01.A0A.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC4(String str) {
        this.A01.A09.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC6() {
        this.A00.AAF(14);
    }
}
