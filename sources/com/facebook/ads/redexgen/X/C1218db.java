package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1218db extends L8 {
    public final /* synthetic */ C1217da A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1218db(C1217da c1217da, Map map, Map map2) {
        this.A00 = c1217da;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (!TextUtils.isEmpty(this.A00.A01.A0Y())) {
            HashMap map = new HashMap();
            map.putAll(this.A02);
            map.putAll(this.A01);
            this.A00.A09.A08().A9L(this.A00.A01.A0Y(), map);
        }
    }
}
