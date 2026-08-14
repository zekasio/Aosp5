package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T7 extends L8 {
    public final WeakReference<C0767Qw> A00;

    public T7(C0767Qw c0767Qw) {
        this.A00 = new WeakReference<>(c0767Qw);
    }

    public T7(WeakReference<C0767Qw> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C0767Qw c0767Qw = this.A00.get();
        if (c0767Qw != null) {
            c0767Qw.A0U();
        }
    }
}
