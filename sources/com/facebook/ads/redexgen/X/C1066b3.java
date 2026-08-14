package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1066b3 implements InterfaceC02856v {
    public final /* synthetic */ C1056at A00;

    public C1066b3(C1056at c1056at) {
        this.A00 = c1056at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.A00.A02 != null) {
                C1056at c1056at = this.A00;
                return c1056at.A04(c1056at.A02.getLockTaskModeState());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
