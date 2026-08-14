package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01521o {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.EM, 95, 67, 90, 91, 124, 107, 121, 111, 124, 106, 107, 106, 81, 120, 103, 106, 107, 97};
    }

    public static void A02(C0947Xy c0947Xy, C7U c7u, C1196dF c1196dF) {
        c7u.A0c(new C7S(c1196dF.A0R().A01(), PZ.A04, PZ.A04, c1196dF.A0Z(), A00(5, 14, 28)));
        boolean zA0r = c1196dF.A0r();
        if (zA0r) {
            C7Q c7q = new C7Q(c1196dF.A0V(), c1196dF.A0Z(), A00(5, 14, 28));
            c7q.A04 = true;
            c7q.A03 = A00(0, 5, 37);
            c7u.A0X(c7q);
        }
        boolean zA27 = JR.A27(c0947Xy, C0751Qg.A03());
        C7Q c7q2 = new C7Q(c1196dF.A0O().A0D().A08(), c1196dF.A0Z(), A00(5, 14, 28), c1196dF.A0O().A0D().A05());
        if (zA0r && !zA27) {
            c7u.A0X(c7q2);
        } else {
            c7u.A0a(c7q2);
        }
        c7u.A0c(new C7S(c1196dF.A0O().A0D().A07(), C01471j.A00(c1196dF.A0O().A0D()), C01471j.A01(c1196dF.A0O().A0D()), c1196dF.A0Z(), A00(5, 14, 28)));
        Iterator<String> it = c1196dF.A0O().A0G().A00().iterator();
        while (it.hasNext()) {
            c7u.A0c(new C7S(it.next(), -1, -1, c1196dF.A0Z(), A00(5, 14, 28)));
        }
    }
}
