package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WS implements InterfaceC0407Cc, InterfaceC0414Cl {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final InterfaceC0410Cf A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0409Ce A09;
    public C0551Ij A0A;
    public boolean A0B;
    public DI[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0551Ij A0F;
    public final C0551Ij A0G;
    public final C0551Ij A0H;
    public final ArrayDeque<C0897Wa> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, Ascii.FF, Ascii.ETB, Ascii.NAK, 88, Ascii.VT, 17, 2, Ascii.GS, 88, Ascii.DC4, Ascii.GS, Ascii.VT, Ascii.VT, 88, Ascii.FF, Ascii.DLE, Ascii.EM, Ascii.SYN, 88, Ascii.DLE, Ascii.GS, Ascii.EM, Ascii.FS, Ascii.GS, 10, 88, Ascii.DC4, Ascii.GS, Ascii.SYN, Ascii.US, Ascii.FF, Ascii.DLE, 88, 80, Ascii.CR, Ascii.SYN, Ascii.VT, Ascii.CR, 8, 8, Ascii.ETB, 10, Ascii.FF, Ascii.GS, Ascii.FS, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new WT();
        A0M = C0567Iz.A08(A04(48, 4, 105));
    }

    public WS() {
        this(0);
    }

    public WS(int i) {
        this.A0E = i;
        this.A0F = new C0551Ij(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0551Ij(C0547If.A03);
        this.A0G = new C0551Ij(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i3 = 0;
        while (true) {
            DI[] diArr = this.A0C;
            if (i3 >= diArr.length) {
                break;
            }
            DI di = diArr[i3];
            int i4 = di.A00;
            if (i4 != di.A03.A01) {
                long j4 = di.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - preferredSkipAmount;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < j)) {
                    i = i5;
                    j = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    sampleIndex = i3;
                }
            }
            i3++;
        }
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (j3 == Long.MAX_VALUE || trackIndex == 0) {
            return i2;
        }
        long sampleOffset = 10485760 + j3;
        if (j2 < sampleOffset) {
            return i2;
        }
        return sampleIndex;
    }

    private int A01(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        int i;
        long jA7F = interfaceC0408Cd.A7F();
        if (this.A06 == -1) {
            this.A06 = A00(jA7F);
            if (this.A06 == -1) {
                return -1;
            }
        }
        DI di = this.A0C[this.A06];
        InterfaceC0417Co interfaceC0417Co = di.A01;
        int i2 = di.A00;
        long j = di.A03.A06[i2];
        int i3 = di.A03.A05[i2];
        long inputPosition = j - jA7F;
        long position = inputPosition + ((long) this.A04);
        if (position < 0 || position >= 262144) {
            c0412Cj.A00 = j;
            return 1;
        }
        if (di.A02.A02 == 1) {
            position += 8;
            i3 -= 8;
        }
        interfaceC0408Cd.AEt((int) position);
        if (di.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i4 = di.A02.A01;
            int i5 = 4 - di.A02.A01;
            while (this.A04 < i3) {
                int i6 = this.A05;
                if (i6 == 0) {
                    byte[] nalLengthData = this.A0G.A00;
                    interfaceC0408Cd.readFully(nalLengthData, i5, i4);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    interfaceC0417Co.AEG(this.A0H, 4);
                    this.A04 += 4;
                    i3 += i5;
                } else {
                    int writtenBytes = interfaceC0417Co.AEF(interfaceC0408Cd, i6, false);
                    this.A04 += writtenBytes;
                    this.A05 -= writtenBytes;
                }
            }
            i = 0;
        } else {
            while (true) {
                int i7 = this.A04;
                if (i7 >= i3) {
                    break;
                }
                int iAEF = interfaceC0417Co.AEF(interfaceC0408Cd, i3 - i7, false);
                int writtenBytes2 = this.A04;
                this.A04 = writtenBytes2 + iAEF;
                int writtenBytes3 = this.A05;
                this.A05 = writtenBytes3 - iAEF;
            }
            i = 0;
        }
        interfaceC0417Co.AEH(di.A03.A07[i2], di.A03.A04[i2], i3, 0, null);
        di.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(DR dr, long j) {
        int iA00 = dr.A00(j);
        if (iA00 == -1) {
            return dr.A01(j);
        }
        return iA00;
    }

    public static long A03(DR dr, long j, long j2) {
        int iA02 = A02(dr, j);
        if (iA02 == -1) {
            return j2;
        }
        return Math.min(dr.A06[iA02], j2);
    }

    private ArrayList<DR> A05(C0897Wa c0897Wa, C0411Cg c0411Cg, boolean z) throws C0360Af {
        DO doA0C;
        ArrayList<DR> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int size = c0897Wa.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i < size) {
                C0897Wa c0897Wa2 = c0897Wa.A01.get(i);
                if (((D3) c0897Wa2).A00 == D3.A1L && (doA0C = D8.A0C(c0897Wa2, c0897Wa.A07(D3.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    DR drA0E = D8.A0E(doA0C, c0897Wa2.A06(D3.A0d).A06(D3.A0h).A06(D3.A16), c0411Cg);
                    if (drA0E.A01 != 0) {
                        arrayList.add(drA0E);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws C0360Af {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j) {
            C0897Wa c0897WaPop = this.A0I.pop();
            if (((D3) c0897WaPop).A00 == D3.A0j) {
                A0A(c0897WaPop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(c0897WaPop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j) {
        for (DI di : this.A0C) {
            DR dr = di.A03;
            int iA00 = dr.A00(j);
            if (iA00 == -1) {
                iA00 = dr.A01(j);
            }
            di.A00 = iA00;
        }
    }

    private void A0A(C0897Wa c0897Wa) throws C0360Af {
        ArrayList<DR> arrayListA05;
        int size = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C0411Cg c0411Cg = new C0411Cg();
        WZ wzA07 = c0897Wa.A07(D3.A1P);
        if (wzA07 != null && (metadata = D8.A0F(wzA07, this.A0B)) != null) {
            c0411Cg.A05(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            arrayListA05 = A05(c0897Wa, c0411Cg, ignoreEditLists);
        } catch (WW unused) {
            c0411Cg = new C0411Cg();
            arrayListA05 = A05(c0897Wa, c0411Cg, true);
        }
        int size2 = arrayListA05.size();
        for (int i = 0; i < size2; i++) {
            DR dr = arrayListA05.get(i);
            DO r13 = dr.A03;
            DI di = new DI(r13, dr, this.A09.AFD(i, r13.A03));
            int trackCount = dr.A00 + 30;
            Format formatA0F = r13.A07.A0F(trackCount);
            if (r13.A03 == 1) {
                if (c0411Cg.A03()) {
                    formatA0F = formatA0F.A0G(c0411Cg.A00, c0411Cg.A01);
                }
                if (metadata != null) {
                    formatA0F = formatA0F.A0J(metadata);
                }
            }
            di.A01.A5V(formatA0F);
            jMax = Math.max(jMax, r13.A04 != -9223372036854775807L ? r13.A04 : dr.A02);
            int maxInputSize = r13.A03;
            if (maxInputSize == 2 && size == -1) {
                size = arrayList.size();
            }
            arrayList.add(di);
        }
        this.A02 = size;
        this.A08 = jMax;
        this.A0C = (DI[]) arrayList.toArray(new DI[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5D();
        this.A09.AEM(this);
    }

    public static boolean A0B(int i) {
        if (i != D3.A0j) {
            int i2 = D3.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i != i2 && i != D3.A0d && i != D3.A0h && i != D3.A16 && i != D3.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i) {
        if (i != D3.A0c && i != D3.A0n && i != D3.A0V && i != D3.A1A && i != D3.A1D && i != D3.A1B) {
            int i2 = D3.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i != i2 && i != D3.A0O && i != D3.A19 && i != D3.A1C && i != D3.A1E && i != D3.A17 && i != D3.A0B && i != D3.A1J && i != D3.A0U && i != D3.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            if (!interfaceC0408Cd.ADc(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long j = this.A07;
        if (j == 1) {
            interfaceC0408Cd.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0N();
        } else if (j == 0) {
            long jA6t = interfaceC0408Cd.A6t();
            if (jA6t == -1 && !this.A0I.isEmpty()) {
                jA6t = this.A0I.peek().A00;
            }
            if (jA6t != -1) {
                this.A07 = (jA6t - interfaceC0408Cd.A7F()) + ((long) this.A00);
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long jA7F = (interfaceC0408Cd.A7F() + this.A07) - ((long) this.A00);
                this.A0I.push(new C0897Wa(this.A01, jA7F));
                if (this.A07 == this.A00) {
                    A08(jA7F);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                IK.A04(this.A00 == 8);
                IK.A04(this.A07 <= 2147483647L);
                this.A0A = new C0551Ij((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C0360Af(A04(0, 48, 100));
    }

    private boolean A0E(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        long j = this.A07 - ((long) this.A00);
        long jA7F = interfaceC0408Cd.A7F() + j;
        boolean z = false;
        C0551Ij c0551Ij = this.A0A;
        if (c0551Ij != null) {
            interfaceC0408Cd.readFully(c0551Ij.A00, this.A00, (int) j);
            if (this.A01 == D3.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new WZ(this.A01, this.A0A));
            }
        } else if (j < 262144) {
            interfaceC0408Cd.AEt((int) j);
        } else {
            c0412Cj.A00 = interfaceC0408Cd.A7F() + j;
            z = true;
        }
        A08(jA7F);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C0551Ij c0551Ij) {
        c0551Ij.A0Y(8);
        if (c0551Ij.A08() == A0M) {
            return true;
        }
        c0551Ij.A0Z(4);
        while (c0551Ij.A04() > 0) {
            if (c0551Ij.A08() == A0M) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[][] A0G(com.facebook.ads.redexgen.X.DI[] r14) {
        /*
            int r0 = r14.length
            long[][] r6 = new long[r0][]
            int r0 = r14.length
            int[] r5 = new int[r0]
            int r0 = r14.length
            long[] r4 = new long[r0]
            int r0 = r14.length
            boolean[] r3 = new boolean[r0]
            r2 = 0
        Ld:
            int r0 = r14.length
            if (r2 >= r0) goto L28
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r2] = r0
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r1 = r0.A07
            r0 = 0
            r0 = r1[r0]
            r4[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L28:
            r12 = 0
            r2 = 0
        L2b:
            int r0 = r14.length
            if (r2 >= r0) goto L71
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = -1
            r1 = 0
        L35:
            int r0 = r14.length
            if (r1 >= r0) goto L48
            boolean r0 = r3[r1]
            if (r0 != 0) goto L45
            r7 = r4[r1]
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            r9 = r1
            r10 = r4[r1]
        L45:
            int r1 = r1 + 1
            goto L35
        L48:
            r7 = r5[r9]
            r0 = r6[r9]
            r0[r7] = r12
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int[] r0 = r0.A05
            r0 = r0[r7]
            long r0 = (long) r0
            long r12 = r12 + r0
            r1 = 1
            int r7 = r7 + r1
            r5[r9] = r7
            r0 = r6[r9]
            int r0 = r0.length
            if (r7 >= r0) goto L6c
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r7]
            r4[r9] = r0
            goto L2b
        L6c:
            r3[r9] = r1
            int r2 = r2 + 1
            goto L2b
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WS.A0G(com.facebook.ads.redexgen.X.DI[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long secondTimeUs) {
        long j;
        long jA03;
        int iA01;
        DI[] diArr = this.A0C;
        if (diArr.length == 0) {
            return new C0413Ck(C0415Cm.A04);
        }
        long j2 = -9223372036854775807L;
        long jA032 = -1;
        int i = this.A02;
        if (i != -1) {
            DR dr = diArr[i].A03;
            int iA02 = A02(dr, secondTimeUs);
            if (iA02 == -1) {
                return new C0413Ck(C0415Cm.A04);
            }
            j = dr.A07[iA02];
            jA03 = dr.A06[iA02];
            if (A0K[5].charAt(28) == 'l') {
                String[] strArr = A0K;
                strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                strArr[6] = "ISWp";
                if (j < secondTimeUs && iA02 < dr.A01 - 1 && (iA01 = dr.A01(secondTimeUs)) != -1 && iA01 != iA02) {
                    j2 = dr.A07[iA01];
                    jA032 = dr.A06[iA01];
                }
            }
            throw new RuntimeException();
        }
        j = secondTimeUs;
        jA03 = Long.MAX_VALUE;
        int i2 = 0;
        while (true) {
            DI[] diArr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i2 < diArr2.length) {
                if (i2 != this.A02) {
                    DR dr2 = diArr2[i2].A03;
                    jA03 = A03(dr2, j, jA03);
                    if (j2 != -9223372036854775807L) {
                        jA032 = A03(dr2, j2, jA032);
                    }
                }
                i2++;
            } else {
                C0415Cm c0415Cm = new C0415Cm(j, jA03);
                if (j2 == -9223372036854775807L) {
                    return new C0413Ck(c0415Cm);
                }
                return new C0413Ck(c0415Cm, new C0415Cm(j2, jA032));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A09 = interfaceC0409Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final int ADX(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        while (true) {
            int i = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return A01(interfaceC0408Cd, c0412Cj);
                    }
                    throw new IllegalStateException();
                }
                if (A0E(interfaceC0408Cd, c0412Cj)) {
                    return 1;
                }
            } else if (!A0D(interfaceC0408Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        return DM.A04(interfaceC0408Cd);
    }
}
