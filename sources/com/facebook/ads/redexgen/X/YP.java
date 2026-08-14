package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YP implements InterfaceC02856v {
    public final /* synthetic */ YN A00;

    public YP(YN yn) {
        this.A00 = yn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A03(TimeZone.getDefault().getRawOffset() / 1000.0f);
    }
}
