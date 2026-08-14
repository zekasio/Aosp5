package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.13, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass13 {
    public static byte[] A00;
    public static String[] A01 = {"qHmRz", "buvn2cesYrN8zmkoMAJdpkbnyQRY3iAF", "x7vS8I9TWcDRkC3QyQGWlMzhObF4g2wW", "AIjy2jeTbkREqnWnmOA9dVfWABJZ", "IfUpOWHYsX9n2UOxpamTmBNI3XVXxi7a", "s9Ktc", "3piv7SWQV7vtTtwTZRFeo4G9v1NaSSob", "iW7v8IxehIW1LC67DBoujqNPrB3dw9pM"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, 50, 33, 38, 34, 43, 32, 34, -35, Ascii.VT, 34, 49, 52, 44, 47, 40, -35, 9, 44, Ascii.RS, 33, 34, 33, -9, Ascii.DLE, 3, 4, Ascii.SO, 7, -62, Ascii.SYN, 17, -62, Ascii.DC2, 3, Ascii.DC4, Ascii.NAK, 7, -62, 5, 3, Ascii.DC4, 17, Ascii.ETB, Ascii.NAK, 7, Ascii.SO, -62, 6, 3, Ascii.SYN, 3, -48, -41, -38, -43, -39, -34, -27, -33, -39, -37, -23, -43, -33, -39, -27, -28, -30, -27, -32, -28, -23, -16, -22, -28, -26, -12, -32, -19, -22, -17, -20, -32, -10, -13, -19, -5, -2, -7, Ascii.SO, Ascii.FF, -5, 8, Ascii.CR, 6, -5, Ascii.SO, 3, 9, 8, 68, 71, 89, 72, 85, 87, 76, 86, 72, 85, 66, 81, 68, 80, 72, Ascii.SUB, 39, Ascii.CAN, 37, 40, 32, 40, Ascii.CAN, 45, 50, 41, Ascii.RS, -19, -6, -17, 4, -23, -25, -14, -14, -27, -6, -11, -27, -25, -23, -6, -17, -11, -12, -45, -47, -30, -33, -27, -29, -43, -36, 65, 77, 76, 82, 63, 71, 76, 67, 80, 61, 84, 71, 67, 85, 63, 64, 71, 74, 71, 82, 87, 61, 65, 70, 67, 65, 73, 61, 71, 76, 82, 67, 80, 84, 63, 74, Ascii.ESC, 39, 38, 44, Ascii.EM, 33, 38, Ascii.GS, 42, Ascii.ETB, 46, 33, Ascii.GS, 47, Ascii.EM, Ascii.SUB, 33, 36, 33, 44, 49, Ascii.ETB, Ascii.GS, 38, Ascii.EM, Ascii.SUB, 36, Ascii.GS, Ascii.FS, -23, -22, -7, -22, -24, -7, -18, -12, -13, -28, -8, -7, -9, -18, -13, -20, -8, -37, -28, -41, -40, -30, -37, -43, -23, -28, -41, -26, -23, -34, -27, -22, -43, -30, -27, -35, 41, 50, 37, 38, 48, 41, 35, 58, 45, 41, 59, 35, 48, 51, 43, 74, 83, 72, 87, 94, 85, 89, 74, 73, 68, 72, 85, 82, -23, -27, -28, -25, -30, -26, -14, -16, -16, -28, -15, -25, Ascii.CAN, Ascii.NAK, 17, Ascii.DC4, Ascii.FS, Ascii.EM, Ascii.RS, Ascii.NAK, 54, 48, 60, 59, 77, 81, 69, 75, 73, 52, 57, 65, 44, 55, 52, 47, 44, 63, 52, 58, 57, 42, 45, 48, 51, 44, 65, 52, 58, 61, 62, 59, 64, 61, 49, 54, 55, 69, 53, 68, 59, 66, 70, 59, 65, 64, 38, Ascii.ETB, 40, 41, Ascii.US, 36, Ascii.GS, 45, Ascii.RS, 50, 48, 34, Ascii.FS, 49, 47, Ascii.RS, 43, 48, 41, Ascii.RS, 49, 38, 44, 43, 52, 48, 37, 61, 35, 56, 54, 37, 50, 55, 48, 37, 56, 45, 51, 50, 80, 82, 79, 77, 79, 84, 69, 68, 63, 84, 82, 65, 78, 83, 76, 65, 84, 73, 79, 78, -9, -22, -10, -6, -22, -8, -7, -28, -18, -23, 9, 4, -9, 6, 9, -2, 5, 10, -11, -7, 5, 3, 6, 8, -5, 9, 9, -11, 7, Ascii.VT, -9, 2, -1, 10, Ascii.SI, 64, 59, 46, 61, 64, 53, 60, 65, 44, 57, 60, 52, 44, 49, 50, 57, 46, 70, 44, 64, 50, 48, 60, 59, 49, 96, 92, 80, 86, 78, 89, 76, 80, 92, 91, 97, 82, 101, 97, -24, -27, -28, -29, -24, -28, -25, -38, -39, -44, -23, -25, -42, -29, -24, -31, -42, -23, -34, -28, -29, 64, 65, 46, 63, 44, 63, 46, 65, 54, 59, 52, 55, 57, 38, 56, 45, 56, 48, 41, 33, Ascii.SYN, 33, Ascii.EM, Ascii.DC2, 50, 48, 34, 33, Ascii.FS, 47, 34, 45, 44, 47, 49, Ascii.FS, 50, 47, 41, 69, 56, 51, 52, 62, 46, 48, 68, 67, 62, 63, 59, 48, 72, 46, 52, 61, 48, 49, 59, 52, 51, Ascii.RS, 17, Ascii.FF, Ascii.CR, Ascii.ETB, 7, Ascii.NAK, Ascii.CAN, Ascii.FF, 4, -9, -14, -13, -3, -19, -2, 0, -13, -6, -3, -17, -14, -19, 1, -9, 8, -13, -19, -16, 7, 2, -13, 1, 82, 69, 64, 65, 75, 59, 81, 78, 72, 76, 63, 59, 77, 55, 56, 63, 66, 63, 74, 79, 53, 57, 62, 59, 57, 65, 53, 63, 68, 63, 74, 63, 55, 66, 53, 58, 59, 66, 55, 79, 41, Ascii.FS, Ascii.CAN, 42, Ascii.DC4, Ascii.NAK, Ascii.FS, Ascii.US, Ascii.FS, 39, 44, Ascii.DC2, Ascii.SYN, Ascii.ESC, Ascii.CAN, Ascii.SYN, Ascii.RS, Ascii.DC2, Ascii.FS, 33, 39, Ascii.CAN, 37, 41, Ascii.DC4, Ascii.US};
        String[] strArr = A01;
        if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aYUm7";
        strArr2[5] = "aSssW";
    }

    static {
        A03();
    }

    public static AnonymousClass11 A00(C0947Xy c0947Xy, JSONObject jSONObject, String str) {
        return A01(c0947Xy, jSONObject, str, false, -1, 0);
    }

    public static AnonymousClass11 A01(C0947Xy c0947Xy, JSONObject jSONObject, String str, boolean z, int i, int i2) {
        KA ka;
        ArrayList arrayList;
        String strA02 = A02(349, 7, 70);
        if (jSONObject == null) {
            return new AnonymousClass11();
        }
        C0623Lg.A02(c0947Xy, A02(0, 23, 77));
        String strOptString = jSONObject.optString(A02(HttpStatus.SC_CONFLICT, 10, 21));
        int iOptInt = jSONObject.optInt(A02(116, 12, 73), 0);
        String strOptString2 = jSONObject.optString(A02(270, 13, 117));
        String encryptedCPM = C0638Lx.A02(jSONObject, A02(283, 12, 19));
        Uri uriA00 = TextUtils.isEmpty(encryptedCPM) ? null : C0617La.A00(encryptedCPM);
        String strA022 = C0638Lx.A02(jSONObject, A02(128, 4, 27));
        String strA01 = MC.A01(strA022);
        String adUntrimmedBodyText = A02(101, 15, 115);
        String strA023 = C0638Lx.A02(jSONObject, adUntrimmedBodyText);
        String adUntrimmedBodyText2 = A02(523, 5, 61);
        String requestId = C0638Lx.A02(jSONObject, adUntrimmedBodyText2);
        String adUntrimmedBodyText3 = A02(515, 8, 84);
        String adBodyText = C0638Lx.A02(jSONObject, adUntrimmedBodyText3);
        String adSubtitle = A02(295, 8, 64);
        String adSocialContext = C0638Lx.A02(jSONObject, adSubtitle);
        String adHeadline = A02(469, 14, 125);
        String adPlayTranslation = C0638Lx.A02(jSONObject, adHeadline);
        String adHeadline2 = A02(333, 16, 98);
        String strA024 = C0638Lx.A02(jSONObject, adHeadline2);
        String adHeadline3 = A02(483, 21, 5);
        String strA025 = C0638Lx.A02(jSONObject, adHeadline3);
        String adHeadline4 = A02(87, 14, 42);
        String strA026 = C0638Lx.A02(jSONObject, adHeadline4);
        String adTranslation = A02(389, 20, 112);
        String videoUrl = C0638Lx.A02(jSONObject, adTranslation);
        String adPromotedTranslation = A02(373, 16, 84);
        String strA027 = C0638Lx.A02(jSONObject, adPromotedTranslation);
        String adPromotedTranslation2 = A02(356, 17, 77);
        String strA028 = C0638Lx.A02(jSONObject, adPromotedTranslation2);
        String adPromotedTranslation3 = A02(132, 14, 22);
        String strA029 = C0638Lx.A02(jSONObject, adPromotedTranslation3);
        C1198dH c1198dHA01 = C1198dH.A01(jSONObject, c0947Xy);
        K5 k5A00 = K5.A00(jSONObject.optJSONObject(A02(HttpStatus.SC_SEE_OTHER, 4, 93)));
        K5 k5A002 = K5.A00(jSONObject.optJSONObject(A02(307, 5, 116)));
        K6 k6A00 = K6.A00(jSONObject.optJSONObject(A02(HttpStatus.SC_GATEWAY_TIMEOUT, 11, 93)));
        String strA0210 = C0638Lx.A02(jSONObject, A02(528, 15, 77));
        boolean zOptBoolean = jSONObject.optBoolean(A02(255, 15, 84));
        boolean zOptBoolean2 = jSONObject.optBoolean(A02(236, 19, 6));
        int iOptInt2 = jSONObject.optInt(A02(444, 25, 93), 4);
        int iOptInt3 = jSONObject.optInt(A02(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 25, 38), 0);
        int iOptInt4 = jSONObject.optInt(A02(607, 31, 102), 0);
        int iOptInt5 = jSONObject.optInt(A02(638, 26, 67), 1000);
        JSONObject adChoicesIconObject = jSONObject.optJSONObject(A02(53, 15, 6));
        K5 k5A003 = null;
        if (adChoicesIconObject != null) {
            k5A003 = K5.A00(adChoicesIconObject);
        }
        String strA0211 = C0638Lx.A02(jSONObject, A02(68, 19, 17));
        EnumC01200h enumC01200hA00 = EnumC01200h.A00(jSONObject.optString(A02(312, 21, 91)));
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(jSONObject.optString(A02(219, 17, 21)));
        } catch (JSONException e) {
            c0947Xy.A06().A8y(strA02, C03298z.A2B, new AnonymousClass90(e));
        }
        Collection<String> collectionA01 = C01220j.A01(jSONArray);
        String strA0212 = C0638Lx.A02(jSONObject, A02(598, 9, 108));
        long jOptLong = jSONObject.optLong(A02(574, 24, 30), -1L);
        String strA0213 = C0638Lx.A02(jSONObject, A02(565, 9, 56));
        String videoMPD = A02(543, 22, 95);
        if (!jSONObject.has(videoMPD)) {
            ka = KA.A03;
        } else if (jSONObject.optBoolean(videoMPD)) {
            ka = KA.A05;
        } else {
            ka = KA.A04;
        }
        String strA0214 = A02(190, 29, 72);
        if (A01[7].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A01[7] = "1dt4CnIt66xCnA4CbnpWbYAL0az2V9Kq";
        boolean zOptBoolean3 = jSONObject.optBoolean(strA0214);
        int iOptInt6 = jSONObject.optInt(A02(154, 36, 110), 100);
        ArrayList arrayList2 = null;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(146, 8, 0));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                arrayList = new ArrayList(length);
                for (int cardIndex = 0; cardIndex < length; cardIndex++) {
                    try {
                        arrayList.add(A01(c0947Xy, jSONArrayOptJSONArray.getJSONObject(cardIndex), str, true, cardIndex, length));
                    } catch (JSONException e2) {
                        e = e2;
                        arrayList2 = arrayList;
                        c0947Xy.A06().A8y(strA02, C03298z.A29, new AnonymousClass90(e));
                        Log.e(C1217da.A0C, A02(23, 30, 50), e);
                        return new AnonymousClass11(strA0211, strA01, strA022, strA023, requestId, adBodyText, adSocialContext, adPlayTranslation, strA024, strA025, strA026, videoUrl, strA027, strA028, strA029, k5A003, c1198dHA01, k5A00, k5A002, k6A00, strA0212, strA0213, jOptLong, ka, z, i, i2, arrayList2, str, strOptString, iOptInt, strOptString2, uriA00, strA0210, zOptBoolean, zOptBoolean2, iOptInt3, iOptInt2, iOptInt4, iOptInt5, enumC01200hA00, collectionA01, iOptInt6, zOptBoolean3);
                    }
                }
            } else {
                arrayList = null;
            }
            arrayList2 = arrayList;
        } catch (JSONException e3) {
            e = e3;
        }
        return new AnonymousClass11(strA0211, strA01, strA022, strA023, requestId, adBodyText, adSocialContext, adPlayTranslation, strA024, strA025, strA026, videoUrl, strA027, strA028, strA029, k5A003, c1198dHA01, k5A00, k5A002, k6A00, strA0212, strA0213, jOptLong, ka, z, i, i2, arrayList2, str, strOptString, iOptInt, strOptString2, uriA00, strA0210, zOptBoolean, zOptBoolean2, iOptInt3, iOptInt2, iOptInt4, iOptInt5, enumC01200hA00, collectionA01, iOptInt6, zOptBoolean3);
    }
}
