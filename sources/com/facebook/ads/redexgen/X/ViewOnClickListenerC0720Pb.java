package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0720Pb implements View.OnClickListener {
    public final /* synthetic */ C0721Pc A00;

    public ViewOnClickListenerC0720Pb(C0721Pc c0721Pc) {
        this.A00 = c0721Pc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A05.performClick();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
