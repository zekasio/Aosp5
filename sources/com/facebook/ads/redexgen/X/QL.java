package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QL implements View.OnClickListener {
    public final /* synthetic */ KS A00;

    public QL(KS ks) {
        this.A00 = ks;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A02(EnumC0582Jo.A0d, null);
            this.A00.A02.A0D().A2z();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
