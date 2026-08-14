package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0994Zt implements InterfaceC02856v {
    public final /* synthetic */ C0982Zh A00;

    public C0994Zt(C0982Zh c0982Zh) {
        this.A00 = c0982Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A04(Build.VERSION.SDK_INT);
    }
}
