package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0435Dr {
    public static byte[] A02;
    public final List<Format> A00;
    public final InterfaceC0417Co[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-91, -54, -46, -67, -56, -59, -64, 124, -65, -56, -53, -49, -63, -64, 124, -65, -67, -52, -48, -59, -53, -54, 124, -55, -59, -55, -63, 124, -48, -43, -52, -63, 124, -52, -50, -53, -46, -59, -64, -63, -64, -106, 124, -110, -95, -95, -99, -102, -108, -110, -91, -102, -96, -97, 96, -108, -106, -110, 94, 103, 97, 105, -33, -18, -18, -22, -25, -31, -33, -14, -25, -19, -20, -83, -31, -29, -33, -85, -75, -82, -74};
    }

    public C0435Dr(List<Format> list) {
        this.A00 = list;
        this.A01 = new InterfaceC0417Co[list.size()];
    }

    public final void A02(long j, C0551Ij c0551Ij) {
        C0500Gi.A03(j, c0551Ij, this.A01);
    }

    public final void A03(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        for (int i = 0; i < this.A01.length; i++) {
            c0440Dw.A05();
            InterfaceC0417Co interfaceC0417CoAFD = interfaceC0409Ce.AFD(c0440Dw.A03(), 3);
            Format format = this.A00.get(i);
            String str = format.A0O;
            IK.A05(A00(43, 19, 42).equals(str) || A00(62, 19, 119).equals(str), A00(0, 43, 85) + str);
            interfaceC0417CoAFD.A5V(Format.A08(format.A0M != null ? format.A0M : c0440Dw.A04(), str, null, -1, format.A0D, format.A0N, format.A03, null));
            this.A01[i] = interfaceC0417CoAFD;
        }
    }
}
