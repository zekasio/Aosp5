package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0696Od {
    public static final int A00 = MS.A00();

    public static void A00(C0947Xy c0947Xy, ViewGroup viewGroup, String str) {
        new T3(viewGroup, c0947Xy).A07(str);
        View view = new View(c0947Xy);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        MS.A0R(view, c0947Xy);
        viewGroup.addView(view, 0);
    }
}
