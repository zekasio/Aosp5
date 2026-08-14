package com.tapjoy;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TJDataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f1677a = new JSONObject();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject a(org.json.JSONArray r6) throws org.json.JSONException {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r2 = "USER_ID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L26
            java.lang.String r1 = r5.a()
            org.json.JSONObject r3 = r5.f1677a
            if (r1 == 0) goto L21
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L23
        L21:
            java.lang.Object r1 = org.json.JSONObject.NULL
        L23:
            r3.put(r2, r1)
        L26:
            int r0 = r0 + 1
            goto L1
        L29:
            org.json.JSONObject r6 = r5.f1677a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJDataFetcher.a(org.json.JSONArray):org.json.JSONObject");
    }

    public String a() {
        return TapjoyConnectCore.getUserID();
    }
}
