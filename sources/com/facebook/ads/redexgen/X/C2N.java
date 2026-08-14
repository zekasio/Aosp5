package com.facebook.ads.redexgen.X;

import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2N extends BJ {
    public final int A00;
    public final int A01;
    public final I0<? super InterfaceC0522He> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, I0<? super InterfaceC0522He> i0) {
        this(str, i0, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, I0<? super InterfaceC0522He> i0, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = i0;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.BJ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0380Ba A01(C0531Hp c0531Hp) {
        return new C0380Ba(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0531Hp);
    }
}
