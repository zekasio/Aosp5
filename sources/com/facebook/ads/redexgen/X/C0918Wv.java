package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0918Wv implements InterfaceC0414Cl {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{110, 112, 100, -88, -71, -74, -91, -72, -83, -77, -78, -73, -103, -73, -127, 113, 101, -76, -85, -85, -72, -86, -71, -72, -126, -96, -108, -25, -35, -18, -39, -25, -79, 126, 114, -58, -69, -65, -73, -89, -59, -113, -102, -65, -52, -59, -62, -96, -59, -69, -68, -49, 127, -61, -68, -59, -66, -53, -65, -108};
    }

    public C0918Wv(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        int i = this.A00;
        if (i > 0) {
            this.A05 = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j) {
        return C0567Iz.A0B(this.A04, j, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long j) {
        int iA00 = A00(j);
        C0415Cm c0415Cm = new C0415Cm(this.A04[iA00], this.A03[iA00]);
        if (c0415Cm.A01 >= j || iA00 == this.A00 - 1) {
            return new C0413Ck(c0415Cm);
        }
        return new C0413Ck(c0415Cm, new C0415Cm(this.A04[iA00 + 1], this.A03[iA00 + 1]));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 22) + this.A00 + A01(25, 8, 51) + Arrays.toString(this.A01) + A01(15, 10, 4) + Arrays.toString(this.A03) + A01(33, 9, 17) + Arrays.toString(this.A04) + A01(1, 14, 3) + Arrays.toString(this.A02) + A01(0, 1, 4);
    }
}
