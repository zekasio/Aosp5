package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0839Tr implements M8 {
    public int A00;
    public final M8 A01;
    public final M8 A02;

    public C0839Tr(M8 m8, int i, M8 m82) {
        this.A01 = m8;
        this.A00 = i;
        this.A02 = m82;
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        if (this.A00 > 0) {
            this.A01.ADK(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADK(str);
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
        this.A02.flush();
    }
}
