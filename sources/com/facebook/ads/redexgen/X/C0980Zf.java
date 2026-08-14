package com.facebook.ads.redexgen.X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0980Zf implements AnonymousClass72<String> {
    public final String A00;
    public final boolean A01;

    public C0980Zf(String str) {
        this.A00 = str;
        this.A01 = C0979Ze.A01().hasSystemFeature(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        C0980Zf c0980Zf = (C0980Zf) obj;
        return this.A00.equals(c0980Zf.A00) && this.A01 == c0980Zf.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        return this.A00.getBytes().length + 8;
    }
}
