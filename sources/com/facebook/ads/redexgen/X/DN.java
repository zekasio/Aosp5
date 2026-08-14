package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DN implements InterfaceC0899Wc {
    public static byte[] A05;
    public static String[] A06 = {"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A06[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
            i4++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A06[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, Ascii.ESC, 95, 90, 79, 90, Ascii.ESC, 72, 82, 65, 94, Ascii.ESC, 86, 82, 72, 86, 90, 79, 88, 83, 1, Ascii.ESC, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    static {
        A03();
    }

    public DN(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public DN(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * ((long) i)) / 100;
    }

    public static DN A01(long j, long j2, Ci ci, C0551Ij c0551Ij) {
        int flags;
        int i = ci.A04;
        int i2 = ci.A03;
        int iA08 = c0551Ij.A08();
        int samplesPerFrame = iA08 & 1;
        if (samplesPerFrame != 1 || (flags = c0551Ij.A0H()) == 0) {
            return null;
        }
        long dataSize = C0567Iz.A0F(flags, ((long) i) * 1000000, i2);
        int samplesPerFrame2 = iA08 & 6;
        if (samplesPerFrame2 != 6) {
            return new DN(j2, ci.A02, dataSize);
        }
        long jA0H = c0551Ij.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            long durationUs = c0551Ij.A0E();
            jArr[i3] = durationUs;
        }
        if (j != -1 && j != j2 + jA0H) {
            StringBuilder sb = new StringBuilder();
            sb.append(A02(2, 25, 81));
            sb.append(j);
            sb.append(A02(0, 2, 17));
            long durationUs2 = j2 + jA0H;
            sb.append(durationUs2);
            Log.w(A02(27, 10, 96), sb.toString());
        }
        return new DN(j2, ci.A02, dataSize, jA0H, jArr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long j) {
        double scaledPosition;
        if (!A8g()) {
            return new C0413Ck(new C0415Cm(0L, this.A02 + ((long) this.A00)));
        }
        long positionOffset = C0567Iz.A0E(j, 0L, this.A03);
        long timeUs = this.A03;
        double d = (positionOffset * 100.0d) / timeUs;
        if (d <= 0.0d) {
            scaledPosition = 0.0d;
        } else if (d >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i = (int) d;
            double d2 = this.A04[i];
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            A06[4] = "";
            scaledPosition = d2 + (((i == 99 ? 256.0d : r10[i + 1]) - d2) * (d - ((double) i)));
        }
        return new C0413Ck(new C0415Cm(positionOffset, this.A02 + C0567Iz.A0E(Math.round((scaledPosition / 256.0d) * this.A01), this.A00, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Wc
    public final long A7e(long j) {
        double d;
        long positionOffset = j - this.A02;
        if (A8g()) {
            long j2 = this.A00;
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            A06[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
            if (positionOffset > j2) {
                double d2 = (positionOffset * 256.0d) / this.A01;
                int iA0B = C0567Iz.A0B(this.A04, (long) d2, true, true);
                long jA00 = A00(iA0B);
                long j3 = this.A04[iA0B];
                long jA002 = A00(iA0B + 1);
                if (j3 == (iA0B == 99 ? 256L : this.A04[iA0B + 1])) {
                    d = 0.0d;
                } else {
                    d = (d2 - j3) / (r8 - j3);
                }
                long nextScaledPosition = Math.round((jA002 - jA00) * d);
                return nextScaledPosition + jA00;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return this.A04 != null;
    }
}
