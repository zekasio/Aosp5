package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9E extends N4 {
    public static byte[] A01;
    public final /* synthetic */ P2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public C9E(P2 p2) {
        this.A00 = p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(N5 n5) {
        new Handler(Looper.getMainLooper()).post(new P0(this));
        this.A00.A0B.ACj(A00(0, 5, 60), this.A00.A03());
    }
}
