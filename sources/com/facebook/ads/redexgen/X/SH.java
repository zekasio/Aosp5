package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SH extends L8 {
    public static byte[] A01;
    public final /* synthetic */ C8N A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, Ascii.DC2, 69, 83, 65, Ascii.DC2, 92, 87, 68, 87, 64, Ascii.DC2, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public SH(C8N c8n) {
        this.A00 = c8n;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (!this.A00.A07) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
