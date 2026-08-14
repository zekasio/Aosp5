package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0670Nd implements View.OnClickListener {
    public final /* synthetic */ C0672Nf A00;

    public ViewOnClickListenerC0670Nd(C0672Nf c0672Nf) {
        this.A00 = c0672Nf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A7t();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
