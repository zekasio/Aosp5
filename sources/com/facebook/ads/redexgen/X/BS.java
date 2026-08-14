package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BS {

    @Nullable
    public final Handler A00;

    @Nullable
    public final BT A01;

    public BS(@Nullable Handler handler, @Nullable BT bt) {
        this.A00 = bt != null ? (Handler) IK.A01(handler) : null;
        this.A01 = bt;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new BR(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new BP(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new BO(this, format));
        }
    }

    public final void A04(C0402Bw c0402Bw) {
        if (this.A01 != null) {
            this.A00.post(new BQ(this, c0402Bw));
        }
    }

    public final void A05(C0402Bw c0402Bw) {
        if (this.A01 != null) {
            this.A00.post(new BM(this, c0402Bw));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new BN(this, str, j, j2));
        }
    }
}
