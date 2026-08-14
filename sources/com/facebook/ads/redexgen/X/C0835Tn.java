package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0835Tn implements M8 {
    public final M7 A00;
    public final M8 A01;

    public C0835Tn(M8 m8, int i, int i2) {
        this.A01 = m8;
        this.A00 = new M7(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void ADK(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && MA.A08(this.A00)) {
            this.A01.ADK(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.X.M8
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (MA.A08(this.A00)) {
                this.A01.ADK(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
