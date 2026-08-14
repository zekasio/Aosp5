package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0897Wa extends D3 {
    public static byte[] A03;
    public final long A00;
    public final List<C0897Wa> A01;
    public final List<WZ> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, Ascii.SUB, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public C0897Wa(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C0897Wa A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0897Wa c0897Wa = this.A01.get(i2);
            if (((D3) c0897Wa).A00 == i) {
                return c0897Wa;
            }
        }
        return null;
    }

    public final WZ A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            WZ wz = this.A02.get(i2);
            if (((D3) wz).A00 == i) {
                return wz;
            }
        }
        return null;
    }

    public final void A08(C0897Wa c0897Wa) {
        this.A01.add(c0897Wa);
    }

    public final void A09(WZ wz) {
        this.A02.add(wz);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final String toString() {
        return D3.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}
