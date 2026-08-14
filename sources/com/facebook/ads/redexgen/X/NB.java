package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NB implements View.OnClickListener {
    public final /* synthetic */ TM A00;

    public NB(TM tm) {
        this.A00 = tm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A06.AAo();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
