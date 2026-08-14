package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1207dQ implements InterfaceC01250n {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0D();

    public abstract AnonymousClass18 A0E();

    public abstract boolean A0F();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01250n
    public final AdPlacementType A7B() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
