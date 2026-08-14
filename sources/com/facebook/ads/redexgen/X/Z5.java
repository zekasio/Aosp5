package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z5 implements InterfaceC02856v {
    public final /* synthetic */ C0970Yv A00;

    public Z5(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.A00.A02 != null) {
                C0970Yv c0970Yv = this.A00;
                return c0970Yv.A0F(c0970Yv.A02.canRequestPackageInstalls());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
