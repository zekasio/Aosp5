package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZK implements InterfaceC02856v {
    public final /* synthetic */ ZI A00;

    public ZK(ZI zi) {
        this.A00 = zi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(Locale.getDefault().getScript());
    }
}
