package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class cV<K, V> extends AbstractC01672d<K, V> {
    public final /* synthetic */ C1151cU A00;

    public cV(C1151cU c1151cU) {
        this.A00 = c1151cU;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final int A04() {
        return ((C01702g) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final Object A07(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final V A08(int i, V v) {
        V value = this.A00.A0C(i, v);
        return value;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01672d
    public final void A0F(K k, V v) {
        this.A00.put(k, v);
    }
}
