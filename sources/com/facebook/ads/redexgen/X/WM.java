package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WM implements InterfaceC0407Cc {
    public static byte[] A03;
    public static final InterfaceC0410Cf A04;
    public InterfaceC0409Ce A00;
    public DY A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new WN();
    }

    public static C0551Ij A00(C0551Ij c0551Ij) {
        c0551Ij.A0Y(0);
        return c0551Ij;
    }

    private boolean A03(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        DU du = new DU();
        if (!du.A03(interfaceC0408Cd, true) || (du.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(du.A00, 8);
        C0551Ij c0551Ij = new C0551Ij(length);
        interfaceC0408Cd.AD7(c0551Ij.A00, 0, length);
        C0551Ij scratch = A00(c0551Ij);
        if (WO.A04(scratch)) {
            this.A01 = new WO();
        } else {
            C0551Ij scratch2 = A00(c0551Ij);
            if (WJ.A06(scratch2)) {
                this.A01 = new WJ();
            } else {
                C0551Ij scratch3 = A00(c0551Ij);
                if (!WL.A04(scratch3)) {
                    return false;
                }
                this.A01 = new WL();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A00 = interfaceC0409Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final int ADX(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        if (this.A01 == null) {
            if (A03(interfaceC0408Cd)) {
                interfaceC0408Cd.AEB();
            } else {
                throw new C0360Af(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            InterfaceC0417Co interfaceC0417CoAFD = this.A00.AFD(0, 1);
            this.A00.A5D();
            this.A01.A06(this.A00, interfaceC0417CoAFD);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0408Cd, c0412Cj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        DY dy = this.A01;
        if (dy != null) {
            dy.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        try {
            return A03(interfaceC0408Cd);
        } catch (C0360Af unused) {
            return false;
        }
    }
}
