package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0376Av {
    public static final C0376Av A01 = new C0376Av(0);
    public final int A00;

    public C0376Av(int i) {
        this.A00 = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C0376Av) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }
}
