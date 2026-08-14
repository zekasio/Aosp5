package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PN {
    public static byte[] A00;
    public static String[] A01 = {"xPMOoUfbkmQ5kvnU3jbgLL47OcFEjU7z", "1dodMLotzUEJucQn2MWgY64F", "Ei0kY7ZOP", "czo3jP2JN", "", "hHdeWCinA2EaAz86iaUgwk6OrkZVXmHI", "CkfkaUvdCRi5J5AIUl6JSr62iIVQ3RiE", "AT3hLPm3hPYjZ73rxoY4ER"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{69, 114, 114, 111, 114, 32, 116, 114, 97, 110, 115, 102, 111, 114, 109, 105, 110, 103, 32, 74, 83, 79, 78, 32, 105, 110, 32, 117, 112, 100, 97, 116, 101, 67, 97, 99, 104, 101, 100, 85, 114, 108, 115, 54, 52, 39, 58, 32, 38, 48, 57, 123, 102, 113, 126, 114, 118, 124, 64, 108, 123, 116, 64, 115, 126, 102, 122, 109, 64, 124, 112, 114, 111, 126, 113, 118, 112, 113, 64, 105, 118, 122, 104, 64, 119, 107, 114, 115, 64, 106, 109, 115, 85, 72, 95, 80, 92, 88, 82, 110, 66, 85, 90, 110, 93, 80, 72, 84, 67, 110, 89, 69, 92, 93, 110, 68, 67, 93, 43, 32, 42, 17, 45, 47, 60, 42, 17, 39, 35, 47, 41, 43, 61, 2, 8, 4, 5, 76, 72, 68, 66, 64, 104, 111, 113, Ascii.NAK, 10, 7, 6, Ascii.FF, 60, Ascii.SYN, 17, Ascii.SI};
    }

    static {
        A02();
    }

    public static PM A00(C0947Xy c0947Xy, JSONObject jSONObject, C7U c7u, C0583Jp c0583Jp, C0716Ox c0716Ox, boolean z) {
        boolean updateUrls;
        String strA0R;
        String strA0R2;
        boolean z2 = z;
        String strA01 = A01(142, 3, 82);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String strOptString = jSONObject.optString(A01(92, 26, 126));
        String strOptString2 = jSONObject.optString(A01(51, 41, 80));
        arrayList3.add(strOptString);
        arrayList3.add(strOptString2);
        if (z2) {
            strA0R = c7u.A0R(strOptString);
            strA0R2 = c7u.A0R(strOptString2);
            if (strOptString.equals(strA0R) || strOptString2.equals(strA0R2)) {
                z2 = false;
                updateUrls = false;
            } else {
                updateUrls = z2;
            }
        } else {
            updateUrls = z2;
            strA0R = strOptString;
            strA0R2 = strOptString2;
        }
        c0583Jp.A02(EnumC0582Jo.A0P, null);
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(133, 4, 36));
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optString(strA01) != null) {
                arrayList.add(jSONObjectOptJSONObject.optString(strA01));
                if (updateUrls) {
                    jSONObjectOptJSONObject.put(strA01, c7u.A0Q(jSONObjectOptJSONObject.optString(strA01)));
                }
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(118, 15, 1));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString3 = jSONArrayOptJSONArray.optString(i);
                    arrayList.add(strOptString3);
                    if (updateUrls) {
                        jSONArrayOptJSONArray.put(i, c7u.A0Q(strOptString3));
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 26));
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    A03(arrayList, arrayList2, jSONArrayOptJSONArray2.optJSONObject(i2), c7u, updateUrls);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c7u, updateUrls);
            }
        } catch (JSONException unused) {
            c0716Ox.A04(C03298z.A15, A01(0, 43, 79));
        }
        return new PM(jSONObject, strA0R, strA0R2, arrayList, arrayList2, arrayList3, z2);
    }

    public static void A03(ArrayList<String> arrayList, ArrayList<String> arrayList2, JSONObject jSONObject, C7U c7u, boolean z) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(137, 5, 106));
        if (jSONObjectOptJSONObject != null) {
            String strA01 = A01(142, 3, 82);
            if (A01[1].length() == 1) {
                throw new RuntimeException();
            }
            A01[7] = "G1neCcMuoIIVUH8A2yIEObncf";
            if (jSONObjectOptJSONObject.optString(strA01) != null) {
                String strOptString = jSONObjectOptJSONObject.optString(strA01);
                arrayList.add(strOptString);
                if (z) {
                    jSONObjectOptJSONObject.put(strA01, c7u.A0Q(strOptString));
                }
            }
        }
        String strA012 = A01(145, 9, 44);
        if (!TextUtils.isEmpty(jSONObject.optString(strA012))) {
            String strOptString2 = jSONObject.optString(strA012);
            arrayList2.add(strOptString2);
            if (z) {
                jSONObject.put(strA012, c7u.A0R(strOptString2));
            }
        }
    }
}
