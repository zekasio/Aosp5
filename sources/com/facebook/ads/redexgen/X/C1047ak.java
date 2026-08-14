package com.facebook.ads.redexgen.X;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1047ak implements InterfaceC02856v {
    public final /* synthetic */ C1035aY A00;

    public C1047ak(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A06(new File(this.A00.A00.getApplicationInfo().publicSourceDir).length());
    }
}
