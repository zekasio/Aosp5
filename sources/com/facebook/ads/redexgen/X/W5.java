package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0426Di {
    public static byte[] A0K;
    public static String[] A0L = {"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC0417Co A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C0551Ij A0I = new C0551Ij(1024);
    public final C0550Ii A0H = new C0550Ii(this.A0I.A00);

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] - i3) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    static {
        A04();
    }

    public W5(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C0550Ii c0550Ii) throws C0360Af {
        int iA01 = c0550Ii.A01();
        Pair<Integer, Integer> pairA02 = IO.A02(c0550Ii, true);
        this.A05 = ((Integer) pairA02.first).intValue();
        this.A02 = ((Integer) pairA02.second).intValue();
        return iA01 - c0550Ii.A01();
    }

    private int A01(C0550Ii c0550Ii) throws C0360Af {
        int iA04;
        int i = 0;
        if (this.A03 == 0) {
            do {
                iA04 = c0550Ii.A04(8);
                i += iA04;
            } while (iA04 == 255);
            return i;
        }
        throw new C0360Af();
    }

    public static long A02(C0550Ii c0550Ii) {
        return c0550Ii.A04((c0550Ii.A04(2) + 1) * 8);
    }

    private void A05(int i) {
        this.A0I.A0W(i);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C0550Ii c0550Ii) throws C0360Af {
        if (!c0550Ii.A0F()) {
            this.A0G = true;
            A08(c0550Ii);
        } else if (!this.A0G) {
            return;
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(c0550Ii, A01(c0550Ii));
                if (this.A0F) {
                    c0550Ii.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C0360Af();
        }
        throw new C0360Af();
    }

    private void A07(C0550Ii c0550Ii) {
        this.A03 = c0550Ii.A04(3);
        int i = this.A03;
        if (i == 0) {
            c0550Ii.A08(8);
            return;
        }
        if (i != 1) {
            if (i == 3 || i == 4 || i == 5) {
                c0550Ii.A08(6);
                return;
            }
            if (i != 6) {
                if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                if (i != 7) {
                    return;
                }
            }
            c0550Ii.A08(1);
            return;
        }
        c0550Ii.A08(9);
    }

    private void A08(C0550Ii c0550Ii) throws C0360Af {
        boolean zA0F;
        int numProgram = c0550Ii.A04(1);
        int bitsRead = numProgram == 1 ? c0550Ii.A04(1) : 0;
        this.A00 = bitsRead;
        if (this.A00 == 0) {
            if (numProgram == 1) {
                A02(c0550Ii);
            }
            if (c0550Ii.A0F()) {
                this.A04 = c0550Ii.A04(6);
                int iA04 = c0550Ii.A04(4);
                int iA042 = c0550Ii.A04(3);
                if (iA04 == 0 && iA042 == 0) {
                    if (numProgram == 0) {
                        int readBits = c0550Ii.A03();
                        int iA00 = A00(c0550Ii);
                        c0550Ii.A07(readBits);
                        int readBits2 = iA00 + 7;
                        byte[] initData = new byte[readBits2 / 8];
                        c0550Ii.A0D(initData, 0, iA00);
                        Format formatA07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(initData), null, 0, this.A0J);
                        if (!formatA07.equals(this.A0C)) {
                            this.A0C = formatA07;
                            this.A0A = 1024000000 / ((long) formatA07.A0C);
                            this.A0D.A5V(formatA07);
                        }
                    } else {
                        int iA02 = (int) A02(c0550Ii);
                        int bitsRead2 = A00(c0550Ii);
                        c0550Ii.A08(iA02 - bitsRead2);
                    }
                    A07(c0550Ii);
                    this.A0F = c0550Ii.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (numProgram == 1) {
                            this.A09 = A02(c0550Ii);
                        } else {
                            do {
                                zA0F = c0550Ii.A0F();
                                this.A09 = (this.A09 << 8) + ((long) c0550Ii.A04(8));
                            } while (zA0F);
                        }
                    }
                    if (c0550Ii.A0F()) {
                        c0550Ii.A08(8);
                        return;
                    }
                    return;
                }
                throw new C0360Af();
            }
            throw new C0360Af();
        }
        throw new C0360Af();
    }

    private void A09(C0550Ii c0550Ii, int i) {
        int iA03 = c0550Ii.A03();
        if ((iA03 & 7) == 0) {
            this.A0I.A0Y(iA03 >> 3);
        } else {
            c0550Ii.A0D(this.A0I.A00, 0, i * 8);
            this.A0I.A0Y(0);
        }
        this.A0D.AEG(this.A0I, i);
        this.A0D.AEH(this.A0B, 1, i, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) throws C0360Af {
        while (c0551Ij.A04() > 0) {
            int i = this.A08;
            if (i != 0) {
                if (i == 1) {
                    int iA0E = c0551Ij.A0E();
                    if ((iA0E & 224) == 224) {
                        this.A07 = iA0E;
                        this.A08 = 2;
                    } else if (iA0E != 86) {
                        this.A08 = 0;
                    }
                } else {
                    if (A0L[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0L;
                    strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                    strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                    if (i == 2) {
                        this.A06 = ((this.A07 & (-225)) << 8) | c0551Ij.A0E();
                        if (this.A06 > this.A0I.A00.length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                    } else if (i == 3) {
                        int iMin = Math.min(c0551Ij.A04(), this.A06 - this.A01);
                        c0551Ij.A0c(this.A0H.A00, this.A01, iMin);
                        this.A01 += iMin;
                        if (this.A01 == this.A06) {
                            this.A0H.A07(0);
                            A06(this.A0H);
                            this.A08 = 0;
                        }
                    }
                }
            } else if (c0551Ij.A0E() == 86) {
                this.A08 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A0D = interfaceC0409Ce.AFD(c0440Dw.A03(), 1);
        this.A0E = c0440Dw.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        this.A08 = 0;
        this.A0G = false;
    }
}
