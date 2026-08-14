package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1186d5 extends L8 {
    public static byte[] A03;
    public final /* synthetic */ C1220dd A00;
    public final /* synthetic */ C01541q A01;
    public final /* synthetic */ FQ A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, Ascii.NAK, 4, 19, 65, Ascii.NAK, 8, Ascii.FF, 4, Ascii.SO, Ascii.DC4, Ascii.NAK, 79};
    }

    public C1186d5(FQ fq, C01541q c01541q, C1220dd c1220dd) {
        this.A02 = fq;
        this.A01 = c01541q;
        this.A00 = c1220dd;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.AAi(new KH(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
