package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0792Rv extends C4H<C0790Rt> {
    public final int A00;
    public final C0947Xy A01;
    public final List<String> A02;

    public C0792Rv(C0947Xy c0947Xy, List<String> screenshotUrls, int i) {
        this.A02 = screenshotUrls;
        this.A00 = i;
        this.A01 = c0947Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0790Rt A06(ViewGroup viewGroup, int i) {
        return new C0790Rt(new C0791Ru(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0790Rt c0790Rt, int leftMargin) {
        int i;
        String str = this.A02.get(leftMargin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A00;
        int startSpacing = i2 * 4;
        if (leftMargin == 0) {
            i2 = startSpacing;
        }
        int startSpacing2 = A0D();
        if (leftMargin >= startSpacing2 - 1) {
            int startSpacing3 = this.A00;
            i = startSpacing3 * 4;
        } else {
            i = this.A00;
        }
        marginLayoutParams.setMargins(i2, 0, i, 0);
        c0790Rt.A0l().setLayoutParams(marginLayoutParams);
        c0790Rt.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A02.size();
    }
}
