package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0923Xa implements C8Y {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ XZ A01;

    public C0923Xa(XZ xz, AdvertisingId advertisingId) {
        this.A01 = xz;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final boolean A8Y() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final String getId() {
        return this.A00.getId();
    }
}
