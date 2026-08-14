package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02555q {
    public final long A00;
    public final EnumC02545p A01;
    public final String A02;
    public final boolean A03;

    public C02555q(String str, boolean z, EnumC02545p enumC02545p) {
        this(str, z, enumC02545p, System.currentTimeMillis());
    }

    public C02555q(String str, boolean z, EnumC02545p enumC02545p, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC02545p;
        this.A00 = j;
    }

    public static C02555q A00() {
        return new C02555q("", true, EnumC02545p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC02545p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
