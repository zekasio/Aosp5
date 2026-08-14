package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZO implements InterfaceC02856v {
    public final /* synthetic */ ZN A00;

    public ZO(ZN zn) {
        this.A00 = zn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 16) {
            if (this.A00.A00 == null) {
                return this.A00.A07(AnonymousClass76.A07);
            }
            ZN zn = this.A00;
            return zn.A0F(zn.A00.isKeyguardSecure());
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
