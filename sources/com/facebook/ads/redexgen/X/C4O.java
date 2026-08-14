package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4O {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C4O A00(AbstractC02244l abstractC02244l, int i) {
        View view = abstractC02244l.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C4O A01(AbstractC02244l abstractC02244l) {
        return A00(abstractC02244l, 0);
    }
}
