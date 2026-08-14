package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0956Yh implements InterfaceC02856v {
    public final /* synthetic */ C0954Yf A00;
    public final /* synthetic */ List A01;

    public C0956Yh(C0954Yf c0954Yf, List list) {
        this.A00 = c0954Yf;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        HashMap map = new HashMap();
        for (C02846u c02846u : this.A01) {
            if (c02846u.A02()) {
                String str = (String) c02846u.A01();
                C0955Yg systemProperty = new C0955Yg(str);
                map.put(str, systemProperty);
            }
        }
        return this.A00.A02(map);
    }
}
