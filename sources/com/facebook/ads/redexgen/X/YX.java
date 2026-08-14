package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YX implements InterfaceC02856v {
    public final /* synthetic */ YR A00;

    public YX(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.A00.A00 != null) {
                YR yr = this.A00;
                return yr.A04(yr.A00.getPhoneCount());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
