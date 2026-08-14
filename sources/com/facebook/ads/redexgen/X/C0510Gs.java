package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0510Gs {
    public static String[] A09 = {"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0551Ij A07 = new C0551Ij();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C0551Ij c0551Ij, int i) {
        int iA0G;
        if (i < 4) {
            return;
        }
        c0551Ij.A0Z(3);
        int i2 = i - 4;
        if ((c0551Ij.A0E() & 128) != 0) {
            if (i2 < 7 || (iA0G = c0551Ij.A0G()) < 4) {
                return;
            }
            this.A01 = c0551Ij.A0I();
            this.A00 = c0551Ij.A0I();
            this.A07.A0W(iA0G - 4);
            i2 -= 7;
        }
        int iA06 = this.A07.A06();
        int iA07 = this.A07.A07();
        if (iA06 < iA07 && i2 > 0) {
            int bytesToRead = Math.min(i2, iA07 - iA06);
            c0551Ij.A0c(this.A07.A00, iA06, bytesToRead);
            this.A07.A0Y(iA06 + bytesToRead);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C0551Ij c0551Ij, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c0551Ij.A0I();
        this.A04 = c0551Ij.A0I();
        c0551Ij.A0Z(11);
        this.A02 = c0551Ij.A0I();
        this.A03 = c0551Ij.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C0551Ij c0551Ij, int i) {
        if (i % 5 != 2) {
            return;
        }
        c0551Ij.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int r = 0; r < i2; r++) {
            int iA0E = c0551Ij.A0E();
            int iA0E2 = c0551Ij.A0E();
            int iA0E3 = c0551Ij.A0E();
            int iA0E4 = c0551Ij.A0E();
            int entryCount = c0551Ij.A0E();
            int i3 = (int) (((double) iA0E2) + (((double) (iA0E3 - 128)) * 1.402d));
            int cb = iA0E4 - 128;
            double d = ((double) iA0E2) - (((double) cb) * 0.34414d);
            int i4 = iA0E3 - 128;
            int i5 = (int) (d - (((double) i4) * 0.71414d));
            int i6 = iA0E4 - 128;
            int i7 = (int) (((double) iA0E2) + (((double) i6) * 1.772d));
            int[] iArr = this.A08;
            int i8 = C0567Iz.A06(i3, 0, 255);
            int i9 = (entryCount << 24) | (i8 << 16);
            int i10 = C0567Iz.A06(i5, 0, 255);
            int i11 = i9 | (i10 << 8);
            int i12 = C0567Iz.A06(i7, 0, 255);
            iArr[iA0E] = i11 | i12;
        }
        this.A06 = true;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x003b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.GX A06() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0510Gs.A06():com.facebook.ads.redexgen.X.GX");
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
