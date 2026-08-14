package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0362Ah {
    public static final C0362Ah A04 = new C0362Ah(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C0362Ah(float f) {
        this(f, 1.0f, false);
    }

    public C0362Ah(float f, float f2, boolean z) {
        IK.A03(f > 0.0f);
        IK.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return ((long) this.A03) * j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0362Ah c0362Ah = (C0362Ah) obj;
        return this.A01 == c0362Ah.A01 && this.A00 == c0362Ah.A00 && this.A02 == c0362Ah.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
