package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.games.GamesStatusCodes;
import com.loopj.android.http.AsyncHttpClient;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R9 {
    public static byte[] A07;
    public R0 A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT;
    public int A02 = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, Ascii.GS, 4, Ascii.NAK, 17, 9, 17, 92, Ascii.SO, Ascii.EM, 8, Ascii.SO, Ascii.NAK, Ascii.EM, Ascii.SI, 92, 17, 9, Ascii.SI, 8, 92, Ascii.RS, Ascii.EM, 92, Ascii.RS, Ascii.EM, 8, Ascii.VT, Ascii.EM, Ascii.EM, Ascii.DC2, 92, 77, 92, Ascii.GS, Ascii.DC2, Ascii.CAN, 92, 77, 68};
    }

    public final R9 A02(int i) {
        this.A00 = i;
        return this;
    }

    public final R9 A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final R9 A04(int i) {
        this.A02 = i;
        return this;
    }

    public final R9 A05(int i) {
        this.A03 = i;
        return this;
    }

    public final R9 A06(int i) {
        this.A04 = i;
        return this;
    }

    public final R9 A07(R0 r0) {
        this.A05 = r0;
        return this;
    }

    public final R9 A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final RA A09() {
        return new RA(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
