package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0845Tx extends C0605Kn {
    public final int A00;
    public final String A01;

    public C0845Tx(String str, int i, @Nullable C9H c9h) {
        super(EnumC0604Km.A03, c9h, null);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.C0605Kn
    @Nullable
    public final /* bridge */ /* synthetic */ C9H A00() {
        return super.A00();
    }

    public final int A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
