package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1049am implements InterfaceC02856v {
    public final /* synthetic */ C1035aY A00;

    public C1049am(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() throws Throwable {
        if (this.A00.A02.A0a() != EnumC02896z.A0I) {
            String strA06 = this.A00.A03.A06(10010);
            if (strA06 != null) {
                return this.A00.A08(strA06);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A04);
    }
}
