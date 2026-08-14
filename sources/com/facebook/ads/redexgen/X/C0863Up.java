package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0863Up implements InterfaceC0521Hd {
    public final int A00;

    @Nullable
    public final InterfaceC0519Hb A01;
    public final InterfaceC0521Hd A02;
    public final InterfaceC0521Hd A03;
    public final I4 A04;

    @Nullable
    public final I6 A05;

    public C0863Up(I4 i4, InterfaceC0521Hd interfaceC0521Hd, InterfaceC0521Hd interfaceC0521Hd2, InterfaceC0519Hb interfaceC0519Hb, int i, I6 i6) {
        this.A04 = i4;
        this.A03 = interfaceC0521Hd;
        this.A02 = interfaceC0521Hd2;
        this.A01 = interfaceC0519Hb;
        this.A00 = i;
        this.A05 = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0521Hd
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0864Uq A4E() {
        I4 i4 = this.A04;
        InterfaceC0522He interfaceC0522HeA4E = this.A03.A4E();
        InterfaceC0522He interfaceC0522HeA4E2 = this.A02.A4E();
        InterfaceC0519Hb interfaceC0519Hb = this.A01;
        return new C0864Uq(i4, interfaceC0522HeA4E, interfaceC0522HeA4E2, interfaceC0519Hb != null ? interfaceC0519Hb.createDataSink() : null, this.A00, this.A05);
    }
}
