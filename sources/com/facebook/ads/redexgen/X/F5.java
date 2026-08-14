package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F5 {
    public final InterfaceC0519Hb A00;
    public final InterfaceC0521Hd A01;
    public final InterfaceC0521Hd A02;
    public final I4 A03;
    public final C0555In A04;

    public F5(I4 i4, InterfaceC0521Hd interfaceC0521Hd) {
        this(i4, interfaceC0521Hd, null, null, null);
    }

    public F5(I4 i4, InterfaceC0521Hd interfaceC0521Hd, @Nullable InterfaceC0521Hd interfaceC0521Hd2, @Nullable InterfaceC0519Hb interfaceC0519Hb, @Nullable C0555In c0555In) {
        IK.A01(interfaceC0521Hd);
        this.A03 = i4;
        this.A02 = interfaceC0521Hd;
        this.A01 = interfaceC0521Hd2;
        this.A00 = interfaceC0519Hb;
        this.A04 = c0555In;
    }

    public final I4 A00() {
        return this.A03;
    }

    public final C0864Uq A01(boolean z) {
        InterfaceC0522He cacheReadDataSource;
        InterfaceC0520Hc c0865Ur;
        InterfaceC0521Hd interfaceC0521Hd = this.A01;
        if (interfaceC0521Hd != null) {
            cacheReadDataSource = interfaceC0521Hd.A4E();
        } else {
            cacheReadDataSource = new V3();
        }
        if (z) {
            return new C0864Uq(this.A03, V4.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC0519Hb interfaceC0519Hb = this.A00;
        if (interfaceC0519Hb != null) {
            c0865Ur = interfaceC0519Hb.createDataSink();
        } else {
            c0865Ur = new C0865Ur(this.A03, 2097152L);
        }
        InterfaceC0522He interfaceC0522HeA4E = this.A02.A4E();
        C0555In c0555In = this.A04;
        if (c0555In != null) {
            interfaceC0522HeA4E = new C0869Uv(interfaceC0522HeA4E, c0555In, -1000);
        }
        return new C0864Uq(this.A03, interfaceC0522HeA4E, cacheReadDataSource, c0865Ur, 1, null);
    }

    public final C0555In A02() {
        C0555In c0555In = this.A04;
        return c0555In != null ? c0555In : new C0555In();
    }
}
