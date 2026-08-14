package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0971Yw implements InterfaceC02856v {
    public static byte[] A01;
    public final /* synthetic */ C0970Yv A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{ByteCompanionObject.MIN_VALUE, -28, -29, -43, -68, -57};
    }

    public C0971Yw(C0970Yv c0970Yv) {
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
            android.content.pm.ActivityInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A09(r0)
            if (r0 == 0) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        Le:
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ActivityInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A09(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L3d
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ActivityInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A09(r0)
            r0 = r0[r4]
            java.lang.String r0 = r0.name
            r3.append(r0)
            com.facebook.ads.redexgen.X.Yv r0 = r5.A00
            android.content.pm.ActivityInfo[] r0 = com.facebook.ads.redexgen.X.C0970Yv.A09(r0)
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r4 == r0) goto L3a
            r2 = 0
            r1 = 1
            r0 = 37
            java.lang.String r0 = A00(r2, r1, r0)
            r3.append(r0)
        L3a:
            int r4 = r4 + 1
            goto Le
        L3d:
            com.facebook.ads.redexgen.X.Yv r4 = r5.A00
            java.lang.String r3 = r3.toString()
            r2 = 1
            r1 = 5
            r0 = 62
            java.lang.String r0 = A00(r2, r1, r0)
            byte[] r1 = r3.getBytes(r0)
            com.facebook.ads.redexgen.X.7I r0 = com.facebook.ads.redexgen.X.C7I.A06
            java.lang.String r0 = com.facebook.ads.redexgen.X.C7J.A08(r1, r0)
            com.facebook.ads.redexgen.X.7A r0 = r4.A08(r0)
            return r0
        L5a:
            com.facebook.ads.redexgen.X.Yv r1 = r5.A00
            com.facebook.ads.redexgen.X.76 r0 = com.facebook.ads.redexgen.X.AnonymousClass76.A07
            com.facebook.ads.redexgen.X.7A r0 = r1.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0971Yw.A5J():com.facebook.ads.redexgen.X.7A");
    }
}
