package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0854Ug implements InterfaceC1270eX<JX, C0570Jc> {
    public C0851Ud A00;

    public C0854Ug(C0851Ud c0851Ud) {
        this.A00 = c0851Ud;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1270eX
    public final void A5I(C1267eU<JX, C0570Jc> c1267eU, InterfaceC1256eJ interfaceC1256eJ) {
        int i = JV.A00[interfaceC1256eJ.A7o(c1267eU).ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.A00.A02(c1267eU, interfaceC1256eJ);
    }
}
