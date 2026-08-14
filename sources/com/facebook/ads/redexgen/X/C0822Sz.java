package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0822Sz extends L8 {
    public final /* synthetic */ OQ A00;

    public C0822Sz(OQ oq) {
        this.A00 = oq;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    @RequiresApi(api = 16)
    public final void A06() {
        this.A00.setPressed(false);
        OQ oq = this.A00;
        oq.postOnAnimationDelayed(oq.A08, this.A00.A07);
    }
}
