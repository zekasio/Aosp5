package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.78, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass78 {
    public static byte[] A01;
    public static String[] A02 = {"dNawujz5uV7FYgEDis7mqHiOYshviVT", "9zMPJcjBq2CUVbnUK8h7IqP7lj2y2mDE", "v9kwRPsjL9e79G", "Q5ai3781mryKatmpPHMLZ9OBEo", "39szp", "Eqic037VHIj9mkDB9Ac6oywo8OkpAY9", "EWNNEyX3tdVvHEmrYmgOIteMXnkg7nZP", "FOdMhgM8irk7XO"};
    public static final String A03;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "0af503L5MOYuQEPRhxTnmunHvI";
            strArr2[4] = "8ZzF9";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 9, 9, Ascii.DC4, 9, 91, 56, 9, Ascii.RS, Ascii.SUB, Ascii.SI, Ascii.DC2, Ascii.NAK, Ascii.FS, 91, 49, 40, 52, 53, 50, 63};
    }

    static {
        A01();
        A03 = AnonymousClass78.class.getSimpleName();
    }

    public AnonymousClass78(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public final JSONObject A03() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 2, 21), this.A00);
        } catch (JSONException e) {
            Log.e(A03, A00(0, 19, 63), e);
        }
        return jSONObject;
    }
}
