package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfsp {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (((r5 & 1) & (r6 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r0 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r4 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r4 < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(int r4, int r5, java.math.RoundingMode r6) {
        /*
            r6.getClass()
            int r5 = r4 / 8
            int r0 = r5 * 8
            int r0 = r4 - r0
            if (r0 != 0) goto Lc
            return r5
        Lc:
            r1 = 8
            r4 = r4 ^ r1
            int[] r2 = com.google.android.gms.internal.ads.zzfso.zza
            int r3 = r6.ordinal()
            r2 = r2[r3]
            int r4 = r4 >> 31
            r3 = 1
            r4 = r4 | r3
            switch(r2) {
                case 1: goto L4a;
                case 2: goto L4c;
                case 3: goto L46;
                case 4: goto L48;
                case 5: goto L43;
                case 6: goto L24;
                case 7: goto L24;
                case 8: goto L24;
                default: goto L1e;
            }
        L1e:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L24:
            int r0 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 - r0
            int r0 = r0 - r1
            if (r0 != 0) goto L40
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r6 == r0) goto L48
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            if (r6 != r0) goto L39
            goto L3a
        L39:
            r3 = 0
        L3a:
            r6 = r5 & 1
            r6 = r6 & r3
            if (r6 == 0) goto L4c
            goto L48
        L40:
            if (r0 <= 0) goto L4c
            goto L48
        L43:
            if (r4 <= 0) goto L4c
            goto L48
        L46:
            if (r4 >= 0) goto L4c
        L48:
            int r5 = r5 + r4
            return r5
        L4a:
            if (r0 != 0) goto L4d
        L4c:
            return r5
        L4d:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsp.zza(int, int, java.math.RoundingMode):int");
    }
}
