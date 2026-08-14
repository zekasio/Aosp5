package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W6 implements InterfaceC0426Di {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0417Co A03;
    public boolean A04;
    public final C0551Ij A05 = new C0551Ij(10);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{Ascii.EM, 62, 72, 56, 54, 71, 57, 62, 67, 60, -11, 62, 67, 75, 54, 65, 62, 57, -11, Ascii.RS, Ascii.EM, 8, -11, 73, 54, 60, -16, Ascii.VT, -38, -7, Ascii.FF, 8, Ascii.VT, Ascii.FF, Ascii.EM, 89, 104, 104, 100, 97, 91, 89, 108, 97, 103, 102, 39, 97, 92, 43};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) {
        if (!this.A04) {
            return;
        }
        int iA04 = c0551Ij.A04();
        int i = this.A00;
        if (i < 10) {
            int iMin = Math.min(iA04, 10 - i);
            System.arraycopy(c0551Ij.A00, c0551Ij.A06(), this.A05.A00, this.A00, iMin);
            if (this.A00 + iMin == 10) {
                this.A05.A0Y(0);
                if (73 != this.A05.A0E() || 68 != this.A05.A0E() || 51 != this.A05.A0E()) {
                    Log.w(A00(26, 9, 44), A00(0, 26, 90));
                    this.A04 = false;
                    return;
                } else {
                    this.A05.A0Z(3);
                    this.A01 = this.A05.A0D() + 10;
                }
            }
        }
        int iMin2 = Math.min(iA04, this.A01 - this.A00);
        this.A03.AEG(c0551Ij, iMin2);
        this.A00 += iMin2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A03 = interfaceC0409Ce.AFD(c0440Dw.A03(), 4);
        this.A03.A5V(Format.A0B(c0440Dw.A04(), A00(35, 15, 125), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
        int i;
        if (!this.A04 || (i = this.A01) == 0 || this.A00 != i) {
            return;
        }
        this.A03.AEH(this.A02, 1, i, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        this.A04 = false;
    }
}
