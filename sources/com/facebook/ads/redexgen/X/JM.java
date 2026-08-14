package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JM {

    @Nullable
    public final Handler A00;

    @Nullable
    public final JN A01;

    public JM(@Nullable Handler handler, @Nullable JN jn) {
        this.A00 = jn != null ? (Handler) IK.A01(handler) : null;
        this.A01 = jn;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new JJ(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new JI(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new JK(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new JH(this, format));
        }
    }

    public final void A05(C0402Bw c0402Bw) {
        if (this.A01 != null) {
            this.A00.post(new JL(this, c0402Bw));
        }
    }

    public final void A06(C0402Bw c0402Bw) {
        if (this.A01 != null) {
            this.A00.post(new JF(this, c0402Bw));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new JG(this, str, j, j2));
        }
    }
}
