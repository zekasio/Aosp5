package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DT {
    public static String[] A05 = {"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    public int A01;
    public boolean A02;
    public final DU A03 = new DU();
    public final C0551Ij A04 = new C0551Ij(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i) {
        this.A01 = 0;
        int i2 = 0;
        while (this.A01 + i < this.A03.A02) {
            int[] iArr = this.A03.A09;
            int i3 = this.A01;
            this.A01 = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    public final DU A01() {
        return this.A03;
    }

    public final C0551Ij A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C0551Ij c0551Ij = this.A04;
        c0551Ij.A00 = Arrays.copyOf(c0551Ij.A00, Math.max(65025, this.A04.A07()));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.redexgen.X.InterfaceC0408Cd r8) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DT.A05(com.facebook.ads.redexgen.X.Cd):boolean");
    }
}
