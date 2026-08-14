package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GQ implements InterfaceC0780Rj {
    public final C0516Gy A00;
    public final EnumC0785Ro A01;

    public GQ(C0516Gy c0516Gy, EnumC0785Ro enumC0785Ro) {
        this.A00 = c0516Gy;
        this.A01 = enumC0785Ro;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Rj
    public void A3O(Map<RR, EnumC0785Ro> map, Map<GV, EnumC0772Rb> map2) {
        map.put(this.A00, this.A01);
    }
}
