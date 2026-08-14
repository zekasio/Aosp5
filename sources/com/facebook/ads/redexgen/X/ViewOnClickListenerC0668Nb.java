package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0668Nb implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ NR A01;
    public final /* synthetic */ TH A02;

    public ViewOnClickListenerC0668Nb(TH th, NR nr, C2H c2h) {
        this.A02 = th;
        this.A01 = nr;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ABf(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
