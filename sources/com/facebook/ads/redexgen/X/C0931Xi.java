package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0931Xi implements InterfaceC0615Ky {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0615Ky
    public final void AE0(Throwable th, Object obj) {
        if (obj instanceof C8S) {
            C0947Xy c0947XyA5b = ((C8S) obj).A5b();
            if (c0947XyA5b != null) {
                c0947XyA5b.A0H(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C0947Xy)) {
            return;
        }
        ((C0947Xy) context).A0H(th);
    }
}
