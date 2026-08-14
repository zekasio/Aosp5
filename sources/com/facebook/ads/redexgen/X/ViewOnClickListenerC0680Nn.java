package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0680Nn implements View.OnClickListener {
    public final /* synthetic */ C0685Ns A00;

    public ViewOnClickListenerC0680Nn(C0685Ns c0685Ns) {
        this.A00 = c0685Ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A00.A04 == null) {
                return;
            }
            this.A00.A04.AAK();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
