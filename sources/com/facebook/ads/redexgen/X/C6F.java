package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6F {
    public final List<C6E> A00 = new ArrayList();

    public final void A00(C6E c6e) {
        this.A00.add(c6e);
    }

    public final void A01(EnumC02866w enumC02866w) {
        Iterator<C6E> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().AFL(enumC02866w);
        }
    }
}
