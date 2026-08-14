package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1028aR extends C02766m {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{-22, -2, -19, -14, -8};
    }

    public C1028aR(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 104));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<Integer, C1029aS> map) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), map, AnonymousClass79.A06);
    }

    public final InterfaceC02856v A0G() {
        return new C1031aU(this);
    }

    public final InterfaceC02856v A0H() {
        return new C1034aX(this);
    }

    public final InterfaceC02856v A0I() {
        return new C1033aW(this);
    }

    public final InterfaceC02856v A0J() {
        return new C1032aV(this);
    }

    public final InterfaceC02856v A0K(List<C02846u> list) {
        return new C1030aT(this, list);
    }
}
