package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E1 implements Handler.Callback, VX, HS, FZ, AJ, InterfaceC0371Aq {
    public static byte[] A0V;
    public static String[] A0W = {"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AV A04;
    public C0361Ag A05;
    public InterfaceC0466Fa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public XG[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final XJ A0G;
    public final XH A0H;
    public final InterfaceC0356Ab A0J;
    public final C0379Az A0L;
    public final B0 A0M;
    public final HT A0N;
    public final HU A0O;
    public final IN A0P;
    public final IX A0Q;
    public final ArrayList<AT> A0R;
    public final boolean A0S;
    public final XG[] A0T;
    public final InterfaceC0375Au[] A0U;
    public final C0359Ae A0K = new C0359Ae();
    public C0378Ax A06 = C0378Ax.A03;
    public final AU A0I = new AU(null);

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0K() {
        A0V = new byte[]{40, Ascii.NAK, 2, 61, 1, Ascii.FF, Ascii.DC4, 8, Ascii.US, 36, 0, Ascii.GS, 1, 36, 3, Ascii.EM, 8, Ascii.US, 3, Ascii.FF, 1, 40, Ascii.NAK, 2, 61, 1, Ascii.FF, Ascii.DC4, 8, Ascii.US, 36, 0, Ascii.GS, 1, 36, 3, Ascii.EM, 8, Ascii.US, 3, Ascii.FF, 1, 87, 37, Ascii.FF, 3, 9, 1, 8, Ascii.US, Ascii.EM, 55, 62, 63, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, Ascii.SO, 3, Ascii.ESC, 0, 3, 1, 9, 66, 7, Ascii.DLE, Ascii.DLE, Ascii.CR, Ascii.DLE, 76, 102, 90, 64, 71, 86, 80, Ascii.NAK, 80, 71, 71, 90, 71, Ascii.ESC, 74, 109, 118, 105, 57, 127, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    static {
        A0K();
    }

    public E1(XG[] xgArr, HT ht, HU hu, InterfaceC0356Ab interfaceC0356Ab, boolean z, int i, boolean z2, Handler handler, XH xh, IN in) {
        this.A0T = xgArr;
        this.A0N = ht;
        this.A0O = hu;
        this.A0J = interfaceC0356Ab;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = xh;
        this.A0P = in;
        this.A0D = interfaceC0356Ab.A5m();
        this.A0S = interfaceC0356Ab.AED();
        this.A05 = new C0361Ag(B1.A01, -9223372036854775807L, TrackGroupArray.A04, hu);
        this.A0U = new InterfaceC0375Au[xgArr.length];
        for (int i2 = 0; i2 < xgArr.length; i2++) {
            xgArr[i2].AEZ(i2);
            this.A0U[i2] = xgArr[i2].A5y();
        }
        this.A0G = new XJ(this, in);
        this.A0R = new ArrayList<>();
        this.A0C = new XG[0];
        this.A0M = new B0();
        this.A0L = new C0379Az();
        ht.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = in.A4J(this.A0F.getLooper(), this);
    }

    private int A00() {
        B1 b1 = this.A05.A03;
        if (b1.A0E()) {
            return 0;
        }
        return b1.A0B(b1.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, B1 b1, B1 b12) {
        int maxIterations = i;
        int iA04 = -1;
        int iA00 = b1.A00();
        for (int i2 = 0; i2 < iA00 && iA04 == -1; i2++) {
            maxIterations = b1.A03(maxIterations, this.A0L, this.A0M, this.A02, this.A0B);
            if (maxIterations == -1) {
                break;
            }
            iA04 = b12.A04(b1.A0A(maxIterations, this.A0L, true).A03);
        }
        return iA04;
    }

    private long A02(FY fy, long j) throws AM {
        return A03(fy, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A03(com.facebook.ads.redexgen.X.FY r11, long r12, boolean r14) throws com.facebook.ads.redexgen.X.AM {
        /*
            r10 = this;
            r10.A0H()
            r5 = 0
            r10.A09 = r5
            r6 = 2
            r10.A0N(r6)
            com.facebook.ads.redexgen.X.Ae r0 = r10.A0K
            com.facebook.ads.redexgen.X.Ac r1 = r0.A0G()
            r3 = r1
        L11:
            if (r3 == 0) goto L1e
            boolean r0 = r10.A0t(r11, r12, r3)
            if (r0 == 0) goto Lb0
            com.facebook.ads.redexgen.X.Ae r0 = r10.A0K
            r0.A0S(r3)
        L1e:
            if (r1 != r3) goto L22
            if (r14 == 0) goto L65
        L22:
            com.facebook.ads.redexgen.X.XG[] r9 = r10.A0C
            int r8 = r9.length
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 18
            if (r1 == r0) goto L38
        L32:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "MfZ5b0v7S5HL"
            r0 = 4
            r2[r0] = r1
            r7 = 0
        L40:
            if (r7 >= r8) goto L60
            r4 = r9[r7]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 6
            r1 = r1[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L32
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj"
            r0 = 4
            r2[r0] = r1
            r10.A0b(r4)
            int r7 = r7 + 1
            goto L40
        L60:
            com.facebook.ads.redexgen.X.XG[] r0 = new com.facebook.ads.redexgen.X.XG[r5]
            r10.A0C = r0
            r1 = 0
        L65:
            if (r3 == 0) goto La6
            r10.A0V(r1)
            boolean r4 = r3.A05
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L32
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "xpv6IUpjcorvZnU437"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L9a
            com.facebook.ads.redexgen.X.VW r0 = r3.A08
            long r12 = r0.AEP(r12)
            com.facebook.ads.redexgen.X.VW r5 = r3.A08
            long r3 = r10.A0D
            long r1 = r12 - r3
            boolean r0 = r10.A0S
            r5.A4p(r1, r0)
        L9a:
            r10.A0P(r12)
            r10.A09()
        La0:
            com.facebook.ads.redexgen.X.IX r0 = r10.A0Q
            r0.AER(r6)
            return r12
        La6:
            com.facebook.ads.redexgen.X.Ae r1 = r10.A0K
            r0 = 1
            r1.A0O(r0)
            r10.A0P(r12)
            goto La0
        Lb0:
            com.facebook.ads.redexgen.X.Ae r0 = r10.A0K
            com.facebook.ads.redexgen.X.Ac r3 = r0.A0C()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A03(com.facebook.ads.redexgen.X.FY, long, boolean):long");
    }

    private Pair<Integer, Long> A04(AV av, boolean z) {
        int iA01;
        B1 b1 = this.A05.A03;
        B1 b12 = av.A02;
        if (b1.A0E()) {
            return null;
        }
        if (b12.A0E()) {
            b12 = b1;
        }
        try {
            Pair<Integer, Long> pairA07 = b12.A07(this.A0M, this.A0L, av.A00, av.A01);
            if (b1 == b12) {
                return pairA07;
            }
            int iA04 = b1.A04(b12.A0A(((Integer) pairA07.first).intValue(), this.A0L, true).A03);
            if (iA04 != -1) {
                Integer numValueOf = Integer.valueOf(iA04);
                Object obj = pairA07.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[4] = "NzmvKaw5D7qN";
                return Pair.create(numValueOf, (Long) obj);
            }
            if (!z || (iA01 = A01(((Integer) pairA07.first).intValue(), b12, b1)) == -1) {
                return null;
            }
            int i = b1.A09(iA01, this.A0L).A00;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                return A05(b1, i, -9223372036854775807L);
            }
            A0W[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
            return A05(b1, i, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C0355Aa(b1, av.A00, av.A01);
        }
    }

    private Pair<Integer, Long> A05(B1 b1, int i, long j) {
        return b1.A07(this.A0M, this.A0L, i, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07() throws com.facebook.ads.redexgen.X.AM, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A07():void");
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C0357Ac c0357AcA0F = this.A0K.A0F();
        long jA06 = c0357AcA0F.A06();
        if (jA06 == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        long bufferedDurationUs = jA06 - c0357AcA0F.A08(this.A03);
        boolean zAEl = this.A0J.AEl(bufferedDurationUs, this.A0G.A7E().A01);
        A0k(zAEl);
        if (zAEl) {
            long nextLoadPositionUs = this.A03;
            c0357AcA0F.A0F(nextLoadPositionUs);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int i2 = this.A0I.A01;
            if (this.A0I.A03) {
                i = this.A0I.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C0357Ac c0357AcA0F = this.A0K.A0F();
        C0357Ac c0357AcA0H = this.A0K.A0H();
        if (c0357AcA0F != null && !c0357AcA0F.A06) {
            if (c0357AcA0H != null) {
                C0357Ac readingPeriodHolder = c0357AcA0H.A01;
                if (readingPeriodHolder != c0357AcA0F) {
                    return;
                }
            }
            for (XG renderer : this.A0C) {
                if (!renderer.A84()) {
                    return;
                }
            }
            c0357AcA0F.A08.A9Y();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C0358Ad c0358AdA0I = this.A0K.A0I(this.A03, this.A05);
            if (c0358AdA0I == null) {
                this.A07.A9Z();
                return;
            }
            this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5h(), this.A07, this.A05.A03.A0A(c0358AdA0I.A04.A02, this.A0L, true).A03, c0358AdA0I).ADG(this, c0358AdA0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.AC5();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws AM {
        if (!this.A0K.A0P()) {
            return;
        }
        float f = this.A0G.A7E().A01;
        C0357Ac c0357AcA0H = this.A0K.A0H();
        boolean z = true;
        for (C0357Ac c0357AcA0G = this.A0K.A0G(); c0357AcA0G != null; c0357AcA0G = c0357AcA0G.A01) {
            boolean selectionsChangedForReadPeriod = c0357AcA0G.A06;
            if (!selectionsChangedForReadPeriod) {
                return;
            }
            if (!c0357AcA0G.A0I(f)) {
                if (c0357AcA0G == c0357AcA0H) {
                    z = false;
                }
            } else {
                if (z) {
                    C0357Ac c0357AcA0G2 = this.A0K.A0G();
                    boolean zA0S = this.A0K.A0S(c0357AcA0G2);
                    boolean[] zArr = new boolean[this.A0T.length];
                    long jA0B = c0357AcA0G2.A0B(this.A05.A0A, zA0S, zArr);
                    A0i(c0357AcA0G2.A03, c0357AcA0G2.A04);
                    if (this.A05.A00 != 4 && jA0B != this.A05.A0A) {
                        C0361Ag c0361Ag = this.A05;
                        this.A05 = c0361Ag.A04(c0361Ag.A04, jA0B, this.A05.A01);
                        this.A0I.A04(4);
                        A0P(jA0B);
                    }
                    int i = 0;
                    int enabledRendererCount = this.A0T.length;
                    boolean[] zArr2 = new boolean[enabledRendererCount];
                    int i2 = 0;
                    while (true) {
                        XG[] xgArr = this.A0T;
                        if (i2 >= xgArr.length) {
                            this.A05 = this.A05.A05(c0357AcA0G2.A03, c0357AcA0G2.A04);
                            A0p(zArr2, i);
                            break;
                        }
                        XG xg = xgArr[i2];
                        zArr2[i2] = xg.A7W() != 0;
                        InterfaceC0487Fv interfaceC0487Fv = c0357AcA0G2.A0A[i2];
                        if (interfaceC0487Fv != null) {
                            i++;
                        }
                        if (zArr2[i2]) {
                            InterfaceC0487Fv interfaceC0487FvA7b = xg.A7b();
                            if (A0W[4].length() == 29) {
                                throw new RuntimeException();
                            }
                            A0W[4] = "CIOLNyaJNw";
                            if (interfaceC0487Fv != interfaceC0487FvA7b) {
                                A0b(xg);
                            } else if (zArr[i2]) {
                                xg.AEC(this.A03);
                            }
                        }
                        i2++;
                    }
                } else {
                    this.A0K.A0S(c0357AcA0G);
                    if (c0357AcA0G.A06) {
                        c0357AcA0G.A0A(Math.max(c0357AcA0G.A02.A03, c0357AcA0G.A08(this.A03)), false);
                        A0i(c0357AcA0G.A03, c0357AcA0G.A04);
                    }
                }
                if (this.A05.A00 != 4) {
                    A09();
                    A0J();
                    this.A0Q.AER(2);
                    return;
                }
                return;
            }
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws AM {
        this.A09 = false;
        this.A0G.A05();
        for (XG xg : this.A0C) {
            xg.start();
        }
    }

    private void A0H() throws AM {
        this.A0G.A06();
        for (XG xg : this.A0C) {
            A0c(xg);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d6, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01de, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e4, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
    
        r8 = r4.A04;
        r7 = r1.A0K.A0D();
        r6 = r7.A04;
        r9 = r7.A08.ADb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
    
        if (com.facebook.ads.redexgen.X.E1.A0W[4].length() == 29) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
    
        com.facebook.ads.redexgen.X.E1.A0W[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0143, code lost:
    
        if (r9 == (-9223372036854775807L)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
    
        r2 = r1.A0T;
        r0 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        if (r5 >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
    
        r4 = r2[r5];
        r0 = r8.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
    
        r5 = r5 + 1;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
    
        if (r13 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        r4.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        if (r4.A8O() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
    
        r12 = r6.A01.A00(r5);
        r11 = r6.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        if (r1.A0U[r5].A7i() != 5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017a, code lost:
    
        r3 = r8.A03[r5];
        r9 = r6.A03;
        r2 = com.facebook.ads.redexgen.X.E1.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
    
        if (r2[1].charAt(27) == r2[2].charAt(27)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0194, code lost:
    
        com.facebook.ads.redexgen.X.E1.A0W[5] = "Ap10Ra2l8gLZ0YRne2";
        r0 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019d, code lost:
    
        if (r11 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
    
        if (r0.equals(r3) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a5, code lost:
    
        if (r10 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
    
        r3 = A0v(r12);
        r9 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
    
        if (com.facebook.ads.redexgen.X.E1.A0W[3].charAt(0) == 'c') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
    
        com.facebook.ads.redexgen.X.E1.A0W[5] = "P6QWonkpaKbLAx4pgk";
        r4.AE1(r3, r9[r5], r7.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cc, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ce, code lost:
    
        r4.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
    
        if (r9 == (-9223372036854775807L)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I() throws com.facebook.ads.redexgen.X.AM, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A0I():void");
    }

    private void A0J() throws AM {
        long jA0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C0357Ac c0357AcA0G = this.A0K.A0G();
        long jADb = c0357AcA0G.A08.ADb();
        if (jADb != -9223372036854775807L) {
            A0P(jADb);
            long periodPositionUs = this.A05.A0A;
            if (jADb != periodPositionUs) {
                C0361Ag c0361Ag = this.A05;
                this.A05 = c0361Ag.A04(c0361Ag.A04, jADb, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long jA08 = c0357AcA0G.A08(this.A03);
            A0Q(this.A05.A0A, jA08);
            this.A05.A0A = jA08;
        }
        C0361Ag c0361Ag2 = this.A05;
        if (this.A0C.length == 0) {
            jA0C = c0357AcA0G.A02.A01;
        } else {
            jA0C = c0357AcA0G.A0C(true);
        }
        c0361Ag2.A09 = jA0C;
    }

    private void A0L(float f) {
        for (C0357Ac c0357AcA0E = this.A0K.A0E(); c0357AcA0E != null; c0357AcA0E = c0357AcA0E.A01) {
            if (c0357AcA0E.A04 != null) {
                for (HQ trackSelection : c0357AcA0E.A04.A01.A01()) {
                    if (trackSelection != null) {
                        trackSelection.ABp(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws AM {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    private void A0O(int i, boolean z, int i2) throws AM {
        C0357Ac c0357AcA0G = this.A0K.A0G();
        XG xg = this.A0T[i];
        this.A0C[i2] = xg;
        if (xg.A7W() == 0) {
            C0376Av c0376Av = c0357AcA0G.A04.A03[i];
            Format[] formatArrA0v = A0v(c0357AcA0G.A04.A01.A00(i));
            boolean z2 = this.A08 && this.A05.A00 == 3;
            xg.A5A(c0376Av, formatArrA0v, c0357AcA0G.A0A[i], this.A03, !z && z2, c0357AcA0G.A07());
            this.A0G.A09(xg);
            if (z2) {
                xg.start();
            }
        }
    }

    private void A0P(long j) throws AM {
        if (this.A0K.A0P()) {
            C0357Ac c0357AcA0G = this.A0K.A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j = c0357AcA0G.A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (XG xg : this.A0C) {
            xg.AEC(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws AM {
        AT at;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        int i = this.A05.A04.A02;
        int i2 = this.A00;
        AT at2 = i2 > 0 ? this.A0R.get(i2 - 1) : null;
        while (at2 != null) {
            if (at2.A00 <= i) {
                int i3 = at2.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i3 != i || at2.A01 <= j) {
                    break;
                }
            }
            this.A00--;
            int i4 = this.A00;
            at2 = i4 > 0 ? this.A0R.get(i4 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            at = this.A0R.get(this.A00);
        } else {
            at = null;
        }
        while (at != null && at.A02 != null && (at.A00 < i || (at.A00 == i && at.A01 <= j))) {
            this.A00++;
            if (this.A00 < this.A0R.size()) {
                at = this.A0R.get(this.A00);
            } else {
                at = null;
            }
        }
        while (at != null && at.A02 != null && at.A00 == i && at.A01 > j && at.A01 <= j2) {
            A0Z(at.A03);
            if (at.A03.A0B() || at.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                at = this.A0R.get(this.A00);
            } else {
                at = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.ADw(2);
        this.A0Q.AES(2, j + j2);
    }

    private void A0S(AS as) throws AM {
        Object playingPeriodUid;
        if (as.A01 != this.A07) {
            return;
        }
        B1 b1 = this.A05.A03;
        B1 b12 = as.A00;
        Object manifest = as.A02;
        this.A0K.A0N(b12);
        this.A05 = this.A05.A03(b12, manifest);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            AV av = this.A04;
            if (av != null) {
                Pair<Integer, Long> pairA04 = A04(av, true);
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue = ((Integer) pairA04.first).intValue();
                long jLongValue = ((Long) pairA04.second).longValue();
                FY fyA0L = this.A0K.A0L(iIntValue, jLongValue);
                this.A05 = this.A05.A04(fyA0L, fyA0L.A01() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.A05.A02 != -9223372036854775807L) {
                return;
            }
            boolean zA0E = b12.A0E();
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                throw new RuntimeException();
            }
            A0W[4] = "lH2oXw2RUPBHBuRA0";
            if (zA0E) {
                A08();
                return;
            }
            Pair<Integer, Long> pairA05 = A05(b12, b12.A05(this.A0B), -9223372036854775807L);
            int iIntValue2 = ((Integer) pairA05.first).intValue();
            long jLongValue2 = ((Long) pairA05.second).longValue();
            FY fyA0L2 = this.A0K.A0L(iIntValue2, jLongValue2);
            this.A05 = this.A05.A04(fyA0L2, fyA0L2.A01() ? 0L : jLongValue2, jLongValue2);
            return;
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (b1.A0E()) {
            if (!b12.A0E()) {
                FY fyA0L3 = this.A0K.A0L(i2, j);
                C0361Ag c0361Ag = this.A05;
                long startPositionUs = fyA0L3.A01() ? 0L : j;
                this.A05 = c0361Ag.A04(fyA0L3, startPositionUs, j);
                return;
            }
            return;
        }
        C0357Ac c0357AcA0E = this.A0K.A0E();
        if (c0357AcA0E == null) {
            C0379Az c0379Az = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr2 = A0W;
                strArr2[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr2[7] = "AQm6fITMTu1q9a2hy8bL0W";
                playingPeriodUid = b1.A0A(i2, c0379Az, true).A03;
            } else {
                A0W[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                playingPeriodUid = b1.A0A(i2, c0379Az, true).A03;
            }
        } else {
            playingPeriodUid = c0357AcA0E.A09;
        }
        int iA04 = b12.A04(playingPeriodUid);
        if (iA04 == -1) {
            int iA01 = A01(i2, b1, b12);
            if (iA01 == -1) {
                A08();
                return;
            }
            Pair<Integer, Long> pairA052 = A05(b12, b12.A09(iA01, this.A0L).A00, -9223372036854775807L);
            int iIntValue3 = ((Integer) pairA052.first).intValue();
            long jLongValue3 = ((Long) pairA052.second).longValue();
            FY fyA0L4 = this.A0K.A0L(iIntValue3, jLongValue3);
            b12.A0A(iIntValue3, this.A0L, true);
            if (c0357AcA0E != null) {
                Object obj = this.A0L.A03;
                c0357AcA0E.A02 = c0357AcA0E.A02.A00(-1);
                while (c0357AcA0E.A01 != null) {
                    c0357AcA0E = c0357AcA0E.A01;
                    if (c0357AcA0E.A09.equals(obj)) {
                        c0357AcA0E.A02 = this.A0K.A0J(c0357AcA0E.A02, iIntValue3);
                    } else {
                        c0357AcA0E.A02 = c0357AcA0E.A02.A00(-1);
                    }
                }
            }
            this.A05 = this.A05.A04(fyA0L4, A02(fyA0L4, fyA0L4.A01() ? 0L : jLongValue3), jLongValue3);
            return;
        }
        if (iA04 != i2) {
            C0361Ag c0361AgA01 = this.A05.A01(iA04);
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[4] = "bxSLNYRWzgoGTszax8Z4I";
            this.A05 = c0361AgA01;
        }
        FY fy = this.A05.A04;
        if (fy.A01()) {
            FY fyA0L5 = this.A0K.A0L(iA04, j);
            if (!fyA0L5.equals(fy)) {
                this.A05 = this.A05.A04(fyA0L5, A02(fyA0L5, fyA0L5.A01() ? 0L : j), j);
                return;
            }
        }
        if (!this.A0K.A0U(fy, this.A03)) {
            A0j(false);
        }
    }

    private void A0T(AV av) throws Throwable {
        long contentPositionUs;
        FY fyA0L;
        long jLongValue;
        boolean z;
        this.A0I.A03(1);
        Pair<Integer, Long> pairA04 = A04(av, true);
        try {
            try {
                if (pairA04 == null) {
                    fyA0L = new FY(A00());
                    jLongValue = -9223372036854775807L;
                    contentPositionUs = -9223372036854775807L;
                    z = true;
                } else {
                    int iIntValue = ((Integer) pairA04.first).intValue();
                    contentPositionUs = ((Long) pairA04.second).longValue();
                    fyA0L = this.A0K.A0L(iIntValue, contentPositionUs);
                    if (fyA0L.A01()) {
                        jLongValue = 0;
                        String[] strArr = A0W;
                        if (strArr[0].length() == strArr[7].length()) {
                            A0W[3] = "i2wx9svvSsraq7xK4Hb6P8jzWPWvECua";
                            z = true;
                        }
                        throw new RuntimeException();
                    }
                    jLongValue = ((Long) pairA04.second).longValue();
                    z = av.A01 == -9223372036854775807L;
                }
                if (this.A07 != null && this.A01 <= 0) {
                    try {
                        if (jLongValue != -9223372036854775807L) {
                            long jA5e = jLongValue;
                            if (fyA0L.equals(this.A05.A04)) {
                                C0357Ac c0357AcA0G = this.A0K.A0G();
                                String[] strArr2 = A0W;
                                if (strArr2[0].length() == strArr2[7].length()) {
                                    A0W[3] = "hQgZLd0P1yiuMRtM5yatEhywmfTa4Rur";
                                    if (c0357AcA0G != null && jA5e != 0) {
                                        jA5e = c0357AcA0G.A08.A5e(jA5e, this.A06);
                                    }
                                    if (AG.A01(jA5e) == AG.A01(this.A05.A0A)) {
                                        this.A05 = this.A05.A04(fyA0L, this.A05.A0A, contentPositionUs);
                                        if (z) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            long jA02 = A02(fyA0L, jA5e);
                            z |= jLongValue != jA02;
                            jLongValue = jA02;
                        } else {
                            A0N(4);
                            A0o(false, true, false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.A05 = this.A05.A04(fyA0L, jLongValue, contentPositionUs);
                        if (z) {
                            this.A0I.A04(2);
                        }
                        throw th;
                    }
                } else {
                    this.A04 = av;
                }
                this.A05 = this.A05.A04(fyA0L, jLongValue, contentPositionUs);
                if (z) {
                    this.A0I.A04(2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0V(@Nullable C0357Ac c0357Ac) throws AM {
        C0357Ac c0357AcA0G = this.A0K.A0G();
        if (c0357AcA0G == null || c0357Ac == c0357AcA0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            XG[] xgArr = this.A0T;
            if (i2 >= xgArr.length) {
                break;
            }
            XG xg = xgArr[i2];
            zArr[i2] = xg.A7W() != 0;
            if (c0357AcA0G.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!c0357AcA0G.A04.A00(i2) || (xg.A8O() && xg.A7b() == c0357Ac.A0A[i2]))) {
                A0b(xg);
            }
            i2++;
        }
        C0361Ag c0361Ag = this.A05;
        if (A0W[6].charAt(23) == 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = c0361Ag.A05(c0357AcA0G.A03, c0357AcA0G.A04);
        A0p(zArr, i);
    }

    private void A0W(C0362Ah c0362Ah) {
        this.A0G.AEf(c0362Ah);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C0373As c0373As) throws AM {
        if (c0373As.A0D()) {
            return;
        }
        try {
            c0373As.A04().A7z(c0373As.A00(), c0373As.A09());
        } finally {
            c0373As.A0A(true);
        }
    }

    private void A0Y(C0373As c0373As) throws AM {
        if (c0373As.A02() == -9223372036854775807L) {
            A0Z(c0373As);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new AT(c0373As));
            return;
        }
        AT at = new AT(c0373As);
        if (A0r(at)) {
            ArrayList<AT> arrayList = this.A0R;
            String[] strArr = A0W;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0W[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
            arrayList.add(at);
            Collections.sort(this.A0R);
            return;
        }
        c0373As.A0A(false);
    }

    private void A0Z(C0373As c0373As) throws AM {
        if (c0373As.A03().getLooper() == this.A0Q.A6v()) {
            A0X(c0373As);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AER(2);
                return;
            }
            return;
        }
        this.A0Q.A9m(15, c0373As).sendToTarget();
    }

    private void A0a(C0373As c0373As) {
        c0373As.A03().post(new AR(this, c0373As));
    }

    private void A0b(XG xg) throws AM {
        this.A0G.A08(xg);
        A0c(xg);
        xg.A4n();
    }

    private void A0c(XG xg) throws AM {
        if (xg.A7W() == 2) {
            xg.stop();
        }
    }

    private void A0d(C0378Ax c0378Ax) {
        this.A06 = c0378Ax;
    }

    private void A0e(VW vw) {
        if (!this.A0K.A0T(vw)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(VW vw) throws AM {
        if (!this.A0K.A0T(vw)) {
            return;
        }
        C0357Ac c0357AcA0F = this.A0K.A0F();
        c0357AcA0F.A0E(this.A0G.A7E().A01);
        A0i(c0357AcA0F.A03, c0357AcA0F.A04);
        if (!this.A0K.A0P()) {
            A0P(this.A0K.A0C().A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0488Fw
    /* JADX INFO: renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void AAP(VW vw) {
        this.A0Q.A9m(10, vw).sendToTarget();
    }

    private void A0h(InterfaceC0466Fa interfaceC0466Fa, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = interfaceC0466Fa;
        A0N(2);
        interfaceC0466Fa.ADJ(this.A0H, true, this);
        this.A0Q.AER(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, HU hu) {
        this.A0J.ACZ(this.A0T, trackGroupArray, hu.A01);
    }

    private void A0j(boolean z) throws AM {
        FY fy = this.A0K.A0G().A02.A04;
        long jA03 = A03(fy, this.A05.A0A, true);
        long newPositionUs = this.A05.A0A;
        if (jA03 != newPositionUs) {
            C0361Ag c0361Ag = this.A05;
            this.A05 = c0361Ag.A04(fy, jA03, c0361Ag.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws AM {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else {
            if (this.A05.A00 == 3) {
                A0G();
                if (A0W[4].length() == 29) {
                    throw new RuntimeException();
                }
                A0W[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
                this.A0Q.AER(2);
                return;
            }
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AER(2);
        }
    }

    private void A0m(boolean z) throws AM {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACR();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        TrackGroupArray trackGroupArray;
        HU hu;
        InterfaceC0466Fa interfaceC0466Fa;
        this.A0Q.ADw(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (XG renderer : this.A0C) {
            try {
                A0b(renderer);
            } catch (AM | RuntimeException e) {
                Log.e(A06(0, 21, 15), A06(138, 12, 123), e);
            }
        }
        this.A0C = new XG[0];
        C0359Ae c0359Ae = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        c0359Ae.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(B1.A01);
            for (AT at : this.A0R) {
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                at.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        B1 b1 = z3 ? B1.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        FY fy = z2 ? new FY(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            C0361Ag c0361Ag = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = c0361Ag.A05;
            } else {
                String[] strArr3 = A0W;
                strArr3[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr3[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = c0361Ag.A05;
            }
        }
        if (z3) {
            hu = this.A0O;
        } else {
            hu = this.A05.A06;
        }
        this.A05 = new C0361Ag(b1, obj, fy, j, j2, i, false, trackGroupArray, hu);
        if (z && (interfaceC0466Fa = this.A07) != null) {
            interfaceC0466Fa.ADt(this);
            this.A07 = null;
        }
    }

    private void A0p(boolean[] zArr, int i) throws AM {
        this.A0C = new XG[i];
        int enabledRendererCount = 0;
        C0357Ac c0357AcA0G = this.A0K.A0G();
        for (int i2 = 0; i2 < this.A0T.length; i2++) {
            if (c0357AcA0G.A04.A00(i2)) {
                A0O(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0q() {
        C0357Ac c0357AcA0G = this.A0K.A0G();
        long j = c0357AcA0G.A02.A01;
        return j == -9223372036854775807L || this.A05.A0A < j || (c0357AcA0G.A01 != null && (c0357AcA0G.A01.A06 || c0357AcA0G.A01.A02.A04.A01()));
    }

    private boolean A0r(AT at) {
        if (at.A02 == null) {
            Pair<Integer, Long> pairA04 = A04(new AV(at.A03.A08(), at.A03.A01(), AG.A00(at.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            at.A01(((Integer) pairA04.first).intValue(), ((Long) pairA04.second).longValue(), this.A05.A03.A0A(((Integer) pairA04.first).intValue(), this.A0L, true).A03);
        } else {
            int iA04 = this.A05.A03.A04(at.A02);
            if (iA04 == -1) {
                return false;
            }
            at.A00 = iA04;
        }
        return true;
    }

    private boolean A0s(XG xg) {
        C0357Ac c0357AcA0H = this.A0K.A0H();
        return c0357AcA0H.A01 != null && c0357AcA0H.A01.A06 && xg.A84();
    }

    private boolean A0t(FY fy, long j, C0357Ac c0357Ac) {
        if (fy.equals(c0357Ac.A02.A04) && c0357Ac.A06) {
            this.A05.A03.A09(c0357Ac.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j);
            if (iA04 == -1 || this.A0L.A09(iA04) == c0357Ac.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[PHI: r3
      0x006a: PHI (r3v2 long) = (r3v1 long), (r3v4 long) binds: [B:25:0x009e, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0u(boolean r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.XG[] r0 = r7.A0C
            int r0 = r0.length
            if (r0 != 0) goto La
            boolean r0 = r7.A0q()
            return r0
        La:
            r6 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L23
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L23:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "XitCw2lYTMNoWfZ3MNfhmS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pjSmPGutCkFid20LDJR8Tk"
            r0 = 7
            r2[r0] = r1
            if (r8 != 0) goto L32
            return r6
        L32:
            com.facebook.ads.redexgen.X.Ag r0 = r7.A05
            boolean r0 = r0.A08
            r3 = 1
            if (r0 != 0) goto L3a
            return r3
        L3a:
            com.facebook.ads.redexgen.X.Ae r0 = r7.A0K
            com.facebook.ads.redexgen.X.Ac r5 = r0.A0F()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "c9QtbAseiMx42ehTAZ"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Ad r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
        L6a:
            com.facebook.ads.redexgen.X.Ab r2 = r7.A0J
            long r0 = r7.A03
            long r0 = r5.A08(r0)
            long r3 = r3 - r0
            com.facebook.ads.redexgen.X.XJ r0 = r7.A0G
            com.facebook.ads.redexgen.X.Ah r0 = r0.A7E()
            float r1 = r0.A01
            boolean r0 = r7.A09
            boolean r0 = r2.AEo(r3, r1, r0)
            if (r0 == 0) goto L84
        L83:
            r6 = 1
        L84:
            return r6
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E1.A0W
            java.lang.String r1 = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6"
            r0 = 2
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Ad r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E1.A0u(boolean):boolean");
    }

    @NonNull
    public static Format[] A0v(HQ hq) {
        int length = hq != null ? hq.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = hq.A6h(i);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AER(7);
        boolean z = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(B1 b1, int i, long j) {
        this.A0Q.A9m(3, new AV(b1, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC0466Fa interfaceC0466Fa, boolean z, boolean z2) {
        this.A0Q.A9l(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC0466Fa).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.A9k(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A9k(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void ABo(C0362Ah c0362Ah) {
        this.A0E.obtainMessage(1, c0362Ah).sendToTarget();
        A0L(c0362Ah.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VX
    public final void ABw(VW vw) {
        this.A0Q.A9m(9, vw).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.FZ
    public final void ACM(InterfaceC0466Fa interfaceC0466Fa, B1 b1, Object obj) {
        this.A0Q.A9m(8, new AS(interfaceC0466Fa, b1, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0371Aq
    public final synchronized void AET(C0373As c0373As) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            c0373As.A0A(false);
        } else {
            this.A0Q.A9m(14, c0373As).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0466Fa) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((AV) message.obj);
                    break;
                case 4:
                    A0W((C0362Ah) message.obj);
                    break;
                case 5:
                    A0d((C0378Ax) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((AS) message.obj);
                    break;
                case 9:
                    A0f((VW) message.obj);
                    break;
                case 10:
                    A0e((VW) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C0373As) message.obj);
                    break;
                case 15:
                    A0a((C0373As) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (AM e) {
            Log.e(strA06, A06(110, 15, 0), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(strA06, A06(125, 13, 87), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, AM.A00(e2)).sendToTarget();
            if (A0W[6].charAt(23) != 'j') {
                A0W[5] = "BLVAUEtDSJNWXrvjpr";
                A0A();
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e3) {
            Log.e(strA06, A06(87, 23, 108), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, AM.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
