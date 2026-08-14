package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0962Yn implements InterfaceC02856v {
    public final /* synthetic */ EnumC02816r A00;
    public final /* synthetic */ C0960Yl A01;
    public final /* synthetic */ List A02;

    public C0962Yn(C0960Yl c0960Yl, List list, EnumC02816r enumC02816r) {
        this.A01 = c0960Yl;
        this.A02 = list;
        this.A00 = enumC02816r;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        HashMap map = new HashMap();
        for (C02846u c02846u : this.A02) {
            if (c02846u.A02()) {
                String str = (String) c02846u.A01();
                C0961Ym systemSettings = new C0961Ym(this.A01.A00, str, this.A00);
                map.put(str, systemSettings);
            }
        }
        return this.A01.A03((HashMap<String, C0961Ym>) map);
    }
}
