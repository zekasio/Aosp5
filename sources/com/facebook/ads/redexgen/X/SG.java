package com.facebook.ads.redexgen.X;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public final class SG {
    public long A01;
    public long A02;
    public long A03;

    @Nullable
    public String A04;
    public final int A05 = 100;
    public long A00 = -1;

    public SG(@Nullable String str, long j, long j2, long j3) {
        this.A04 = str;
        this.A03 = j * 100;
        this.A01 = j2 * 100;
        this.A02 = 100 * j3;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final long A03() {
        return this.A03;
    }

    public final List<String> A04() {
        return Arrays.asList(Long.toString(this.A03), Long.toString(this.A01), Long.toString(this.A02));
    }

    public final void A05(long j) {
        this.A00 = j;
    }

    public final void A06(long j) {
        this.A01 = j;
    }

    public final void A07(long j) {
        this.A02 = j;
    }

    public final void A08(long j) {
        this.A03 = j;
    }
}
