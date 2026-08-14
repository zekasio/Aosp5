package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1204dN {
    public final C0947Xy A00;
    public final K7 A01;

    public FX(C0947Xy c0947Xy, C1A c1a, List<UB> list, @Nullable K7 k7) {
        super(c1a, list, c0947Xy);
        this.A00 = c0947Xy;
        this.A01 = k7 == null ? new K7() : k7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0824Tc A06(ViewGroup viewGroup, int i) {
        return new C0824Tc(new C0659Ms(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1204dN, com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A0H */
    public final void A0E(C0824Tc c0824Tc, int i) {
        super.A0E(c0824Tc, i);
        C0659Ms c0659Ms = (C0659Ms) c0824Tc.A0l();
        A0F(c0659Ms.getImageCardView(), i);
        if (((AbstractC1204dN) this).A01.get(i) != null) {
            c0659Ms.setTitle(((AbstractC1204dN) this).A01.get(i).getAdHeadline());
            c0659Ms.setSubtitle(((AbstractC1204dN) this).A01.get(i).getAdLinkDescription());
            c0659Ms.setButtonText(((AbstractC1204dN) this).A01.get(i).getAdCallToAction());
        }
        UB ub = ((AbstractC1204dN) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0659Ms);
        ub.A1O(c0659Ms, c0659Ms, arrayList);
    }
}
