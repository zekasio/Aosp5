package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0406Cb {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Ascii.RS, 59, 49, 55, 60, 33, 55, Ascii.SYN, 39, 32, 51, 38, 59, 61, 60, 0, 55, 63, 51, 59, 60, 59, 60, 53, 7, 59, 54, 46, 53, 54, 52, 60, 19, 34, 37, 54, 35, 62, 56, 57, 5, 50, 58, 54, 62, 57, 62, 57, 48};
    }

    public static long A00(Map<String, String> keyStatus, String str) {
        if (keyStatus != null) {
            try {
                String value = keyStatus.get(str);
                if (value != null) {
                    return Long.parseLong(value);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CL != com.facebook.ads.internal.exoplayer2.drm.DrmSession<?> */
    public static Pair<Long, Long> A01(CL<?> cl) {
        Map<String, String> keyStatus = cl.ADT();
        if (keyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(keyStatus, A02(0, 24, 28))), Long.valueOf(A00(keyStatus, A02(24, 25, 25))));
    }
}
