package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0383Bd extends VE {
    public final int A00;

    @Nullable
    public final Object A01;

    public C0383Bd(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    public C0383Bd(TrackGroup trackGroup, int i, int i2, @Nullable Object obj) {
        super(trackGroup, i);
        this.A00 = i2;
        this.A01 = obj;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A7Q() {
        return 0;
    }
}
