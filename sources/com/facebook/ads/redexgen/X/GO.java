package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GO implements InterfaceC1271eY {
    public final List<InterfaceC1272eZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1271eY
    public final InterfaceC1272eZ A5Y(int i) {
        return this.A00.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1272eZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1271eY
    public final int size() {
        return this.A00.size();
    }
}
