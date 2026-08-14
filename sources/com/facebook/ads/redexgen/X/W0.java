package com.facebook.ads.redexgen.X;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W0 implements InterfaceC0441Dx {
    public static String[] A06 = {"kFQyFzcAtW9h", "T9w", "fQaNjl3SJX3d9bVQ", "oZJ95vdSt2TTHBWCj0JXn5a7ndpZ8Bju", "u9yp8kydrxa7", "6VdIrZzllDHdfU7GHzHok5zrzcn9yZKG", "C5", "TRfT7Vv0"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC0434Dq A04;
    public final C0551Ij A05 = new C0551Ij(32);

    public W0(InterfaceC0434Dq interfaceC0434Dq) {
        this.A04 = interfaceC0434Dq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0441Dx
    public final void A49(C0551Ij c0551Ij, boolean z) {
        int iA06 = -1;
        if (z) {
            iA06 = c0551Ij.A06() + c0551Ij.A0E();
        }
        boolean z2 = this.A03;
        if (A06[1].length() == 27) {
            throw new RuntimeException();
        }
        A06[7] = "Nc9T8xtu";
        if (z2) {
            if (!z) {
                return;
            }
            this.A03 = false;
            c0551Ij.A0Y(iA06);
            this.A00 = 0;
        }
        while (c0551Ij.A04() > 0) {
            int i = this.A00;
            if (i < 3) {
                if (i == 0) {
                    int iA0E = c0551Ij.A0E();
                    c0551Ij.A0Y(c0551Ij.A06() - 1);
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[2] = "aJNwIS78aN3JetqFlJ8G";
                    if (iA0E == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int iMin = Math.min(c0551Ij.A04(), 3 - this.A00);
                c0551Ij.A0c(this.A05.A00, this.A00, iMin);
                this.A00 += iMin;
                if (this.A00 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int iA0E2 = this.A05.A0E();
                    int iA0E3 = this.A05.A0E();
                    this.A02 = (iA0E2 & 128) != 0;
                    this.A01 = (((iA0E2 & 15) << 8) | iA0E3) + 3;
                    if (this.A05.A05() < this.A01) {
                        byte[] bytes = this.A05.A00;
                        this.A05.A0W(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(this.A01, bytes.length * 2)));
                        System.arraycopy(bytes, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(c0551Ij.A04(), this.A01 - this.A00);
                c0551Ij.A0c(this.A05.A00, this.A00, iMin2);
                this.A00 += iMin2;
                int i2 = this.A00;
                int i3 = this.A01;
                if (i2 == i3) {
                    boolean z3 = this.A02;
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[1] = "WscUDiyP9zB";
                    if (z3) {
                        if (C0567Iz.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0W(this.A01 - 4);
                    } else {
                        C0551Ij c0551Ij2 = this.A05;
                        if (A06[2].length() != 29) {
                            String[] strArr = A06;
                            strArr[3] = "nNiCCranccCPI0NRpeExr6ylwZyZykwG";
                            strArr[5] = "pfAdcnCCuWORkUPhfNuwqkYYK2fT2IOL";
                            c0551Ij2.A0W(i3);
                        } else {
                            A06[2] = "0kjAgxStX";
                            c0551Ij2.A0W(i3);
                        }
                    }
                    this.A04.A48(this.A05);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0441Dx
    public final void A8K(C0563Iv c0563Iv, InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        this.A04.A8K(c0563Iv, interfaceC0409Ce, c0440Dw);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0441Dx
    public final void AEK() {
        this.A03 = true;
    }
}
