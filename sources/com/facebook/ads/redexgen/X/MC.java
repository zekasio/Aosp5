package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MC {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.EM, 65, 65, 65};
    }

    public static String A01(String truncatedBody) {
        if (truncatedBody != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(truncatedBody, A00(0, 1, 88), true);
            int i = 0;
            if (truncatedBody.length() > 90) {
                int length = truncatedBody.length();
                String strA00 = A00(1, 3, 14);
                if (length > 93 || !truncatedBody.endsWith(strA00)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int tokenLength = stringTokenizer.nextToken().length();
                        if (i + tokenLength < 90) {
                            i += tokenLength;
                        }
                    }
                    if (i == 0) {
                        return truncatedBody.substring(0, 90) + strA00;
                    }
                    return truncatedBody.substring(0, i) + strA00;
                }
                return truncatedBody;
            }
            return truncatedBody;
        }
        return truncatedBody;
    }
}
