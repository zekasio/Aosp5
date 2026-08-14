package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WD implements InterfaceC0426Di {
    public static byte[] A0H;
    public static String[] A0I = {"wge6vcbYVd2LlwU9IzXxO7y1yc7Npjql", "e4ah1", "HxlECSCujzZIBhcakhB8llOPpIPg4jPi", "c3jgZ7razfwrLoite54T", "YnWTxT53I9VC0eKuEFoJi1GxqSMOrSIM", "mGJBSiyG9M2YGViPKeXmqCjoZalx0YC5", "VtpTHv8dn8NrwXo7ikKBEmVWKD8j4YCX", "dqOZRsMzwGVkln1A4hbisIXuNnIWGGSy"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC0417Co A07;
    public InterfaceC0417Co A08;
    public InterfaceC0417Co A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0550Ii A0D;
    public final C0551Ij A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
            if (A0I[4].charAt(1) != 'n') {
                throw new RuntimeException();
            }
            A0I[4] = "bnluMaXE1Uw3b3JGoNOZfy6HcCqjlXqz";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-120, 124, -66, -47, -48, 124, -67, -49, -49, -47, -55, -59, -54, -61, 124, -99, -99, -97, 124, -88, -97, -118, -118, -83, -67, -68, -101, -82, -86, -83, -82, -69, -18, Ascii.SI, Ascii.RS, Ascii.SI, Ascii.CR, Ascii.RS, Ascii.SI, Ascii.SO, -54, Ascii.VT, Ascii.US, Ascii.SO, 19, Ascii.EM, -54, Ascii.EM, Ascii.FF, Ascii.DC4, Ascii.SI, Ascii.CR, Ascii.RS, -54, Ascii.RS, 35, Ascii.SUB, Ascii.SI, -28, -54, -26, -11, -11, -15, -18, -24, -26, -7, -18, -12, -13, -76, -18, -23, -72, Ascii.DLE, 36, 19, Ascii.CAN, Ascii.RS, -34, Ascii.FS, Ascii.US, -29, Ascii.DLE, -36, Ascii.ESC, Ascii.DLE, 35, Ascii.FS};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public WD(boolean z) {
        this(z, null);
    }

    public WD(boolean z, String str) {
        this.A0D = new C0550Ii(new byte[7]);
        this.A0E = new C0551Ij(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws C0360Af {
        this.A0D.A07(0);
        if (!this.A0C) {
            int iA04 = this.A0D.A04(2) + 1;
            if (iA04 != 2) {
                Log.w(A00(22, 10, 24), A00(32, 28, 121) + iA04 + A00(0, 22, 43));
                iA04 = 2;
            }
            int iA042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int sampleRateIndex = this.A0D.A04(3);
            byte[] bArrA07 = IO.A07(iA04, iA042, sampleRateIndex);
            Pair<Integer, Integer> pairA03 = IO.A03(bArrA07);
            Format formatA07 = Format.A07(this.A0A, A00(75, 15, 126), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArrA07), null, 0, this.A0F);
            this.A05 = 1024000000 / ((long) formatA07.A0C);
            this.A09.A5V(formatA07);
            this.A0C = true;
        } else {
            C0550Ii c0550Ii = this.A0D;
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int sampleSize = str2.length();
            if (length == sampleSize) {
                throw new RuntimeException();
            }
            A0I[4] = "gnfbeCT7ETb0BF6eGTwxRLZIMNoo6eBq";
            c0550Ii.A08(10);
        }
        this.A0D.A08(4);
        int iA043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            iA043 -= 2;
        }
        InterfaceC0417Co interfaceC0417Co = this.A09;
        long j = this.A05;
        if (A0I[0].charAt(1) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[5] = "DPeEZCdjnoP4QwMjUw7HIDON5EObNWtY";
        strArr2[6] = "TWt76gMmW2EkEQM2OhdsBT8X6vSrq3Ij";
        A07(interfaceC0417Co, j, 0, iA043);
    }

    private void A02() {
        this.A08.AEG(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC0417Co interfaceC0417Co, long j, int i, int i2) {
        this.A03 = 3;
        this.A00 = i;
        this.A07 = interfaceC0417Co;
        this.A04 = j;
        this.A02 = i2;
    }

    private void A08(C0551Ij c0551Ij) {
        byte[] bArr = c0551Ij.A00;
        int position = c0551Ij.A06();
        int iA07 = c0551Ij.A07();
        while (position < iA07) {
            int i = position + 1;
            int i2 = bArr[position] & UByte.MAX_VALUE;
            int position2 = this.A01;
            if (position2 == 512 && i2 >= 240 && i2 != 255) {
                int position3 = i2 & 1;
                this.A0B = position3 == 0;
                A04();
                c0551Ij.A0Y(i);
                return;
            }
            int i3 = this.A01;
            int i4 = i3 | i2;
            if (i4 == 329) {
                this.A01 = 768;
            } else if (i4 == 511) {
                this.A01 = 512;
            } else if (i4 == 836) {
                this.A01 = 1024;
            } else if (i4 != 1075) {
                if (i3 != 256) {
                    this.A01 = 256;
                    position = i - 1;
                }
            } else {
                A05();
                c0551Ij.A0Y(i);
                return;
            }
            position = i;
        }
        c0551Ij.A0Y(position);
    }

    private void A09(C0551Ij c0551Ij) {
        int iMin = Math.min(c0551Ij.A04(), this.A02 - this.A00);
        this.A07.AEG(c0551Ij, iMin);
        this.A00 += iMin;
        int i = this.A00;
        int i2 = this.A02;
        if (i == i2) {
            this.A07.AEH(this.A06, 1, i2, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C0551Ij c0551Ij, byte[] bArr, int i) {
        int iMin = Math.min(c0551Ij.A04(), i - this.A00);
        c0551Ij.A0c(bArr, this.A00, iMin);
        this.A00 += iMin;
        return this.A00 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) throws C0360Af {
        while (c0551Ij.A04() > 0) {
            int i = this.A03;
            if (i == 0) {
                A08(c0551Ij);
            } else if (i != 1) {
                String[] strArr = A0I;
                if (strArr[5].charAt(25) == strArr[6].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "9CqnxzaEQimEcBf5cSINZxdBysafSxdF";
                strArr2[6] = "zLp55t2V8ycwykcXwXcmLQHdTFNUXCiS";
                if (i == 2) {
                    boolean zA0A = A0A(c0551Ij, this.A0D.A00, this.A0B ? 7 : 5);
                    if (A0I[0].charAt(1) == 'g') {
                        String[] strArr3 = A0I;
                        strArr3[3] = "PBSyuwIG2tPzzgRnoBM9";
                        strArr3[1] = "owzwp";
                        if (zA0A) {
                            A01();
                        }
                    } else if (zA0A) {
                        A01();
                    }
                } else if (i == 3) {
                    A09(c0551Ij);
                }
            } else if (A0A(c0551Ij, this.A0E.A00, 10)) {
                A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A0A = c0440Dw.A04();
        this.A09 = interfaceC0409Ce.AFD(c0440Dw.A03(), 1);
        if (this.A0G) {
            c0440Dw.A05();
            this.A08 = interfaceC0409Ce.AFD(c0440Dw.A03(), 4);
            this.A08.A5V(Format.A0B(c0440Dw.A04(), A00(60, 15, 84), null, -1, null));
            return;
        }
        this.A08 = new C0915Ws();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        this.A06 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        A03();
    }
}
