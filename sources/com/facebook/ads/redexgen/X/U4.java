package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U4 extends L8 {
    public static byte[] A01;
    public static String[] A02 = {"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    public final /* synthetic */ C0602Kk A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A02[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 89);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{Ascii.EM, Ascii.FS, Ascii.DLE, Ascii.SO, Ascii.EM, Ascii.FF, 33, Ascii.NAK, Ascii.US, Ascii.FS, 33, 33, Ascii.EM, Ascii.DC2};
    }

    static {
        A02();
    }

    public U4(C0602Kk c0602Kk) {
        this.A00 = c0602Kk;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A00.A04.A06().A8F(A00(0, 14, 84));
    }
}
