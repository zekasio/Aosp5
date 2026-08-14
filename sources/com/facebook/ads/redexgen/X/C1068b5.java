package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1068b5 extends AbstractC02726i {
    public final List<C02826s> A00;

    public C1068b5(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final void A02(C02826s c02826s) {
        if (!c02826s.A03().contains(EnumC02896z.A0B)) {
            this.A00.add(c02826s);
        }
    }

    public final void A03(EnumC02866w enumC02866w) {
        A01(enumC02866w, this.A00);
    }
}
