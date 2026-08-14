package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SC implements InterfaceC0713Ou {
    public final /* synthetic */ SB A00;

    public SC(SB sb) {
        this.A00 = sb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0713Ou
    public final void ACm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0713Ou
    public final void ACo(View view) {
        AbstractC0808Sl abstractC0808Sl = (AbstractC0808Sl) view;
        abstractC0808Sl.A0g();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0808Sl.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
