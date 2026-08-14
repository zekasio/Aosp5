package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0457Er implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ F0 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, -39, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, -31, -33, -20};
    }

    public RunnableC0457Er(F0 f0) {
        this.A00 = f0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        DownloadAction[] downloadActionArrA03;
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                downloadActionArrA03 = this.A00.A09.A03(this.A00.A0E);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 6), A00(0, 27, 2), th);
                downloadActionArrA03 = new DownloadAction[0];
            }
            this.A00.A07.post(new RunnableC0456Eq(this, downloadActionArrA03));
        } catch (Throwable th2) {
            L0.A00(th2, this);
        }
    }
}
