package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public abstract class AbstractC1265eS {

    @Nullable
    public InterfaceC1266eT A00;

    public final void A00() {
        InterfaceC1266eT interfaceC1266eT = this.A00;
        if (interfaceC1266eT != null) {
            interfaceC1266eT.onStart();
        }
    }

    public final void A01() {
        InterfaceC1266eT interfaceC1266eT = this.A00;
        if (interfaceC1266eT != null) {
            interfaceC1266eT.onStop();
        }
    }

    public final void A02(InterfaceC1266eT interfaceC1266eT) {
        this.A00 = interfaceC1266eT;
    }
}
