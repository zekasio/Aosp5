package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0811So implements O0 {
    public final /* synthetic */ C0809Sm A00;

    public C0811So(C0809Sm c0809Sm) {
        this.A00 = c0809Sm;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABg(String str) {
        this.A00.A0I = false;
        this.A00.A0C.setProgress(100);
        MS.A0N(this.A00.A0C, 8);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABi(String str) {
        this.A00.A0I = true;
        MS.A0N(this.A00.A0C, 0);
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABz(int i) {
        if (this.A00.A0I) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC4(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    @RequiresApi(api = 26)
    public final void AC6() {
        this.A00.A0E.A09().AAF(14);
    }
}
