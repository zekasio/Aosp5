package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FR extends AbstractC1204dN {
    public final C0947Xy A00;

    public FR(C1A c1a, List<UB> list, C0947Xy c0947Xy) {
        super(c1a, list, c0947Xy);
        this.A00 = c0947Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0824Tc A06(ViewGroup viewGroup, int i) {
        return new C0824Tc(new C0663Mw(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1204dN, com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A0H */
    public final void A0E(C0824Tc c0824Tc, int i) {
        super.A0E(c0824Tc, i);
        C0663Mw c0663Mw = (C0663Mw) c0824Tc.A0l();
        N8 n8 = (N8) c0663Mw.getImageCardView();
        n8.setImageDrawable(null);
        A0F(n8, i);
        UB ub = ((AbstractC1204dN) this).A01.get(i);
        ub.A11().A0F(this.A00);
        ub.A1N(c0663Mw, c0663Mw);
    }
}
