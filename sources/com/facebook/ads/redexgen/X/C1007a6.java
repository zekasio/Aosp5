package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1007a6 implements InterfaceC02856v {
    public final /* synthetic */ C0982Zh A00;

    public C1007a6(C0982Zh c0982Zh) {
        this.A00 = c0982Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A08(Build.MANUFACTURER);
    }
}
