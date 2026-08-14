package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0605Kn {

    @Nullable
    public final C9H A00;
    public final EnumC0604Km A01;

    @Nullable
    public final String A02;

    public C0605Kn(EnumC0604Km enumC0604Km) {
        this(enumC0604Km, null, null);
    }

    public C0605Kn(EnumC0604Km enumC0604Km, @Nullable C9H c9h, @Nullable String str) {
        this.A01 = enumC0604Km;
        this.A00 = c9h;
        this.A02 = str;
    }

    @Nullable
    public C9H A00() {
        return this.A00;
    }

    public final EnumC0604Km A01() {
        return this.A01;
    }

    @Nullable
    public final String A02() {
        return this.A02;
    }
}
