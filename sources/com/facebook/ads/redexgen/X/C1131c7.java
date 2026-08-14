package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1131c7 implements InterfaceC02314s {
    public final /* synthetic */ F9 A00;

    public C1131c7(F9 f9) {
        this.A00 = f9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02314s
    public final void ADL(AbstractC02244l abstractC02244l, C4O c4o, C4O c4o2) {
        this.A00.A1n(abstractC02244l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02314s
    public final void ADN(AbstractC02244l abstractC02244l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        this.A00.A0r.A0c(abstractC02244l);
        this.A00.A1o(abstractC02244l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02314s
    public final void ADP(AbstractC02244l abstractC02244l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        abstractC02244l.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC02244l, abstractC02244l, c4o, c4o2)) {
                this.A00.A1N();
            }
        } else {
            if (!this.A00.A05.A0G(abstractC02244l, c4o, c4o2)) {
                return;
            }
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02314s
    public final void AFJ(AbstractC02244l abstractC02244l) {
        this.A00.A06.A1D(abstractC02244l.A0H, this.A00.A0r);
    }
}
