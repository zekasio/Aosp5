package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0836To implements M8 {
    public int A00;
    public final M8 A01;

    public C0836To(M8 m8, int i) {
        this.A01 = m8;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        if (this.A00 > 0) {
            this.A01.ADK(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
        this.A01.flush();
    }
}
