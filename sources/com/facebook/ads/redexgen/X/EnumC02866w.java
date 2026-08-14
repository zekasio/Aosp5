package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC02866w {
    A04(0),
    A07(1024),
    A05(2048),
    A06(4096);

    public static byte[] A01;
    public static final Map<Integer, EnumC02866w> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-104, -101, -92, -97, -99, -92, -75, -97, -99, -92, -91, -88, -101, 120, 105, 122, 105, 118, 119, 113, 108, 127, 110, 123, 113, 124, 122, -116, ByteCompanionObject.MIN_VALUE, 110, 122, 125, 121, 114, -91, -89, -91, -94, -101, -107, -101, -95, -89, -91};
    }

    static {
        A02();
        A02 = new HashMap();
        for (EnumC02866w enumC02866w : values()) {
            A02.put(Integer.valueOf(enumC02866w.A00), enumC02866w);
        }
    }

    EnumC02866w(int i) {
        this.A00 = i;
    }

    public static EnumC02866w A00(int i) {
        EnumC02866w enumC02866w = A02.get(Integer.valueOf(i));
        return enumC02866w == null ? A04 : enumC02866w;
    }

    public final int A03() {
        return this.A00;
    }
}
