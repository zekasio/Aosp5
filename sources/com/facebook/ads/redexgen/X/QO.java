package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QO implements View.OnClickListener {
    public final /* synthetic */ C02796p A00;

    public QO(C02796p c02796p) {
        this.A00 = c02796p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            View v = this.A00.getVideoView();
            if (v != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A02(EnumC0582Jo.A0p, null);
                }
                this.A00.A01.A0D().A2t();
                int i = QP.A00[this.A00.getVideoView().getState().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    this.A00.getVideoView().A0b(Q6.A04, 12);
                } else if (i == 5) {
                    this.A00.getVideoView().A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
