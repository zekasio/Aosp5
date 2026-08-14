package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RA {
    public int A00;
    public int A01;
    public int A02;
    public R0 A03;
    public Map<String, String> A04;
    public final int A05;
    public final int A06;

    public RA(int i, int i2, int i3, int i4, int i5, Map<String, String> requestHeaders, R0 r0) {
        this.A06 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = i4;
        this.A01 = i5;
        this.A04 = requestHeaders;
        this.A03 = r0;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A05;
    }

    public final int A04() {
        return this.A06;
    }

    public final R0 A05() {
        return this.A03;
    }

    public final Map<String, String> A06() {
        return this.A04;
    }
}
