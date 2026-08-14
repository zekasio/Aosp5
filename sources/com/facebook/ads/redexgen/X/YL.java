package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YL implements InterfaceC02856v {
    public final /* synthetic */ YI A00;

    public YL(YI yi) {
        this.A00 = yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A06(C7J.A02(TrafficStats.getMobileTxBytes()));
    }
}
