package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0874Va implements InterfaceC0534Hs {
    public static String[] A0C = {"nBGgOhUJr5w54zk2FcSY", "YYZuUd", "gwBohD1o6c6DfEcFdJm47xfjaEoVukk3", "3TNnSL", "hJWvKqQqk09hkKqv49F3L8Ilz7Jhye22", "G8FOHrMAxxSNQBngbaVWxtAhYQnldn5N", "v6FRbmkBAKb4FwdIpHjrHHJWg4k1tULi", "7hirQzfzNIRD79h7knAyc8"};
    public long A00;
    public long A02;
    public C0526Hi A03;
    public final Uri A05;
    public final FU A07;
    public final InterfaceC0522He A08;
    public final IQ A09;
    public volatile boolean A0A;
    public final /* synthetic */ CE A0B;
    public final C0412Cj A06 = new C0412Cj();
    public boolean A04 = true;
    public long A01 = -1;

    public C0874Va(CE ce, Uri uri, InterfaceC0522He interfaceC0522He, FU fu, IQ iq) {
        this.A0B = ce;
        this.A05 = (Uri) IK.A01(uri);
        this.A08 = (InterfaceC0522He) IK.A01(interfaceC0522He);
        this.A07 = (FU) IK.A01(fu);
        this.A09 = iq;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0534Hs
    public final void A3y() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0534Hs
    public final void A8m() throws InterruptedException, IOException {
        int iADX = 0;
        while (iADX == 0) {
            boolean z = this.A0A;
            if (A0C[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6lKOSY";
            strArr[1] = "aO7eUD";
            if (!z) {
                InterfaceC0408Cd interfaceC0408Cd = null;
                try {
                    long jA7F = this.A06.A00;
                    this.A03 = new C0526Hi(this.A05, jA7F, -1L, this.A0B.A0b);
                    this.A01 = this.A08.ACw(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += jA7F;
                    }
                    C0917Wu c0917Wu = new C0917Wu(this.A08, jA7F, this.A01);
                    InterfaceC0407Cc interfaceC0407CcA02 = this.A07.A02(c0917Wu, this.A08.A7k());
                    if (this.A04) {
                        interfaceC0407CcA02.AEL(jA7F, this.A02);
                        this.A04 = false;
                    }
                    while (iADX == 0 && !this.A0A) {
                        this.A09.A00();
                        iADX = interfaceC0407CcA02.ADX(c0917Wu, this.A06);
                        if (c0917Wu.A7F() > this.A0B.A0P + jA7F) {
                            jA7F = c0917Wu.A7F();
                            this.A09.A01();
                            this.A0B.A0R.post(this.A0B.A0a);
                        }
                    }
                    if (iADX == 1) {
                        iADX = 0;
                    } else {
                        this.A06.A00 = c0917Wu.A7F();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0567Iz.A0W(this.A08);
                } catch (Throwable th) {
                    if (iADX != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC0408Cd.A7F();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0567Iz.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
