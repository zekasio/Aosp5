package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BG extends C1134cA {
    public final /* synthetic */ BF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BG(BF bf, C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A00 = bf;
    }

    @Override // com.facebook.ads.redexgen.X.C1134cA
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1134cA
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1134cA
    public final int A0O(View view, int left) {
        C4T c4tA08 = A08();
        if (!c4tA08.A24()) {
            return 0;
        }
        C4U c4u = (C4U) view.getLayoutParams();
        int start = c4tA08.A0k(view) - c4u.leftMargin;
        int end = c4tA08.A0n(view) + c4u.rightMargin;
        return A0N(start, end, c4tA08.A0e(), c4tA08.A0h() - c4tA08.A0f(), left) + this.A00.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C1134cA
    public final PointF A0P(int i) {
        return this.A00.A45(i);
    }
}
