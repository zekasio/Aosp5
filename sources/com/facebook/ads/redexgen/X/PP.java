package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PP {

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public final C1I A04;
    public final C1U A05;
    public final C0947Xy A06;
    public C1K A01 = C1K.A01(null);
    public int A00 = 1000;

    public PP(C0947Xy c0947Xy, C1I c1i, C1U c1u) {
        this.A06 = c0947Xy;
        this.A04 = c1i;
        this.A05 = c1u;
    }

    public final PP A07(int i) {
        this.A00 = i;
        return this;
    }

    public final PP A08(C1K c1k) {
        this.A01 = c1k;
        return this;
    }

    public final PP A09(String str) {
        this.A02 = str;
        return this;
    }

    public final PP A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final PR A0B() {
        return new PR(this, null);
    }
}
