package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0821Sy implements OF {
    public final WeakReference<AB> A00;

    public C0821Sy(AB ab) {
        this.A00 = new WeakReference<>(ab);
    }

    public /* synthetic */ C0821Sy(AB ab, AH ah) {
        this(ab);
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z) {
        AB ab = this.A00.get();
        if (ab != null) {
            ab.A04 = z;
            ab.A02();
        }
    }
}
