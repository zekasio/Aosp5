package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0890Vt implements InterfaceC0407Cc {
    public static byte[] A05;
    public static String[] A06 = {"TnN98hFrpPh0PRtpc088aNdcZccscvrw", "5aRpZ2NNsZI5w0o7DGq1eAqNryB", "mEVhsrU6MzIr1qyqOlGiN", "yrEmV4s21h7BLFfB7siMTKTjJQry3", "EfBKzRp", "ss80CflBP4AmUjPde3BocO42m8Tqd1M1", "kqV6vinpOYrD", "3vWKjffhrtNYzin5lJ6IQFsZaR1xXQhq"};
    public static final InterfaceC0410Cf A07;
    public int A00;
    public int A01;
    public InterfaceC0409Ce A02;
    public InterfaceC0417Co A03;
    public C0889Vs A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{100, 95, 66, 68, 65, 65, 94, 67, 69, 84, 85, 17, 94, 67, 17, 68, 95, 67, 84, 82, 94, 86, 95, 88, 75, 84, 85, 17, 70, 80, 71, 17, 89, 84, 80, 85, 84, 67, Ascii.US, 107, 127, 110, 99, 101, 37, 120, 107, 125};
    }

    static {
        A01();
        A07 = new C0891Vu();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A02 = interfaceC0409Ce;
        this.A03 = interfaceC0409Ce.AFD(0, 1);
        this.A04 = null;
        interfaceC0409Ce.A5D();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab A[PHI: r5 r6
      0x00ab: PHI (r5v4 'size' int) = (r5v1 'size' int), (r5v5 'size' int) binds: [B:24:0x00e0, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r6v4 int) = (r6v2 int), (r6v5 int) binds: [B:24:0x00e0, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ADX(com.facebook.ads.redexgen.X.InterfaceC0408Cd r19, com.facebook.ads.redexgen.X.C0412Cj r20) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0890Vt.ADX(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        return C0443Dz.A00(interfaceC0408Cd) != null;
    }
}
