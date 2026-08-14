package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02686e {
    public static byte[] A01;
    public static String[] A02 = {"GyiBUCkC", "sqowKkdsw23oOctujh4JS", "WS", "sGW2HqLA0299cVeMoAEL9ZXgIk1rlANi", "Ioat5RRD6XPbEJm7hsBEOKFMb", "Zw1v1TMFRqO", "eQUvG0dkOz1", "pYpbsacuB19XJGtGbFCxjlIFedam8DTp"};
    public static final String[] A03;
    public final float[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.NAK, -63, 7, -23, -33};
    }

    static {
        A01();
        A03 = new String[]{A00(2, 1, 93), A00(3, 1, 62), A00(4, 1, 51), A00(1, 1, 24)};
    }

    public C02686e(float[] fArr) {
        this.A00 = fArr;
    }

    private final float[] A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A00.length * 4;
    }

    public final JSONObject A04(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        int i = 0;
        while (true) {
            if (i >= this.A00.length) {
                break;
            }
            String[] strArr = A03;
            if (i < strArr.length) {
                jSONObject2.put(strArr[i], r3[i]);
            }
            i++;
        }
        if (A02[4].length() == 24) {
            throw new RuntimeException();
        }
        A02[5] = "3DgDBkbuSJHHMnWd9lbj3dg5obl1cN";
        jSONObject.put(A00(0, 1, 109), jSONObject2);
        return jSONObject;
    }

    public final boolean A05(C02686e c02686e) {
        float[] fArrA02 = c02686e.A02();
        if (fArrA02.length != this.A00.length) {
            return false;
        }
        for (int i = 0; i < fArrA02.length; i++) {
            if (Math.abs(A02()[i] - fArrA02[i]) > C6C.A01()) {
                return false;
            }
        }
        return true;
    }
}
