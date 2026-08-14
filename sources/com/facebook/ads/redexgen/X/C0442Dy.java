package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0442Dy {
    public final int A00;
    public final long A01;

    public C0442Dy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0442Dy A00(InterfaceC0408Cd interfaceC0408Cd, C0551Ij c0551Ij) throws InterruptedException, IOException {
        interfaceC0408Cd.AD7(c0551Ij.A00, 0, 8);
        c0551Ij.A0Y(0);
        int id = c0551Ij.A08();
        return new C0442Dy(id, c0551Ij.A0K());
    }
}
