package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9I {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{119, 117, 119, 124, 113, 117, 118, 120, 113, 76, 75, 83, 68, 73, 76, 65, 68, 81, 76, 74, 75, 122, 65, 80, 87, 68, 81, 76, 74, 75, 122, 76, 75, 122, 86, 64, 70, 74, 75, 65, 86, 87, 83, 84, 101, 76, 83, 95, 77, 91, 88, 83, 86, 83, 78, 67, 101, 74, 95, 72, 89, 95, 84, 78, 91, 93, 95, 1, Ascii.GS, Ascii.DLE, Ascii.DC2, Ascii.DC4, Ascii.FS, Ascii.DC4, Ascii.US, 5, 46, Ascii.EM, Ascii.DC4, Ascii.CAN, Ascii.SYN, Ascii.EM, 5, 57, 37, 40, 42, 44, 36, 44, 39, 61, Ascii.SYN, 62, 32, 45, 61, 33, 62, 41, 42, 62, 41, 63, 36, 70, 81, 82, 70, 81, 71, 92, 107, 64, 92, 70, 81, 71, 92, 91, 88, 80, 35, 52, 32, 36, 52, 34, 37, Ascii.SO, 37, 56, 60, 52, 62, 36, 37, Ascii.ETB, Ascii.SUB, 19, 6, 77, 82, 95, 94, 84, 100, 79, 82, 86, 94, 100, 75, 84, 87, 87, 82, 85, 92, 100, 82, 85, 79, 94, 73, 77, 90, 87, 77, 82, 94, 76, 90, 89, 82, 87, 82, 79, 66, 100, 88, 83, 94, 88, 80, 100, 82, 85, 82, 79, 82, 90, 87, 100, 95, 94, 87, 90, 66, 68, 91, 87, 69, 83, 80, 91, 94, 91, 70, 75, 109, 81, 90, 87, 81, 89, 109, 91, 92, 70, 87, 64, 68, 83, 94, 90, 69, 73, 91, 77, 78, 69, 64, 69, 88, 85, 115, 79, 68, 73, 79, 71, 115, 88, 69, 79, 71, 73, 94};
    }

    static {
        A02();
        A0H = C9I.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9I(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9I.<init>(java.util.Map):void");
    }

    public static C9I A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C9I(map);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
