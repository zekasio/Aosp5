package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.61, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass61 {

    @Nullable
    public static AnonymousClass62 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (AnonymousClass61.class) {
            if (A00 == null) {
                return;
            }
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00.AE2());
            anonymousClass90.A03(1);
            C0946Xx sdkContext = C8T.A00();
            if (sdkContext != null) {
                sdkContext.A06().A8y(A00(0, 9, 109), 3401, anonymousClass90);
            }
            A00.reset();
        }
    }

    public static void A03(final long j) {
        if (j > 0) {
            A00 = new C1081bI();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.63
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() throws Throwable {
                    if (L0.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                L0.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        AnonymousClass61.A01();
                    }
                }
            };
        }
    }
}
