package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VR implements InterfaceC0492Ga {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{62, Ascii.VT, Ascii.VT, Ascii.SUB, Ascii.DC2, Ascii.SI, Ascii.VT, Ascii.SUB, Ascii.ESC, 95, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.CR, Ascii.SUB, Ascii.RS, Ascii.VT, Ascii.SUB, 95, Ascii.ESC, Ascii.SUB, Ascii.FS, Ascii.DLE, Ascii.ESC, Ascii.SUB, Ascii.CR, 95, Ascii.EM, Ascii.DLE, Ascii.CR, 95, 10, 17, Ascii.FF, 10, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 95, Ascii.EM, Ascii.DLE, Ascii.CR, Ascii.DC2, Ascii.RS, Ascii.VT, 113, 96, 96, 124, 121, 115, 113, 100, 121, 127, 126, 63, 115, 117, 113, 61, 38, 32, 40, Ascii.GS, Ascii.FF, Ascii.FF, Ascii.DLE, Ascii.NAK, Ascii.US, Ascii.GS, 8, Ascii.NAK, 19, Ascii.DC2, 83, Ascii.US, Ascii.EM, Ascii.GS, 81, 75, 76, 68, 103, 118, 118, 106, 111, 101, 103, 114, 111, 105, 104, 41, 98, 112, 100, 117, 115, 100, 117, Ascii.FS, Ascii.CR, Ascii.CR, 17, Ascii.DC4, Ascii.RS, Ascii.FS, 9, Ascii.DC4, Ascii.DC2, 19, 82, Ascii.CR, Ascii.SUB, Ascii.SO, 81, 64, 64, 92, 89, 83, 81, 68, 89, 95, 94, Ascii.US, 68, 68, 93, 92, Ascii.ESC, 72, 93, 92, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 45, 48, 116, 109, 35, 37, 33, 109, 118, 112, 120, 63, 46, 46, 50, 55, 61, 63, 42, 55, 49, 48, 113, 38, 115, 51, 46, 106, 115, 40, 42, 42, 123, 106, 106, 118, 115, 121, 123, 110, 115, 117, 116, 53, 98, 55, 107, 111, 115, 121, 113, 110, 115, 119, 127, 55, 110, 98, 41, 125, 4, Ascii.NAK, Ascii.NAK, 9, Ascii.FF, 6, 4, 17, Ascii.FF, 10, Ascii.VT, 74, Ascii.GS, 72, Ascii.SYN, Ascii.DLE, 7, Ascii.ETB, Ascii.FF, Ascii.NAK, 99, 114, 111, 99, 56, 97, 99, 99, 70, 87, 74, 70, Ascii.GS, 74, Ascii.US, 65, 65, 83};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0492Ga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.VS A4G(com.facebook.ads.internal.exoplayer2.Format r5) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VR.A4G(com.facebook.ads.internal.exoplayer2.Format):com.facebook.ads.redexgen.X.VS");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0492Ga
    public final boolean AF8(Format format) {
        String str = format.A0O;
        return A00(236, 8, 112).equals(str) || A00(244, 10, 85).equals(str) || A00(122, 20, 87).equals(str) || A00(167, 21, 57).equals(str) || A00(216, 20, 2).equals(str) || A00(188, 28, 125).equals(str) || A00(50, 19, 119).equals(str) || A00(142, 25, 39).equals(str) || A00(69, 19, 27).equals(str) || A00(88, 19, 97).equals(str) || A00(107, 15, 26).equals(str);
    }
}
