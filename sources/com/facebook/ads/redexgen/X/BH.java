package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BH implements UA {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public BH(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0589Jv
    public final void A9s() {
        C0616Kz.A00(new U6(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0589Jv
    public final void A9w() {
        C0616Kz.A00(new U7(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0589Jv
    public final void AAi(KH kh) {
        C0616Kz.A00(new U9(this, kh));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0589Jv
    public final void ABO() {
        C0616Kz.A00(new U5(this));
    }

    @Override // com.facebook.ads.redexgen.X.UA
    public final void ABT() {
        C0616Kz.A00(new U8(this));
    }
}
