package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0929Xg implements R0 {
    public static byte[] A01;
    public final C0946Xx A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, Ascii.NAK, Ascii.NAK, Ascii.DC2, -45, -8, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.SI, Ascii.DC4, Ascii.CR, -45, -6, Ascii.NAK, 17, Ascii.VT, Ascii.DC4, 102, 100, 86, 99, Ascii.RS, 82, 88, 86, 95, 101};
    }

    public C0929Xg(C0946Xx c0946Xx) {
        this.A00 = c0946Xx;
    }

    @Override // com.facebook.ads.redexgen.X.R0
    public final Map<String, String> A5W(boolean z) {
        HashMap map = new HashMap();
        if (!C02575s.A00().A04()) {
            map.put(A00(0, 23, 39), C9U.A00().A01(this.A00, true).A7Y());
        }
        map.put(A00(23, 10, 114), C9Y.A06(new AnonymousClass99(this.A00), this.A00, z));
        return map;
    }
}
