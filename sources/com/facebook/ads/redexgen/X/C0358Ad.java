package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0358Ad {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final FY A04;
    public final boolean A05;
    public final boolean A06;

    public C0358Ad(FY fy, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A04 = fy;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = j3;
        this.A01 = j4;
        this.A06 = z;
        this.A05 = z2;
    }

    public final C0358Ad A00(int i) {
        return new C0358Ad(this.A04.A00(i), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C0358Ad A01(long j) {
        return new C0358Ad(this.A04, j, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
