package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1069b6 extends AbstractC02726i {
    public final List<C02826s> A00;

    public C1069b6(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final List<C02826s> A02() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A03(C02826s c02826s) {
        if (c02826s.A03().contains(EnumC02896z.A0B)) {
            this.A00.add(c02826s);
        }
    }

    public final void A04(EnumC02866w enumC02866w) {
        A01(enumC02866w, this.A00);
    }
}
