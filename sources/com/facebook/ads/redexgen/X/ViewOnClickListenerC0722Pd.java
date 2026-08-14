package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0722Pd implements View.OnClickListener {
    public final /* synthetic */ C0725Pg A00;

    public ViewOnClickListenerC0722Pd(C0725Pg c0725Pg) {
        this.A00 = c0725Pg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A02.ACT(this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
