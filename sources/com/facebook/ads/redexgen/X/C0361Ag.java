package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0361Ag {
    public final int A00;
    public final long A01;
    public final long A02;
    public final B1 A03;
    public final FY A04;
    public final TrackGroupArray A05;
    public final HU A06;

    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C0361Ag(B1 b1, long j, TrackGroupArray trackGroupArray, HU hu) {
        this(b1, null, new FY(0), j, -9223372036854775807L, 1, false, trackGroupArray, hu);
    }

    public C0361Ag(B1 b1, @Nullable Object obj, FY fy, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, HU hu) {
        this.A03 = b1;
        this.A07 = obj;
        this.A04 = fy;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = hu;
    }

    public static void A00(C0361Ag c0361Ag, C0361Ag c0361Ag2) {
        c0361Ag2.A0A = c0361Ag.A0A;
        c0361Ag2.A09 = c0361Ag.A09;
    }

    public final C0361Ag A01(int i) {
        C0361Ag c0361Ag = new C0361Ag(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c0361Ag);
        return c0361Ag;
    }

    public final C0361Ag A02(int i) {
        C0361Ag c0361Ag = new C0361Ag(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, c0361Ag);
        return c0361Ag;
    }

    public final C0361Ag A03(B1 b1, Object obj) {
        C0361Ag c0361Ag = new C0361Ag(b1, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c0361Ag);
        return c0361Ag;
    }

    public final C0361Ag A04(FY fy, long j, long j2) {
        long j3 = j2;
        B1 b1 = this.A03;
        Object obj = this.A07;
        if (!fy.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C0361Ag(b1, obj, fy, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C0361Ag A05(TrackGroupArray trackGroupArray, HU hu) {
        C0361Ag c0361Ag = new C0361Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, hu);
        A00(this, c0361Ag);
        return c0361Ag;
    }

    public final C0361Ag A06(boolean z) {
        C0361Ag c0361Ag = new C0361Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, c0361Ag);
        return c0361Ag;
    }
}
