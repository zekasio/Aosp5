package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AR implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ E1 A00;
    public final /* synthetic */ C0373As A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-20, Ascii.US, Ascii.SYN, -9, 19, 8, 32, Ascii.FF, Ascii.EM, -16, Ascii.DC4, Ascii.ETB, 19, -16, Ascii.NAK, Ascii.ESC, Ascii.FF, Ascii.EM, Ascii.NAK, 8, 19, -30, -5, -14, 5, -3, -14, -16, 1, -14, -15, -83, -14, -1, -1, -4, -1, -83, -15, -14, -7, -10, 3, -14, -1, -10, -5, -12, -83, -6, -14, 0, 0, -18, -12, -14, -83, -4, -5, -83, -14, 5, 1, -14, -1, -5, -18, -7, -83, 1, -11, -1, -14, -18, -15, -69};
    }

    public AR(E1 e1, C0373As c0373As) {
        this.A00 = e1;
        this.A01 = c0373As;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A0X(this.A01);
            } catch (AM e) {
                Log.e(A00(0, 21, 48), A00(21, 55, 22), e);
                throw new RuntimeException(e);
            }
        } catch (Throwable e2) {
            L0.A00(e2, this);
        }
    }
}
