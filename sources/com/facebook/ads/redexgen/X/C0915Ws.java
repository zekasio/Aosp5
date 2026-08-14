package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0915Ws implements InterfaceC0417Co {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final void A5V(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final int AEF(InterfaceC0408Cd interfaceC0408Cd, int i, boolean z) throws InterruptedException, IOException {
        int iAEq = interfaceC0408Cd.AEq(i);
        if (iAEq == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return iAEq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final void AEG(C0551Ij c0551Ij, int i) {
        c0551Ij.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final void AEH(long j, int i, int i2, int i3, C0416Cn c0416Cn) {
    }
}
