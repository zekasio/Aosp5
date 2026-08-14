package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0969Yu implements InterfaceC02856v {
    public final /* synthetic */ C0966Yr A00;

    public C0969Yu(C0966Yr c0966Yr) {
        this.A00 = c0966Yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A00 != null && Build.VERSION.SDK_INT >= 7) {
            C0966Yr c0966Yr = this.A00;
            return c0966Yr.A0F(c0966Yr.A04());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
