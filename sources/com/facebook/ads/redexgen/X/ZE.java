package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZE implements InterfaceC02856v {
    public final /* synthetic */ C0970Yv A00;

    public ZE(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A05 != null) {
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(this.A00.A05.length, this.A00.A03.A0U());
            for (int i = 0; i < iMin; i++) {
                arrayList.add(this.A00.A05[i].name);
            }
            Collections.sort(arrayList);
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
