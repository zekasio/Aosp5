package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1D implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C1W A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final C1D A0C(int i) {
        this.A00 = i;
        return this;
    }

    public final C1D A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final C1D A0E(int i) {
        this.A02 = i;
        return this;
    }

    public final C1D A0F(int i) {
        this.A03 = i;
        return this;
    }

    public final C1D A0G(int i) {
        this.A04 = i;
        return this;
    }

    public final C1D A0H(long j) {
        this.A05 = j;
        return this;
    }

    public final C1D A0I(@Nullable C1W c1w) {
        this.A06 = c1w;
        return this;
    }

    public final C1D A0J(String str) {
        this.A07 = str;
        return this;
    }

    public final C1D A0K(String str) {
        this.A08 = str;
        return this;
    }

    public final C1D A0L(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C1D A0M(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C1D A0N(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C1E A0O() {
        return new C1E(this);
    }
}
