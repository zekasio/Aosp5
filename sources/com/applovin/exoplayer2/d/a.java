package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.l.ai;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return ai.f611a >= 27 ? bArr : ai.c(a(ai.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (ai.f611a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(ai.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return ai.c(sb.toString());
        } catch (JSONException e) {
            com.applovin.exoplayer2.l.q.c("ClearKeyUtil", "Failed to adjust response data: " + ai.a(bArr), e);
            return bArr;
        }
    }

    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
