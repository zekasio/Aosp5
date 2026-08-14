package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1096bX implements C7M {
    public final List<C1217da> A00;
    public final /* synthetic */ C1095bW A01;

    public C1096bX(C1095bW c1095bW, List<C1217da> list) {
        this.A01 = c1095bW;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C1217da> it = this.A00.iterator();
        while (it.hasNext()) {
            UB ub = new UB(this.A01.A01, it.next(), null, UB.A0K(), this.A01.A00.A01());
            C1217da nativeAdapter = ub.A0y();
            if (nativeAdapter != null) {
                C1217da nativeAdapter2 = ub.A0y();
                if (nativeAdapter2.A0F() != null) {
                    C1217da nativeAdapter3 = ub.A0y();
                    ((AbstractC1179cx) nativeAdapter3.A0F()).A00(ub);
                }
            }
            this.A01.A00.A04(new NativeAd(this.A01.A01, ub));
        }
        C0616Kz.A00(new C1097bY(this));
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A00();
    }
}
