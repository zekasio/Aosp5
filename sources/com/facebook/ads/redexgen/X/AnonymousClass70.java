package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.70, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AnonymousClass70 {
    A04(0),
    A05(100);

    public static byte[] A01;
    public static final Map<Integer, AnonymousClass70> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-98, -97, -96, -101, -81, -90, -82, -104, -103, -105, -104};
    }

    static {
        A02();
        A02 = new HashMap();
        for (AnonymousClass70 anonymousClass70 : values()) {
            A02.put(Integer.valueOf(anonymousClass70.A00), anonymousClass70);
        }
    }

    AnonymousClass70(int i) {
        this.A00 = i;
    }

    public static AnonymousClass70 A00(int i) {
        AnonymousClass70 anonymousClass70 = A02.get(Integer.valueOf(i));
        return anonymousClass70 == null ? A04 : anonymousClass70;
    }
}
