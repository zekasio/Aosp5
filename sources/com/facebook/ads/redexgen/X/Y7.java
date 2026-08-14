package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y7<K, V> extends C7A<HashMap<K, AnonymousClass72>> {
    public static byte[] A02;
    public static String[] A03 = {"cKuQ341bpQpj1np", "NRRRR4TEAm42mDR", "Q3CZak00lhavTOo6A", "zaO6DFhzYxSygkW1IzlMUY8ES4dk", "HbJVSBx3MNS6tqQ9XVLKo36QU0gI1Znv", "JrCrl10lt1AHnaihPuUoLOH", "SHM67NRdcA0GW9YM4", "2pIXYY"};
    public final AnonymousClass79 A00;
    public final HashMap<K, AnonymousClass72> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{104};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    public Y7(long j, @Nullable AnonymousClass78 anonymousClass78, HashMap<K, AnonymousClass72> map, AnonymousClass79 anonymousClass79) {
        super(j, anonymousClass78, map, AnonymousClass79.A0A);
        this.A01 = map;
        this.A00 = anonymousClass79;
        if (A04()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(K k) {
        int i = AnonymousClass74.A00[this.A00.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return ((String) k).length();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    private boolean A04() {
        int i = AnonymousClass74.A00[this.A00.ordinal()];
        return i == 1 || i == 2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        int iAEp = 0;
        if (A07() == null || ((HashMap) A07()).isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ((HashMap) A07()).entrySet()) {
            int iA00 = iAEp + A00(entry.getKey());
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            A03[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            iAEp = iA00 + ((AnonymousClass72) entry.getValue()).AEp();
        }
        return iAEp;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject mapJsonObject) throws JSONException {
        Set<K> setKeySet = this.A01.keySet();
        JSONObject jSONObject = new JSONObject();
        for (K k : setKeySet) {
            AnonymousClass72 anonymousClass72 = this.A01.get(k);
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            A03[5] = "RtRjz";
            if (anonymousClass72 != null) {
                anonymousClass72.AFB(k, jSONObject);
            }
        }
        mapJsonObject.put(A01(0, 1, 112), jSONObject);
        return mapJsonObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<K, com.facebook.ads.internal.botdetection.signals.model.signal_value.IMapSignalValueDef>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y7 != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.C7A
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0A(C7A<HashMap<K, AnonymousClass72>> c7a) {
        boolean zA8S;
        if (A07() == null || c7a.A07() == null) {
            return A07() == null && c7a.A07() == null;
        }
        if (c7a.A07().size() != A07().size()) {
            return false;
        }
        HashMap<K, AnonymousClass72> mapA07 = c7a.A07();
        HashMap<K, AnonymousClass72> mapA072 = A07();
        Iterator<K> it = mapA07.keySet().iterator();
        Iterator<K> it2 = mapA072.keySet().iterator();
        do {
            boolean zHasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[1].length() == strArr[0].length()) {
                String[] strArr2 = A03;
                strArr2[1] = "rUsYWVrpG3VWCqr";
                strArr2[0] = "lLqYbR21ojeq3r6";
                if (!zHasNext || !it2.hasNext()) {
                    return true;
                }
                K next = it.next();
                K next2 = it2.next();
                if (!next.equals(next2) || !mapA07.containsKey(next) || !mapA072.containsKey(next2)) {
                    return false;
                }
                AnonymousClass72 anonymousClass72 = mapA07.get(next);
                AnonymousClass72 newSignal = mapA072.get(next2);
                AnonymousClass72 prevSignal = newSignal;
                if (anonymousClass72 == null || prevSignal == null) {
                    return anonymousClass72 == null && prevSignal == null;
                }
                zA8S = anonymousClass72.A8S(prevSignal);
                String[] strArr3 = A03;
                if (strArr3[7].length() != strArr3[3].length()) {
                    String[] strArr4 = A03;
                    strArr4[6] = "3Jq7wk4KgDHXBRv7A";
                    strArr4[2] = "zXvlpWgAojYXCnWeF";
                }
            }
            throw new RuntimeException();
        } while (zA8S);
        return false;
    }
}
