package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0968Yt implements InterfaceC02856v {
    public final /* synthetic */ C0966Yr A00;

    public C0968Yt(C0966Yr c0966Yr) {
        this.A00 = c0966Yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.A00.A00 != null) {
                C0966Yr c0966Yr = this.A00;
                return c0966Yr.A0F(c0966Yr.A00.isDeviceIdleMode());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
