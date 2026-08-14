package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0425Dg implements InterfaceC0899Wc {
    public static byte[] A03;
    public static String[] A04 = {"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        A04[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, 127, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, -39, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    static {
        A02();
    }

    public C0425Dg(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static C0425Dg A00(long durationUs, long j, Ci ci, C0551Ij c0551Ij) {
        int iA0E;
        long position = j;
        c0551Ij.A0Z(10);
        int iA08 = c0551Ij.A08();
        if (iA08 <= 0) {
            return null;
        }
        int i = ci.A03;
        long jA0F = C0567Iz.A0F(iA08, 1000000 * ((long) (i >= 32000 ? 1152 : 576)), i);
        int iA0I = c0551Ij.A0I();
        int iA0I2 = c0551Ij.A0I();
        int iA0I3 = c0551Ij.A0I();
        c0551Ij.A0Z(2);
        int scale = ci.A02;
        long j2 = position + ((long) scale);
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        for (int i2 = 0; i2 < iA0I; i2++) {
            jArr[i2] = (((long) i2) * jA0F) / ((long) iA0I);
            jArr2[i2] = Math.max(position, j2);
            if (iA0I3 == 1) {
                iA0E = c0551Ij.A0E();
            } else if (iA0I3 == 2) {
                iA0E = c0551Ij.A0I();
            } else if (iA0I3 == 3) {
                iA0E = c0551Ij.A0G();
            } else {
                if (iA0I3 != 4) {
                    return null;
                }
                iA0E = c0551Ij.A0H();
            }
            position += (long) (iA0E * iA0I2);
            int segmentSize = A04[7].charAt(10);
            if (segmentSize == 80) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        if (durationUs != -1 && durationUs != position) {
            Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
        }
        return new C0425Dg(jArr, jArr2, jA0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long j) {
        int iA0B = C0567Iz.A0B(this.A02, j, true, true);
        C0415Cm c0415Cm = new C0415Cm(this.A02[iA0B], this.A01[iA0B]);
        if (c0415Cm.A01 < j) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                return new C0413Ck(c0415Cm, new C0415Cm(jArr[iA0B + 1], this.A01[iA0B + 1]));
            }
        }
        return new C0413Ck(c0415Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Wc
    public final long A7e(long j) {
        return this.A02[C0567Iz.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return true;
    }
}
