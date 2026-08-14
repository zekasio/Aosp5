package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0379Az {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public G9 A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i) {
        return this.A05.A04[i].A00;
    }

    public final int A02(int i) {
        return this.A05.A04[i].A00();
    }

    public final int A03(int i, int i2) {
        return this.A05.A04[i].A01(i2);
    }

    public final int A04(long j) {
        return this.A05.A00(j);
    }

    public final int A05(long j) {
        return this.A05.A01(j);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AG.A01(this.A04);
    }

    public final long A09(int i) {
        return this.A05.A03[i];
    }

    public final long A0A(int i, int i2) {
        G7 g7 = this.A05.A04[i];
        if (g7.A00 != -1) {
            return g7.A02[i2];
        }
        return -9223372036854775807L;
    }

    public final C0379Az A0B(Object obj, Object obj2, int i, long j, long j2) {
        return A0C(obj, obj2, i, j, j2, G9.A06);
    }

    public final C0379Az A0C(Object obj, Object obj2, int i, long j, long j2, G9 g9) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = g9;
        return this;
    }

    public final boolean A0D(int i) {
        return !this.A05.A04[i].A02();
    }

    public final boolean A0E(int i, int i2) {
        G7 g7 = this.A05.A04[i];
        return (g7.A00 == -1 || g7.A01[i2] == 0) ? false : true;
    }
}
