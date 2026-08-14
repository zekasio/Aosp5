package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1077bE extends L8 {
    public static byte[] A03;
    public final /* synthetic */ C6D A00;
    public final /* synthetic */ C0946Xx A01;
    public final /* synthetic */ String A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{53, 55, 60, 55, 32, 59, 49};
    }

    public C1077bE(C6D c6d, String str, C0946Xx c0946Xx) {
        this.A00 = c6d;
        this.A02 = str;
        this.A01 = c0946Xx;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        try {
            this.A00.A06(this.A02);
        } catch (Throwable th) {
            this.A01.A06().A8y(A00(0, 7, 2), C03298z.A1F, new AnonymousClass90(th));
        }
    }
}
