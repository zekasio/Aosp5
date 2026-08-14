package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02826s {
    public final int A00;
    public final InterfaceC02856v A01;
    public final EnumSet<EnumC02896z> A02;

    public C02826s(int i, EnumSet<EnumC02896z> enumSet, InterfaceC02856v interfaceC02856v) {
        this.A00 = i;
        this.A02 = enumSet;
        this.A01 = interfaceC02856v;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC02856v A01() {
        if (this.A02.contains(EnumC02896z.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC02856v A02(EnumC02866w enumC02866w) {
        if (A04(enumC02866w)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC02896z> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC02866w enumC02866w) {
        return C7J.A0E(enumC02866w) && this.A02.contains(EnumC02896z.A00(enumC02866w.A03()));
    }
}
