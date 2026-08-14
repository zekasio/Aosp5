package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0647Mg {

    @Nullable
    public static C0647Mg A02;
    public final C0829Th A00;
    public final C0649Mi A01;

    public C0647Mg(C0947Xy c0947Xy, Executor executor, C9H c9h) {
        this.A01 = new C0649Mi(c0947Xy);
        this.A00 = new C0829Th(executor, c9h, c0947Xy);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C0947Xy c0947Xy, Executor executor, C9H c9h) {
        if (!JR.A10(c0947Xy)) {
            return;
        }
        C0647Mg c0647Mg = A02;
        if (c0647Mg == null) {
            A02 = new C0647Mg(c0947Xy, executor, c9h);
            A02.A00();
        } else {
            c0647Mg.A02(c9h);
        }
    }

    private void A02(C9H c9h) {
        this.A00.A07(c9h);
    }
}
