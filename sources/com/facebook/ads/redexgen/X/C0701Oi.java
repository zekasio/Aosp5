package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0701Oi {

    @Nullable
    public View A02;

    @Nullable
    public UB A03;

    @Nullable
    public AbstractC0656Mp A04;

    @Nullable
    public C0565Ix A05;

    @Nullable
    public final View A06;
    public final AnonymousClass18 A07;
    public final C0947Xy A08;
    public final InterfaceC0575Jh A09;
    public final MK A0A;
    public final InterfaceC0657Mq A0B;
    public final C0767Qw A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C0701Oi(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq, AnonymousClass18 anonymousClass18, @Nullable View view, C0767Qw c0767Qw, MK mk) {
        this.A08 = c0947Xy;
        this.A09 = interfaceC0575Jh;
        this.A0B = interfaceC0657Mq;
        this.A07 = anonymousClass18;
        this.A06 = view;
        this.A0C = c0767Qw;
        this.A0A = mk;
    }

    public final C0701Oi A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C0701Oi A0E(int i) {
        this.A01 = i;
        return this;
    }

    public final C0701Oi A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C0701Oi A0G(UB ub) {
        this.A03 = ub;
        return this;
    }

    public final C0701Oi A0H(AbstractC0656Mp abstractC0656Mp) {
        this.A04 = abstractC0656Mp;
        return this;
    }

    public final C0701Oi A0I(C0565Ix c0565Ix) {
        this.A05 = c0565Ix;
        return this;
    }

    public final C0702Oj A0J() {
        return new C0702Oj(this);
    }
}
