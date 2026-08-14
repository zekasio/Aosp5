package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GR implements InterfaceC0780Rj {
    public final EnumC0772Rb A00;
    public final C4L A01;

    public GR(C4L c4l, EnumC0772Rb enumC0772Rb) {
        this.A01 = c4l;
        this.A00 = enumC0772Rb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Rj
    public void A3O(Map<RR, EnumC0785Ro> map, Map<GV, EnumC0772Rb> map2) {
        map2.put(this.A01, this.A00);
    }
}
