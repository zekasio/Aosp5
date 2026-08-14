package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0673Ng implements View.OnClickListener {
    public final /* synthetic */ TG A00;

    public ViewOnClickListenerC0673Ng(TG tg) {
        this.A00 = tg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A7t();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
