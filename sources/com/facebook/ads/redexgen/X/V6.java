package com.facebook.ads.redexgen.X;

import android.content.Context;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V6 implements InterfaceC0521Hd {
    public final Context A00;
    public final InterfaceC0521Hd A01;
    public final I0<? super InterfaceC0522He> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public V6(Context context, I0<? super InterfaceC0522He> i0, InterfaceC0521Hd interfaceC0521Hd) {
        this.A00 = context.getApplicationContext();
        this.A02 = i0;
        this.A01 = interfaceC0521Hd;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public V6(Context context, String str, I0<? super InterfaceC0522He> i0) {
        this(context, i0, new C2N(str, i0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0521Hd
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V7 A4E() {
        return new V7(this.A00, this.A02, this.A01.A4E());
    }
}
