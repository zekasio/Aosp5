package com.facebook.ads.redexgen.X;

import android.provider.Settings;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZZ implements InterfaceC02856v {
    public static byte[] A01;
    public final /* synthetic */ ZY A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-77, -93, -78, -91, -91, -82, -97, -94, -78, -87, -89, -88, -76, -82, -91, -77, -77};
    }

    public ZZ(ZY zy) {
        this.A00 = zy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A03(Settings.System.getInt(r4.A00, A00(0, 17, 62), -1) / 255.0f);
    }
}
