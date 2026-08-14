package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.loopj.android.http.AsyncHttpClient;
import com.vungle.warren.AdLoader;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VF implements HP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final HZ A06;
    public final IN A07;

    public VF(HZ hz) {
        this(hz, AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT, 25000, 25000, 0.75f, 0.75f, AdLoader.RETRY_DELAY, IN.A00);
    }

    public VF(HZ hz, int i, int i2, int i3, float f, float f2, long j, IN in) {
        this.A06 = hz;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = in;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HP
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0393Bn A4U(TrackGroup trackGroup, int... iArr) {
        return new C0393Bn(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
