package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V9 implements HW {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public HV[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final HV[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-69, -81, -2, Ascii.ETB, Ascii.SO, 33, Ascii.EM, Ascii.SO, Ascii.FF, Ascii.GS, Ascii.SO, Ascii.CR, -55, 10, Ascii.NAK, Ascii.NAK, Ascii.CAN, Ascii.FF, 10, Ascii.GS, Ascii.DC2, Ascii.CAN, Ascii.ETB, -29, -55};
    }

    public V9(boolean z, int i) {
        this(z, i, 0);
    }

    public V9(boolean z, int i, int i2) {
        IK.A03(i > 0);
        IK.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new HV[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new HV(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new HV[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean z = i < this.A02;
        this.A02 = i;
        if (z) {
            AFE();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized HV A3L() {
        HV hv;
        this.A00++;
        if (this.A01 > 0) {
            HV[] hvArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            hv = hvArr[i];
            this.A03[this.A01] = null;
        } else {
            hv = new HV(new byte[this.A04], 0);
        }
        return hv;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final int A6o() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ADn(HV hv) {
        this.A07[0] = hv;
        ADo(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void ADo(HV[] hvArr) {
        if (this.A01 + hvArr.length >= this.A03.length) {
            this.A03 = (HV[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + hvArr.length));
        }
        for (HV hv : hvArr) {
            if (hv.A01 != this.A06 && hv.A01.length != this.A04) {
                throw new IllegalArgumentException(A00(2, 23, 46) + System.identityHashCode(hv.A01) + A00(0, 2, 20) + System.identityHashCode(this.A06) + A00(0, 2, 20) + hv.A01.length + A00(0, 2, 20) + this.A04);
            }
            HV[] hvArr2 = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            hvArr2[i] = hv;
        }
        this.A00 -= hvArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final synchronized void AFE() {
        int lowIndex = Math.max(0, C0567Iz.A04(this.A02, this.A04) - this.A00);
        if (lowIndex >= this.A01) {
            return;
        }
        if (this.A06 != null) {
            int i = 0;
            int i2 = this.A01 - 1;
            while (i <= i2) {
                HV hv = this.A03[i];
                if (hv.A01 == this.A06) {
                    i++;
                } else {
                    HV hv2 = this.A03[i2];
                    if (hv2.A01 != this.A06) {
                        i2--;
                    } else {
                        int highIndex = i + 1;
                        this.A03[i] = hv2;
                        this.A03[i2] = hv;
                        i2--;
                        i = highIndex;
                    }
                }
            }
            lowIndex = Math.max(lowIndex, i);
            if (lowIndex >= this.A01) {
                return;
            }
        }
        Arrays.fill(this.A03, lowIndex, this.A01, (Object) null);
        this.A01 = lowIndex;
    }
}
