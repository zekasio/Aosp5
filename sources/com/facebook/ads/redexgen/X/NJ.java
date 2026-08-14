package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NJ implements View.OnClickListener {
    public final /* synthetic */ NM A00;

    public NJ(NM nm) {
        this.A00 = nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A42();
            } else {
                this.A00.A04.A43();
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
