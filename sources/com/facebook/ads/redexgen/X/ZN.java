package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZN extends C02766m {
    public static byte[] A01;
    public final KeyguardManager A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-57, -63, -43, -61, -47, -67, -50, -64};
    }

    public ZN(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (KeyguardManager) context.getSystemService(A02(0, 8, 85));
    }

    public final InterfaceC02856v A0G() {
        return new ZR(this);
    }

    public final InterfaceC02856v A0H() {
        return new ZQ(this);
    }

    public final InterfaceC02856v A0I() {
        return new ZP(this);
    }

    public final InterfaceC02856v A0J() {
        return new ZO(this);
    }
}
