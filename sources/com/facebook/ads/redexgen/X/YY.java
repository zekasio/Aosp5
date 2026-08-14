package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YY implements InterfaceC02856v {
    public final /* synthetic */ YR A00;

    public YY(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A00 != null) {
            YR yr = this.A00;
            return yr.A04(yr.A00.getPhoneType());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
