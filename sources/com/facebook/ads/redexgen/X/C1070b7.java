package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1070b7 extends AbstractC02726i implements InterfaceC02676d {
    public C6S A00;
    public final C6C A01;
    public final Map<Integer, C02826s> A02;

    @SuppressLint({"UseSparseArrays"})
    public C1070b7(Context context, C6C c6c) {
        super(context, c6c);
        this.A02 = new HashMap();
        this.A01 = c6c;
    }

    public final void A02(C02826s c02826s) {
        this.A02.put(Integer.valueOf(c02826s.A00()), c02826s);
    }

    public final void A03(EnumC02866w enumC02866w, Context context) {
        this.A00 = C6S.A00(context, this.A01);
        this.A00.A04(this.A02, enumC02866w);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02676d
    public final void AD6() {
        C6S c6s = this.A00;
        if (c6s != null) {
            c6s.A03();
        }
    }
}
