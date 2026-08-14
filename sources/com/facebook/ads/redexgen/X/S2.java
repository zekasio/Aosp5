package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S2 extends C4H<C0793Rw> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    @Nullable
    public InterfaceC0657Mq A04;
    public String A05;
    public List<C0719Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C0947Xy A0A;
    public final InterfaceC0575Jh A0B;
    public final MK A0C;
    public final SB A0D;
    public final C0767Qw A0E;

    public S2(C0947Xy c0947Xy, List<C0719Pa> list, AnonymousClass18 anonymousClass18, InterfaceC0575Jh interfaceC0575Jh, C7U c7u, C0767Qw c0767Qw, MK mk, InterfaceC0657Mq interfaceC0657Mq, String str, int i, int i2, int i3, int i4, SB sb) {
        this.A0A = c0947Xy;
        this.A0B = interfaceC0575Jh;
        this.A09 = c7u;
        this.A0E = c0767Qw;
        this.A0C = mk;
        this.A04 = interfaceC0657Mq;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A05 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0D = sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0793Rw A06(ViewGroup viewGroup, int i) {
        return new C0793Rw(C0715Ow.A00(new C0701Oi(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0793Rw c0793Rw, int i) {
        c0793Rw.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }
}
