package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RQ {
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            RP rpA00 = RP.A00(jSONArray, i);
            RP t2 = RP.A00(jSONArray2, i);
            if (rpA00 != t2 || !rpA00.A05(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            RP rpA01 = RP.A01(jSONObject, next);
            RP type1 = RP.A01(jSONObject2, next);
            if (rpA01 != type1 || !rpA01.A07(jSONObject, jSONObject2, next)) {
                return false;
            }
        }
        return true;
    }
}
