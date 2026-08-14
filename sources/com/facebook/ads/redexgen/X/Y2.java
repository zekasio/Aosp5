package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y2 extends L8 {
    public final /* synthetic */ C7M A00;
    public final /* synthetic */ C7N A01;
    public final /* synthetic */ C7U A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public Y2(C7U c7u, ArrayList arrayList, C7M c7m, C7N c7n, ArrayList arrayList2) {
        this.A02 = c7u;
        this.A03 = arrayList;
        this.A00 = c7m;
        this.A01 = c7n;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AtomicBoolean atomicBooleanA0D = C7U.A0D(this.A03);
        if (this.A02.A04 instanceof C0947Xy) {
            C0947Xy c0947Xy = (C0947Xy) this.A02.A04;
            if (atomicBooleanA0D.get()) {
                c0947Xy.A0D().A3w(MJ.A01(this.A02.A00));
            } else {
                c0947Xy.A0D().A3v(MJ.A01(this.A02.A00));
            }
        }
        this.A02.A02.post(new Y3(this, atomicBooleanA0D));
        C7U.A0D(this.A04);
    }
}
