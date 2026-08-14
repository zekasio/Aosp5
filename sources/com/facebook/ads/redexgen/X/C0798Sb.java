package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0798Sb extends FrameLayout implements InterfaceC0658Mr {
    public final InterfaceC0657Mq A00;
    public final PA A01;

    public C0798Sb(C0947Xy c0947Xy, InterfaceC0657Mq interfaceC0657Mq, PA pa) {
        super(c0947Xy);
        this.A01 = pa;
        this.A00 = interfaceC0657Mq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        PA.A0B().incrementAndGet();
        this.A01.A0V();
        MS.A0J(this.A01.A0O());
        addView(this.A01.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A00.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void ABj(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AC8(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void onDestroy() {
        this.A01.A0U();
        if (this.A01.A0N() != null) {
            this.A01.A0N().AAt();
        }
        PA.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC0657Mq interfaceC0657Mq) {
    }
}
