package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WB implements InterfaceC0426Di {
    public static String[] A0B = {"Egp8wbctYg3AnrLoFsY0muWOBg0DV21X", "e5h8xZQ9y742", "HWojDw1vanmhl7F", "V39ipiog0D", "u2piqSS4vuQoaStDwbY0GoBR5fBlfuuM", "rfNh4mzWhxdgTcwc6CqJaoU4clFtHzcH", "1g0ZSxhEfC", "eBXSmpY9RuNSQ1O4XZ5t"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public InterfaceC0417Co A07;
    public String A08;
    public final String A0A;
    public final C0551Ij A09 = new C0551Ij(new byte[18]);
    public int A02 = 0;

    public WB(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = C0391Bl.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5V(this.A06);
        }
        this.A01 = C0391Bl.A01(bArr);
        this.A04 = (int) ((((long) C0391Bl.A02(bArr)) * 1000000) / ((long) this.A06.A0C));
    }

    private boolean A01(C0551Ij c0551Ij) {
        do {
            int iA04 = c0551Ij.A04();
            String[] strArr = A0B;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "u2vG9yItOjfrtL1HZZufPW";
            if (iA04 <= 0) {
                return false;
            }
            this.A03 <<= 8;
            this.A03 |= c0551Ij.A0E();
        } while (!C0391Bl.A07(this.A03));
        this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
        this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
        this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
        this.A09.A00[3] = (byte) (this.A03 & 255);
        this.A00 = 4;
        this.A03 = 0;
        return true;
    }

    private boolean A02(C0551Ij c0551Ij, byte[] bArr, int i) {
        int iMin = Math.min(c0551Ij.A04(), i - this.A00);
        c0551Ij.A0c(bArr, this.A00, iMin);
        this.A00 += iMin;
        return this.A00 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) {
        while (c0551Ij.A04() > 0) {
            int i = this.A02;
            if (i != 0) {
                if (i == 1) {
                    byte[] bArr = this.A09.A00;
                    String[] strArr = A0B;
                    if (strArr[5].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0B;
                    strArr2[7] = "fRWG3CzCM1nyuvAzq7jz";
                    strArr2[0] = "3KzD1A3zkNrKwQoZtzGyJPl8BSj940od";
                    if (A02(c0551Ij, bArr, 18)) {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AEG(this.A09, 18);
                        this.A02 = 2;
                    }
                } else if (i == 2) {
                    int iMin = Math.min(c0551Ij.A04(), this.A01 - this.A00);
                    this.A07.AEG(c0551Ij, iMin);
                    this.A00 += iMin;
                    int i2 = this.A00;
                    int i3 = this.A01;
                    if (i2 == i3) {
                        this.A07.AEH(this.A05, 1, i3, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                }
            } else if (A01(c0551Ij)) {
                this.A02 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A08 = c0440Dw.A04();
        this.A07 = interfaceC0409Ce.AFD(c0440Dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
