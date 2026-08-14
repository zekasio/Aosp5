package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@RequiresApi(19)
public class C01160d extends C01441g {
    @Override // com.facebook.ads.redexgen.X.FI, com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A0C(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final boolean A0J(View view) {
        return view.isAttachedToWindow();
    }
}
