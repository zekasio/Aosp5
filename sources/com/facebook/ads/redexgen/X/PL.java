package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PL {
    public static byte[] A08;
    public WeakReference<PA> A00;
    public WeakReference<SW> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C0947Xy A03;
    public final C0716Ox A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC0575Jh> A07;

    static {
        A09();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, Ascii.VT, Ascii.FF, 7, Ascii.ESC, Ascii.DC2, Ascii.SUB, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, Ascii.FF, Ascii.ESC, Ascii.DC4, Ascii.DC4, Ascii.VT, Ascii.DC2, 5, 19, Ascii.VT, Ascii.EM, Ascii.EM, 7, Ascii.CR, Ascii.VT, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, Ascii.ESC, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public PL(C0947Xy c0947Xy, PA pa, InterfaceC0575Jh interfaceC0575Jh, C0716Ox c0716Ox, String str, String str2) {
        this.A03 = c0947Xy;
        this.A00 = new WeakReference<>(pa);
        this.A07 = new WeakReference<>(interfaceC0575Jh);
        this.A04 = c0716Ox;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.close();
    }

    private void A05() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.A81();
    }

    private void A06() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.A8h();
    }

    private void A07() {
        this.A03.A0D().A4u();
        this.A02 = true;
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.AF2();
        if (JR.A1I(this.A03)) {
            this.A03.A09().AAT();
        }
    }

    private void A08() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.AAr();
    }

    private void A0A(PA pa, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = C0610Kt.A00(this.A03);
        String strA01 = A01(0, 0, 21);
        String strOptString = jSONObject.optString(A01(57, 5, 81), strA01);
        String opId = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        StringBuilder sb = new StringBuilder();
        String key = A01(14, 4, 103);
        sb.append(key);
        sb.append(opId);
        String key2 = sb.toString();
        String key3 = sharedPreferencesA00.getString(key2, strA01);
        if (key3 != null) {
            strA01 = key3;
        }
        pa.A0g(strOptString, strA01);
    }

    private void A0B(PA pa, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(0, 0, 21);
        String strOptString = jSONObject.optString(A01(98, 5, 12), strA01);
        String strOptString2 = jSONObject.optString(A01(57, 5, 81), strA01);
        String strOptString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        C0610Kt.A00(this.A03).edit().putString(A01(14, 4, 103) + strOptString3, strOptString).apply();
        pa.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(PJ pj, String str) throws JSONException {
        switch (pj) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0D().A56(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(pj, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        PA pa = this.A00.get();
        if (pa == null) {
        }
        switch (pj) {
            case A06:
                pa.A0S();
                break;
            case A05:
                pa.A0R();
                break;
            case A0P:
                A0B(pa, str);
                break;
            case A0L:
                A0A(pa, str);
                break;
            case A0F:
                pa.A0i(A03(new JSONObject(str)));
                break;
        }
    }

    private void A0D(PJ pj, String str) throws JSONException {
        SW sw = this.A01.get();
        if (sw == null) {
        }
        switch (pj) {
            case A0C:
                sw.AAv();
                break;
            case A0N:
                sw.ACK();
                break;
            case A0K:
                A0G(sw, str);
                break;
            case A0J:
                A0F(sw, str);
                break;
            case A0G:
                A0E(sw, str);
                break;
        }
    }

    private void A0E(SW sw, String str) throws JSONException {
        sw.ABZ(new JSONObject(str).optBoolean(A01(87, 5, 108), false));
    }

    private void A0F(SW sw, String str) throws JSONException {
        sw.ACn(new JSONObject(str).optBoolean(A01(62, 12, 118), false));
    }

    private void A0G(SW sw, String str) throws JSONException {
        sw.ACp(new JSONObject(str).optBoolean(A01(74, 13, 82), false));
    }

    private void A0I(JSONObject jSONObject) {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        String strOptString = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(strOptString)) {
            sw.A7w();
        } else {
            sw.A7x(strOptString);
        }
    }

    private void A0J(JSONObject jSONObject) {
        if (this.A01.get() == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC0575Jh interfaceC0575Jh = this.A07.get();
        if (interfaceC0575Jh == null) {
            return;
        }
        String strOptString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new C0583Jp(this.A06, interfaceC0575Jh).A03(strOptString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (iOptInt == -1) {
            return;
        }
        String strOptString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.A03.A0D().A8w(iOptInt, strOptString);
    }

    private void A0M(JSONObject jSONObject) {
        String strOptString;
        SW sw = this.A01.get();
        if (sw == null || (strOptString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        sw.AD2(strOptString);
    }

    public final void A0N(SW sw) {
        this.A01 = new WeakReference<>(sw);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        MM.A00(new PH(this, str));
    }
}
