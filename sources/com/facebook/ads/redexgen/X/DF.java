package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DF {
    public static String[] A0A = {"3clh", "In2mDQuCVOg3ihkf16hWdIIfuM6sFv5F", "x02l2Vae1akitXdZsfkSin5rPssADgyF", "voDg", "hUzVtg6QDcg3AayaGyy4Y5hfj2RvIx7z", "AYA0HHhZRav1tOhmR967ChnIf", "RG8", "bQ6q4wCv1qa3psjbWrVNO9D1ADq5zdw2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public D9 A04;
    public DO A05;
    public final InterfaceC0417Co A06;
    public final DQ A07 = new DQ();
    public final C0551Ij A09 = new C0551Ij(1);
    public final C0551Ij A08 = new C0551Ij();

    public DF(InterfaceC0417Co interfaceC0417Co) {
        this.A06 = interfaceC0417Co;
    }

    private DP A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            DQ dq = this.A07;
            String[] strArr = A0A;
            if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "mhitCTNVD2gTcCiZ9jaRAXWaAA0g9dMw";
            strArr2[4] = "MwiogHOaq0gqmibDd9x4nD1rPGRVV4il";
            return dq.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0551Ij c0551Ij = this.A07.A09;
        DP dpA00 = A00();
        if (dpA00.A00 != 0) {
            c0551Ij.A0Z(dpA00.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0551Ij.A0Z(c0551Ij.A0I() * 6);
        }
    }

    public final int A03() {
        C0551Ij c0551Ij;
        int length;
        if (!this.A07.A0A) {
            return 0;
        }
        DP dpA00 = A00();
        if (dpA00.A00 != 0) {
            c0551Ij = this.A07.A09;
            length = dpA00.A00;
        } else {
            byte[] bArr = dpA00.A04;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "Pfb0S5CneQgYrjeMjOJgtR7T7eyOdr1R";
            strArr2[4] = "zLY8KEVp0MgNhcadjz3HGMWIKnjSbq4p";
            this.A08.A0b(bArr, bArr.length);
            c0551Ij = this.A08;
            length = bArr.length;
        }
        boolean[] zArr = this.A07.A0H;
        int vectorSize = this.A01;
        boolean z = zArr[vectorSize];
        byte[] bArr2 = this.A09.A00;
        int vectorSize2 = z ? 128 : 0;
        bArr2[0] = (byte) (vectorSize2 | length);
        this.A09.A0Y(0);
        this.A06.AEG(this.A09, 1);
        this.A06.AEG(c0551Ij, length);
        if (!z) {
            int vectorSize3 = length + 1;
            return vectorSize3;
        }
        C0551Ij c0551Ij2 = this.A07.A09;
        int iA0I = c0551Ij2.A0I();
        c0551Ij2.A0Z(-2);
        int subsampleCount = iA0I * 6;
        int i = subsampleCount + 2;
        this.A06.AEG(c0551Ij2, i);
        int subsampleDataLength = length + 1;
        return subsampleDataLength + i;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        long jA01 = AG.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A00(i) < jA01; i++) {
            boolean[] zArr = this.A07.A0I;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "yYyJ6pNJ0kgjmttu9OhrBT2GfQD0mn7b";
            strArr2[4] = "spdSEizAECgh3deYwyaUKu4kY7nul1tj";
            if (zArr[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        DP dpA00 = this.A05.A00(this.A07.A07.A02);
        this.A06.A5V(this.A05.A07.A0I(drmInitData.A02(dpA00 != null ? dpA00.A02 : null)));
    }

    public final void A07(DO r3, D9 d9) {
        this.A05 = (DO) IK.A01(r3);
        this.A04 = (D9) IK.A01(d9);
        this.A06.A5V(r3.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        int i = this.A00;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i != iArr[i2]) {
            return true;
        }
        this.A02 = i2 + 1;
        String[] strArr = A0A;
        if (strArr[2].charAt(8) != strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A0A[6] = "24SILmm";
        this.A00 = 0;
        return false;
    }
}
