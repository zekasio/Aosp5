package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0378Ax {
    public final long A00;
    public final long A01;
    public static final C0378Ax A04 = new C0378Ax(0, 0);
    public static final C0378Ax A02 = new C0378Ax(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C0378Ax A06 = new C0378Ax(Long.MAX_VALUE, 0);
    public static final C0378Ax A05 = new C0378Ax(0, Long.MAX_VALUE);
    public static final C0378Ax A03 = A04;

    public C0378Ax(long j, long j2) {
        IK.A03(j >= 0);
        IK.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0378Ax c0378Ax = (C0378Ax) obj;
        return this.A01 == c0378Ax.A01 && this.A00 == c0378Ax.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
