package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.adapters.datamodels.FrequencyCappingData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01310t {
    public static byte[] A03;
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 25));

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{Ascii.CR, Ascii.VT, 56, 58, 43, 74, 65, 76, 93, 86, 95, 91, 74, 75, 112, 78, 75, 112, 70, 75, 112, 64, 93, 70, 72, 70, 65, 78, 67, 94, 85, 88, 73, 66, 75, 79, 94, 95, 100, 82, 95, 114, 126, 103, 64, 124, 126, 111, 111, 122, 123, 64, 126, 109, 109, 126, 102, 64, 115, 122, 113, 120, 107, 119, Ascii.FF, 0, 0, Ascii.SYN, 17, 17, 6, Ascii.CR, 0, 6, Ascii.DLE, Ascii.RS, Ascii.VT, Ascii.FS, 7, 1, 10, 97, 118, 108, 109, 70, 118, 122, 122, 108, 107, 107, 124, 119, 122, 124, 70, 106, 124, 122, 106, 108, 123, 97, 96, 75, 100, 113, 102, 125, 123, 112};
    }

    private final synchronized C1O A00(String str, JSONObject jSONObject) throws JSONException, AnonymousClass90 {
        C1O c1o;
        if (str.equals(jSONObject.optString(A01(29, 12, 116), null))) {
            c1o = new C1O(str);
            A03(c1o, jSONObject);
        } else {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 96), str);
            anonymousClass90.A05(jSONObject);
            anonymousClass90.A03(1);
            throw anonymousClass90;
        }
        return c1o;
    }

    private void A03(C1O c1o, JSONObject jSONObject) throws JSONException {
        int xoutTimeSecs = jSONObject.optInt(A01(75, 6, 33));
        int iOptInt = jSONObject.optInt(A01(101, 11, 91));
        int iOptInt2 = jSONObject.optInt(A01(41, 23, 80), 50);
        long jOptLong = jSONObject.optLong(A01(2, 3, 20));
        String strA01 = A01(64, 11, 44);
        if (jSONObject.has(strA01)) {
            c1o.A06((JSONArray) jSONObject.get(strA01));
        }
        String strA012 = A01(81, 20, 86);
        if (jSONObject.has(strA012)) {
            c1o.A04(jSONObject.optInt(strA012));
        }
        c1o.A05(xoutTimeSecs, iOptInt, jOptLong, iOptInt2);
    }

    public final String A04() {
        String str = this.A02.get();
        return str == null ? A01(0, 2, 25) : str;
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        for (String encryptedAdId : this.A01) {
            jSONArray.put(encryptedAdId);
        }
        AtomicReference<String> atomicReference = this.A02;
        String encryptedAdId2 = jSONArray.toString();
        atomicReference.set(encryptedAdId2);
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C1O.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        AnonymousClass67.A03();
    }

    public final synchronized void A08(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < C1O.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        AnonymousClass67.A03();
    }

    public final synchronized void A0A(String str) throws JSONException, AnonymousClass90 {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap map = new HashMap();
                Iterator<String> itKeys = this.A00.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.get(next) instanceof String) {
                        C1O frequencyCappingData = A00(next, new JSONObject((String) this.A00.get(next)));
                        map.put(next, frequencyCappingData);
                    }
                }
                for (Map.Entry<String, FrequencyCappingData> e : map.entrySet()) {
                    this.A00.put(e.getKey(), e.getValue());
                }
            }
        }
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C1O c1o;
        String strOptString = jSONObject.optString(A01(29, 12, 116), null);
        if (strOptString == null) {
            return;
        }
        if (this.A00.has(strOptString) && (this.A00.get(strOptString) instanceof C1O)) {
            c1o = (C1O) this.A00.get(strOptString);
        } else {
            c1o = new C1O(strOptString);
        }
        A03(c1o, jSONObject);
        this.A00.put(strOptString, c1o);
    }
}
