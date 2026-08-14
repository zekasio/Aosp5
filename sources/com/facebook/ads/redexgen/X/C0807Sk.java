package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0807Sk implements OF {
    public final WeakReference<A3> A00;

    public C0807Sk(A3 a3) {
        this.A00 = new WeakReference<>(a3);
    }

    public /* synthetic */ C0807Sk(A3 a3, A8 a8) {
        this(a3);
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z) {
        A3 a3 = this.A00.get();
        if (a3 != null) {
            a3.A06 = z;
            a3.A01();
        }
    }
}
