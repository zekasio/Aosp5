package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0603Kl {
    public static C0603Kl A00;
    public static byte[] A01;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, Ascii.ETB, Ascii.CAN, 41, 0, Ascii.ETB, Ascii.SUB, Ascii.US, Ascii.DC2, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 41, 3, 3, Ascii.US, Ascii.DC2, 96, 108, 103, 102, Ascii.DLE, Ascii.NAK, 0, Ascii.NAK, 103, 98, 119, 98, 76, 97, 105, 102, 96, 119, 35, 106, 112, 35, 109, 118, 111, 111, 65, 68, 81, 68, 122, 72, 74, 65, 64, 73, 122, 81, 92, 85, 64, 44, 45, 46, 33, 38, 33, 60, 33, 39, 38, 69, 82, 82, 79, 82, 87, 84, 80, 69, 68, 67, 84, 110, 82, 94, 95, 87, 88, 86, 66, 74, 92, 92, 78, 72, 74, Ascii.NAK, 9, 4, 6, 0, 8, 0, Ascii.VT, 17, Ascii.SYN, Ascii.SYN, Ascii.DLE, 3, 1, 9, 7, Ascii.DLE, 17, 77, 64, 73, 92};
    }

    static {
        A05();
        A00 = new C0603Kl();
    }

    public static synchronized C0603Kl A00() {
        return A00;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x005d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.C0846Ty A01(com.facebook.ads.redexgen.X.C0947Xy r11, org.json.JSONObject r12, long r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0603Kl.A01(com.facebook.ads.redexgen.X.Xy, org.json.JSONObject, long):com.facebook.ads.redexgen.X.Ty");
    }

    private C0845Tx A02(JSONObject jSONObject) {
        return new C0845Tx(jSONObject.optString(A04(117, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, 116), 0), null);
    }

    private C0845Tx A03(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray(A04(MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES, 10, 18)).getJSONObject(0);
            C9I c9iA00 = C9I.A00(jSONObject2.getJSONObject(A04(88, 10, 63)));
            String strOptString = jSONObject2.optString(A04(103, 14, 70));
            String featureConfig = A04(0, 19, 98);
            String strOptString2 = jSONObject2.optString(featureConfig);
            String strA04 = A04(117, 7, 88);
            String adReportingConfig = A04(0, 0, 87);
            String strOptString3 = jSONObject.optString(strA04, adReportingConfig);
            String adReportingConfig2 = A04(47, 4, 116);
            return new C0845Tx(strOptString3, jSONObject.optInt(adReportingConfig2, 0), new C9H(c9iA00, strOptString, strOptString2));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final C0605Kn A06(C0947Xy c0947Xy, String str, long j) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(A04(142, 4, 78));
            byte b = -1;
            int iHashCode = strOptString.hashCode();
            String strA04 = A04(98, 5, 87);
            if (iHashCode != 96432) {
                if (iHashCode == 96784904 && strOptString.equals(strA04)) {
                    b = 1;
                }
            } else if (strOptString.equals(A04(26, 3, 57))) {
                b = 0;
            }
            if (b == 0) {
                return A01(c0947Xy, jSONObject, j);
            }
            if (b != 1) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strA04);
                if (jSONObjectOptJSONObject != null) {
                    return A02(jSONObjectOptJSONObject);
                }
            } else {
                return A03(jSONObject);
            }
        }
        return new C0605Kn(EnumC0604Km.A04);
    }
}
