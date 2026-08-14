package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4Q {
    @Deprecated
    private final void A00(Rect rect, int i, F9 f9) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, F9 f9, C02214i c02214i) {
        A00(rect, ((C4U) view.getLayoutParams()).A00(), f9);
    }
}
