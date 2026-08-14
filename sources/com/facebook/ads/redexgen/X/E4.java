package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class E4 implements XG, InterfaceC0375Au {
    public int A00;
    public int A01;
    public long A02;
    public C0376Av A03;
    public InterfaceC0487Fv A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public E4(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable CM<?> cm, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (cm == null) {
            return false;
        }
        return cm.A3x(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j) {
        return this.A04.AEs(j - this.A02);
    }

    public final int A10(AZ az, X2 x2, boolean z) {
        int iADa = this.A04.ADa(az, x2, z);
        if (iADa == -4) {
            if (x2.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            x2.A00 += this.A02;
        } else if (iADa == -5) {
            Format format = az.A00;
            if (format.A0G != Long.MAX_VALUE) {
                az.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return iADa;
    }

    public final C0376Av A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws AM {
    }

    public void A14() throws AM {
    }

    public void A15(long j, boolean z) throws AM {
    }

    public void A16(boolean z) throws AM {
    }

    public void A17(Format[] formatArr, long j) throws AM {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8c();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void A4n() {
        IK.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void A5A(C0376Av c0376Av, Format[] formatArr, InterfaceC0487Fv interfaceC0487Fv, long j, boolean z, long j2) throws AM {
        IK.A04(this.A01 == 0);
        this.A03 = c0376Av;
        this.A01 = 1;
        A16(z);
        AE1(formatArr, interfaceC0487Fv, j2);
        A15(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final InterfaceC0375Au A5y() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public InterfaceC0542Ia A6w() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final int A7W() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final InterfaceC0487Fv A7b() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.XG, com.facebook.ads.redexgen.X.InterfaceC0375Au
    public final int A7i() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0372Ar
    public void A7z(int i, Object obj) throws AM {
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A84() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8O() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void A9a() throws IOException {
        this.A04.A9X();
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void AE1(Format[] formatArr, InterfaceC0487Fv interfaceC0487Fv, long j) throws AM {
        IK.A04(!this.A06);
        this.A04 = interfaceC0487Fv;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void AEC(long j) throws AM {
        this.A06 = false;
        this.A05 = false;
        A15(j, false);
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void AEX() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void AEZ(int i) {
        this.A00 = i;
    }

    public int AF9() throws AM {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void start() throws AM {
        IK.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final void stop() throws AM {
        IK.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
