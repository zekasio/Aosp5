package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S9 extends C4H<S3> {
    public int A00;
    public int A01;
    public int A02;

    @Nullable
    public InterfaceC0657Mq A03;
    public String A04;
    public List<C0719Pa> A05;
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final AnonymousClass18 A07;
    public final C7U A08;
    public final C0947Xy A09;
    public final InterfaceC0575Jh A0A;
    public final MK A0B;
    public final SB A0C;
    public final C0565Ix A0D;
    public final C0767Qw A0E;

    public S9(C0947Xy c0947Xy, List<C0719Pa> list, AnonymousClass18 anonymousClass18, InterfaceC0575Jh interfaceC0575Jh, C7U c7u, C0767Qw c0767Qw, MK mk, InterfaceC0657Mq interfaceC0657Mq, String str, SB sb, C0565Ix c0565Ix) {
        this.A09 = c0947Xy;
        this.A0A = interfaceC0575Jh;
        this.A08 = c7u;
        this.A0E = c0767Qw;
        this.A0B = mk;
        this.A03 = interfaceC0657Mq;
        this.A07 = anonymousClass18;
        this.A05 = list;
        this.A04 = str;
        this.A0C = sb;
        this.A0D = c0565Ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    @Nullable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final S3 A06(ViewGroup viewGroup, int i) {
        InterfaceC0657Mq interfaceC0657Mq = this.A03;
        if (interfaceC0657Mq == null || this.A00 == 0) {
            return null;
        }
        return new S3(OO.A01(new C0701Oi(this.A09, this.A0A, interfaceC0657Mq, this.A07, null, this.A0E, this.A0B).A0I(this.A0D).A0J(), this.A04, this.A0C), this.A06, this.A0E, this.A05.size(), this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(S3 s3, int i) {
        s3.A0l(this.A05.get(i), this.A0A, this.A08, this.A0B, this.A04, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A05.size();
    }

    public final void A0F(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
