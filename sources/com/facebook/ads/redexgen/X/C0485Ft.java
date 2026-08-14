package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0485Ft {

    @Nullable
    public C0485Ft A00;

    @Nullable
    public HV A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0485Ft(long j, int i) {
        this.A04 = j;
        this.A03 = ((long) i) + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final C0485Ft A01() {
        this.A01 = null;
        C0485Ft c0485Ft = this.A00;
        this.A00 = null;
        return c0485Ft;
    }

    public final void A02(HV hv, C0485Ft c0485Ft) {
        this.A01 = hv;
        this.A00 = c0485Ft;
        this.A02 = true;
    }
}
