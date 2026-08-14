package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OR implements View.OnClickListener {
    public final /* synthetic */ OU A00;

    public OR(OU ou) {
        this.A00 = ou;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A04.ABP();
            View v = this.A00.A00;
            if (v != null) {
                View v2 = this.A00.A00;
                MS.A0L(v2);
            }
            for (View v3 : this.A00.A06) {
                MS.A0N(v3, 0);
            }
            MS.A0J(this.A00);
            if (this.A00.A05 == null) {
                return;
            }
            MS.A0N(this.A00.A05, 0);
            this.A00.A05.A0b(Q6.A02, 14);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
