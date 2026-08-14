package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UO implements InterfaceC0592Jy {
    public WeakReference<UB> A00;

    public UO(UB ub) {
        this.A00 = new WeakReference<>(ub);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0592Jy
    public final void ABk(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z, false);
        }
    }
}
