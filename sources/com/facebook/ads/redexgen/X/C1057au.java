package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1057au implements InterfaceC02856v {
    public final /* synthetic */ C1056at A00;

    public C1057au(C1056at c1056at) {
        this.A00 = c1056at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A02 != null) {
            return this.A00.A0F(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
