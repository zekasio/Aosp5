package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IA {
    public static String[] A00 = {"v79OOCD3rFDrBH3Sw8ccat0nkfR9Jk8K", "zaqJSCMgPr8q8xIyOc2JWspWFv3JOD4h", "Sqp2xVCvxFHsc", "s8GBWRpegr", "t6Y6wcH7Q091ZQl7CdWm1Bgnnklpnco", "XVr0n", "MY0M4GS8ICKTpGygoaRzgsCYiOraPhWK", "Pkt85Yo8hwIimoTAGZdJTyJAkZ2fE06T"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE (r3 I:com.facebook.ads.redexgen.X.He) STATIC call: com.facebook.ads.redexgen.X.Iz.A0W(com.facebook.ads.redexgen.X.He):void A[MD:(com.facebook.ads.redexgen.X.He):void (m)], block:B:32:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE (r3 I:com.facebook.ads.redexgen.X.He) STATIC call: com.facebook.ads.redexgen.X.Iz.A0W(com.facebook.ads.redexgen.X.He):void A[MD:(com.facebook.ads.redexgen.X.He):void (m)], block:B:36:0x0092 */
    public static long A00(C0526Hi c0526Hi, long j, long j2, InterfaceC0522He interfaceC0522He, byte[] bArr, @Nullable C0555In c0555In, int i, I9 i9) throws InterruptedException, IOException {
        InterfaceC0522He interfaceC0522He2;
        while (true) {
            if (c0555In != null) {
                c0555In.A01(i);
            }
            try {
                break;
            } catch (C0554Im unused) {
            } finally {
                C0567Iz.A0W(interfaceC0522He2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0526Hi c0526Hi2 = new C0526Hi(c0526Hi.A04, c0526Hi.A06, j, (c0526Hi.A03 + j) - c0526Hi.A01, -1L, c0526Hi.A05, c0526Hi.A00 | 2);
        long jACw = interfaceC0522He2.ACw(c0526Hi2);
        if (i9.A01 == -1 && jACw != -1) {
            i9.A01 = c0526Hi2.A01 + jACw;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i2 = interfaceC0522He2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
            if (i2 != -1) {
                j3 += (long) i2;
                i9.A02 += (long) i2;
            } else if (i9.A01 == -1) {
                i9.A01 = c0526Hi2.A01 + j3;
            }
        }
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0526Hi c0526Hi) {
        return c0526Hi.A05 != null ? c0526Hi.A05 : A01(c0526Hi.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(com.facebook.ads.redexgen.X.C0526Hi r23, com.facebook.ads.redexgen.X.I4 r24, com.facebook.ads.redexgen.X.C0864Uq r25, byte[] r26, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.C0555In r27, int r28, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.I9 r29, @androidx.annotation.Nullable java.util.concurrent.atomic.AtomicBoolean r30, boolean r31) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r4 = r29
            r19 = r25
            com.facebook.ads.redexgen.X.IK.A01(r19)
            r20 = r26
            com.facebook.ads.redexgen.X.IK.A01(r20)
            r14 = r23
            r6 = r24
            if (r4 == 0) goto La6
            A04(r14, r6, r4)
        L15:
            java.lang.String r5 = A02(r14)
            long r15 = r14.A01
            long r0 = r14.A02
            r12 = -1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto La1
            long r0 = r14.A02
        L25:
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto La0
            if (r30 == 0) goto L46
            boolean r8 = r30.get()
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.IA.A00
            r2 = 5
            r2 = r3[r2]
            int r3 = r2.length()
            r2 = 1
            if (r3 == r2) goto L7c
            java.lang.String[] r7 = com.facebook.ads.redexgen.X.IA.A00
            java.lang.String r3 = "EAlW89nW7uOIImzUc5SW8CQaYz84C"
            r2 = 5
            r7[r2] = r3
            if (r8 != 0) goto Lad
        L46:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L63
            r25 = r0
        L4c:
            r21 = r6
            r22 = r5
            r23 = r15
            long r2 = r21.A5w(r22, r23, r25)
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 <= 0) goto L69
        L5a:
            long r15 = r15 + r2
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 != 0) goto L61
        L5f:
            long r0 = r0 - r10
            goto L25
        L61:
            r10 = r2
            goto L5f
        L63:
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L4c
        L69:
            long r7 = -r2
            java.lang.String[] r9 = com.facebook.ads.redexgen.X.IA.A00
            r2 = 6
            r3 = r9[r2]
            r2 = 1
            r2 = r9[r2]
            int r3 = r3.length()
            int r2 = r2.length()
            if (r3 == r2) goto L82
        L7c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L82:
            java.lang.String[] r9 = com.facebook.ads.redexgen.X.IA.A00
            java.lang.String r3 = "OFDha7Ysfl6kB"
            r2 = 2
            r9[r2] = r3
            r2 = r7
            r21 = r27
            r22 = r28
            r23 = r4
            r17 = r7
            long r8 = A00(r14, r15, r17, r19, r20, r21, r22, r23)
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 >= 0) goto L5a
            if (r31 == 0) goto La0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto Lb3
        La0:
            return
        La1:
            long r0 = r6.A68(r5)
            goto L25
        La6:
            com.facebook.ads.redexgen.X.I9 r4 = new com.facebook.ads.redexgen.X.I9
            r4.<init>()
            goto L15
        Lad:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        Lb3:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.IA.A03(com.facebook.ads.redexgen.X.Hi, com.facebook.ads.redexgen.X.I4, com.facebook.ads.redexgen.X.Uq, byte[], com.facebook.ads.redexgen.X.In, int, com.facebook.ads.redexgen.X.I9, java.util.concurrent.atomic.AtomicBoolean, boolean):void");
    }

    public static void A04(C0526Hi c0526Hi, I4 i4, I9 i9) {
        long jA68;
        String strA02 = A02(c0526Hi);
        long j = c0526Hi.A01;
        if (c0526Hi.A02 != -1) {
            jA68 = c0526Hi.A02;
        } else {
            jA68 = i4.A68(strA02);
        }
        i9.A01 = jA68;
        if (A00[5].length() == 1) {
            throw new RuntimeException();
        }
        A00[4] = "nu";
        i9.A00 = 0L;
        i9.A02 = 0L;
        while (jA68 != 0) {
            long start = i4.A5w(strA02, j, jA68 != -1 ? jA68 : Long.MAX_VALUE);
            if (start > 0) {
                i9.A00 += start;
            } else {
                start = -start;
                if (start == Long.MAX_VALUE) {
                    return;
                }
            }
            j += start;
            if (jA68 == -1) {
                start = 0;
            }
            jA68 -= start;
        }
    }

    public static void A05(I4 i4, String str) {
        for (I8 i8 : i4.A5x(str)) {
            if (A00[2].length() != 13) {
                throw new RuntimeException();
            }
            A00[4] = "R4HmvLUlpWi57h";
            try {
                i4.ADx(i8);
            } catch (I2 unused) {
            }
        }
    }
}
