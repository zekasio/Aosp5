package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZC implements InterfaceC02856v {
    public static byte[] A01;
    public static String[] A02 = {"Wdahz1Wjl3dMmMcpJsybmGRAeciA4tMI", "owhKI", "oRwt0jb9EEblUBuGQWVNL6ozc0Rzi0vw", "l56im1aaEdwcDHM5hLD8b", "Eu2PxKSDFU9lAkWHn67wF6yqVh6mLTIL", "0Vvrgp6tuvzAmenwYfecbhGxQfkK1YW3", "HQi", "vUie1Te"};
    public final /* synthetic */ C0970Yv A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DC2, 121, 120, 106, 1, Ascii.DC4};
    }

    static {
        A01();
    }

    public ZC(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0015 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.C7A A5J() throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A0B(r0)
            if (r0 == 0) goto L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        Le:
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A0B(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L3c
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A0B(r0)
            r0 = r0[r4]
            java.lang.String r0 = r0.name
            r3.append(r0)
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ServiceInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A0B(r0)
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r4 == r0) goto L39
            r2 = 0
            r1 = 1
            r0 = 6
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
        L39:
            int r4 = r4 + 1
            goto Le
        L3c:
            com.facebook.ads.redexgen.X.Yv r4 = r5.A00
            java.lang.String r3 = r3.toString()
            r2 = 1
            r1 = 5
            r0 = 50
            java.lang.String r0 = A00(r2, r1, r0)
            byte[] r1 = r3.getBytes(r0)
            com.facebook.ads.redexgen.X.7I r0 = com.facebook.ads.redexgen.X.C7I.A06
            java.lang.String r0 = com.facebook.ads.redexgen.X.C7J.A08(r1, r0)
            com.facebook.ads.redexgen.X.7A r0 = r4.A08(r0)
            return r0
        L59:
            com.facebook.ads.redexgen.X.Yv r1 = r5.A00
            com.facebook.ads.redexgen.X.76 r0 = com.facebook.ads.redexgen.X.AnonymousClass76.A07
            com.facebook.ads.redexgen.X.7A r3 = r1.A07(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.ZC.A02
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L82
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.ZC.A02
            java.lang.String r1 = "PIV5HCfMNdAm4GWeouxefmFP0XOPfsYa"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "Fq26Ssz9KPDLteFZDGni0zECOafhdUl8"
            r0 = 4
            r2[r0] = r1
            return r3
        L82:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZC.A5J():com.facebook.ads.redexgen.X.7A");
    }
}
