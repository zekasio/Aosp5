package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UW implements InterfaceC0573Jf {
    public static byte[] A02;
    public static String[] A03 = {"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    public static final String A04;
    public C0946Xx A00;
    public XS A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{Ascii.NAK, 83, 90, 71, Ascii.NAK, 80, 67, 80, 91, 65, 124, 81, Ascii.NAK, 60, 111, 105, 127, 127, 121, 111, 111, 122, 105, 112, 112, 101, 50, 110, 101, 68, 77, 68, 85, 68, 69, 1, 68, 87, 68, 79, 85, 82, 1, 68, 89, 66, 68, 68, 69, 68, 69, 1, 83, 68, 85, 83, 88, 1, 77, 72, 76, 72, 85, Ascii.SI, 1, 98, 78, 84, 79, 85, Ascii.ESC, 1, 72, 123, 104, 99, 121, 45, 121, 116, 125, 104, 45, 125, 127, 98, 110, 104, 126, 126, 104, 105, 45, 111, 116, 45, 121, 101, 104, 45, 126, 104, 127, 123, 104, 127, 55, 45, 84, 115, 123, 126, 119, 118, 50, 102, 125, 50, 98, 115, 96, 97, 119, 50, 115, 124, 50, 119, 100, 119, 124, 102, 50, 123, 124, 50, 119, 100, 119, 124, 102, 97, 50, 115, 96, 96, 115, 107, 50, 116, 125, 96, 50, 118, 123, 97, 98, 115, 102, 113, 122, 50, 116, 115, 123, 126, 103, 96, 119, 60, 65, 119, 96, 100, 119, 96, 50, 98, 96, 125, 113, 119, 97, 97, 119, 118, 50, 119, 100, 119, 124, 102, 91, 118, 50, 50, 4, 19, Ascii.ETB, 4, 19, 65, 19, 4, Ascii.NAK, Ascii.DC4, 19, Ascii.SI, 4, 5, 65, Ascii.SI, Ascii.SO, Ascii.SI, 76, 19, 4, Ascii.NAK, 19, Ascii.CAN, 0, 3, Ascii.CR, 4, 65, 4, 19, 19, Ascii.SO, 19, 65, 2, Ascii.SO, 5, 4, 65, 42, Ascii.FS, Ascii.VT, Ascii.SI, Ascii.FS, Ascii.VT, 89, Ascii.VT, Ascii.FS, Ascii.CR, Ascii.FF, Ascii.VT, Ascii.ETB, Ascii.FS, Ascii.GS, 89, Ascii.VT, Ascii.FS, Ascii.CR, Ascii.VT, 0, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 89, Ascii.FS, Ascii.VT, Ascii.VT, Ascii.SYN, Ascii.VT, 89, Ascii.SUB, Ascii.SYN, Ascii.GS, Ascii.FS, 89, 86, 109, 98, 97, 111, 102, 35, 119, 108, 35, 115, 98, 113, 112, 102, 35, 103, 102, 97, 118, 100, 79, 108, 100, 70, 117, 102, 109, 119, 35, 98, 119, 35, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 54, 37, 54, 61, 39, 115, 50, 39, 115, 111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 73, 95, 72, 76, 95, 72, Ascii.SUB, 72, 95, 73, 74, 85, 84, 73, 95, Ascii.SUB, 91, 78, Ascii.SUB, 74, 85, 73, 83, 78, 83, 85, 84, Ascii.SUB, 80, 92, 87, 86, 104, 109, 120, 109, 110, 109, 127, 105, 17, 2, 17, Ascii.SUB, 0, 7, 6, 5, 1, Ascii.DC4, Ascii.NAK, Ascii.DC2, 5, 77, 3, Ascii.SI, Ascii.SO, 6, 9, 7, 77, 5, Ascii.SYN, 5, Ascii.SO, Ascii.DC4, 77, Ascii.CR, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, Ascii.CAN, 36, 40, 41, 33, 46, 32, 44, 33, 71, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    static {
        A05();
        A04 = UW.class.getSimpleName();
    }

    public UW(C0946Xx c0946Xx, XS xs) {
        this.A00 = c0946Xx;
        this.A01 = xs;
    }

    public static JSONArray A01(C0946Xx c0946Xx, JSONArray jSONArray, JSONArray jSONArray2) {
        int length = jSONArray != null ? 0 + jSONArray.length() : 0;
        if (jSONArray2 != null) {
            length += jSONArray2.length();
        }
        return A02(c0946Xx, jSONArray, jSONArray2, length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        if (r22 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        r7.put(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (r3 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        r7.put(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray A02(com.facebook.ads.redexgen.X.C0946Xx r19, org.json.JSONArray r20, org.json.JSONArray r21, int r22) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UW.A02(com.facebook.ads.redexgen.X.Xx, org.json.JSONArray, org.json.JSONArray, int):org.json.JSONArray");
    }

    private JSONObject A03() {
        JSONArray jSONArrayA03;
        JSONObject payload = this.A01.A5g();
        JSONArray jSONArrayA5f = this.A01.A5f();
        if (JT.A0P(this.A00) && (jSONArrayA03 = AnonymousClass91.A03(this.A00)) != null && jSONArrayA03.length() > 0) {
            C0946Xx c0946Xx = this.A00;
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "DqeH9SIpXFi3b8zfs8mhzwqF8zVFhPmm";
            strArr2[2] = "TV1z9woSYeZeWz7dxNs9KlrMFeTbS55S";
            jSONArrayA5f = A01(c0946Xx, jSONArrayA03, jSONArrayA5f);
        }
        JSONObject jSONObject = null;
        if (jSONArrayA5f != null) {
            try {
                jSONObject = new JSONObject();
                if (payload != null) {
                    jSONObject.put(A00(439, 6, 32), payload);
                }
                jSONObject.put(A00(387, 6, 28), jSONArrayA5f);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i) {
        int iA08;
        JSONArray jSONArrayA04;
        Pair<JSONObject, JSONArray> pairA7f = this.A01.A7f(i);
        JSONObject jSONObject = (JSONObject) pairA7f.first;
        JSONArray jSONArrayA02 = (JSONArray) pairA7f.second;
        if (JT.A0P(this.A00) && (jSONArrayA04 = AnonymousClass91.A04(this.A00, (iA08 = JT.A08(this.A00)))) != null) {
            int debugEventLimit = jSONArrayA04.length();
            if (debugEventLimit > 0) {
                jSONArrayA02 = A02(this.A00, jSONArrayA04, jSONArrayA02, i + iA08);
            }
        }
        JSONObject jSONObject2 = null;
        if (jSONArrayA02 != null) {
            try {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(439, 6, 32), jSONObject);
                }
                jSONObject2.put(A00(387, 6, 28), jSONArrayA02);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A06(String str) {
        if (AnonymousClass91.A0I(str)) {
            AnonymousClass91.A0B(this.A00, str);
        } else {
            this.A01.A8G(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0573Jf
    public final JSONObject A4H() {
        int iA0F = JT.A0F(this.A00);
        return iA0F > 0 ? A04(iA0F) : A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0573Jf
    public final boolean A8a() {
        int iA0F = JT.A0F(this.A00);
        return iA0F >= 1 && this.A01.A6a() + AnonymousClass91.A00(this.A00) > iA0F;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0573Jf
    public final void A9y() {
        int iA3z = this.A01.A3z(JT.A0G(this.A00));
        if (iA3z > 0) {
            this.A00.A06().A8y(A00(379, 8, 100), C03298z.A10, new AnonymousClass90(A00(28, 44, 73) + iA3z));
        }
        C0946Xx c0946Xx = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int length = str.length();
        int attemptsExceededEventsCount = str2.length();
        if (length == attemptsExceededEventsCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        AnonymousClass91.A0F(c0946Xx);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0573Jf
    public final void AAU(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                A06(jSONArray.getJSONObject(i).getString(A00(433, 2, 45)));
            } catch (JSONException e) {
                if (this.A00.A03().A8P()) {
                    String str = A04;
                    String[] strArr = A03;
                    if (strArr[5].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0573Jf
    public final boolean AAW(JSONArray jSONArray) {
        String eventId = A00(27, 1, 40);
        boolean z = true;
        boolean zA0P = JT.A0P(this.A00);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(string)) {
                    JR.A0O(this.A00).A2E(jSONObject.getString(A00(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 14, 47)));
                    this.A00.A02().A9W();
                } else {
                    int i2 = jSONObject.getInt(A00(375, 4, 91));
                    if (i2 == 1) {
                        if (this.A00.A03().A8P()) {
                            String str = A00(170, 25, 122) + string + A00(13, 14, 116);
                            String strA6d = this.A01.A6d(string);
                            if (strA6d != null) {
                                StringBuilder sb = new StringBuilder();
                                String eventType = A00(72, 36, 101);
                                sb.append(eventType);
                                sb.append(strA6d);
                                sb.toString();
                            }
                        }
                        if (!this.A01.A4j(string) && zA0P) {
                            AnonymousClass91.A0D(string);
                        }
                    } else {
                        String strA00 = A00(0, 13, 93);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (this.A00.A03().A8P()) {
                                Log.e(A04, A00(236, 37, 17) + i2 + strA00 + string + eventId);
                            }
                            A06(string);
                            z = false;
                        } else if (i2 >= 2000) {
                            String[] strArr = A03;
                            String str2 = strArr[5];
                            String str3 = strArr[6];
                            int i3 = str2.length();
                            if (i3 == str3.length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[0] = "6SiN";
                            strArr2[4] = "roGm";
                            if (i2 < 3000) {
                                if (this.A00.A03().A8P()) {
                                    Log.e(A04, A00(195, 41, 9) + i2 + strA00 + string + eventId);
                                }
                                if (!this.A01.A4j(string) && zA0P) {
                                    AnonymousClass91.A0D(string);
                                }
                            }
                        }
                    }
                    this.A00.A01().A8s(this.A00, jSONObject.toString());
                }
            } catch (JSONException e) {
                if (this.A00.A03().A8P()) {
                    Log.e(A04, A00(331, 44, 82) + i + eventId, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0573Jf
    public final void AC2() {
        this.A01.A40();
        AnonymousClass91.A07(this.A00);
    }
}
