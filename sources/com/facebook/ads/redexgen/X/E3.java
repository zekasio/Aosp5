package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E3 implements XH {
    public static byte[] A0M;
    public static String[] A0N = {"FdQu0fmyjo2y", "53g7H5tUmq98heWq", "c", "OWB4F6Jbct6Ly4JY", "NHyc4CVBcI41", "VuRuzyUBfoaB1KqcrIY9ro", "m", "Ea4pNsdJDJP"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Nullable
    public AM A05;
    public C0361Ag A06;
    public C0362Ah A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final E1 A0E;
    public final C0379Az A0F;
    public final B0 A0G;
    public final HT A0H;
    public final HU A0I;
    public final ArrayDeque<AQ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0365Ak> A0K;
    public final XG[] A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0N[7].length() == 1) {
                throw new RuntimeException();
            }
            A0N[7] = "NVWBbKH";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 75);
            i4++;
        }
    }

    public static void A03() {
        A0M = new byte[]{108, Ascii.ETB, 126, 67, 84, 107, 87, 90, 66, 94, 73, 114, 86, 75, 87, 64, 125, 106, 85, 105, 100, 124, 96, 119, 73, 108, 103, 42, 55, 43, 61, 43, 49, 54, 17, Ascii.SYN, Ascii.VT, 95, Ascii.ESC, 44, 37, 44, 40, 58, 44, 105, 64, 72, 53, 78, 50, 36, 36, 42, Ascii.NAK, 46, 97, 40, 38, 47, 46, 51, 36, 37, 97, 35, 36, 34, 32, 52, 50, 36, 97, 32, 47, 97, 32, 37, 97, 40, 50, 97, 49, 45, 32, 56, 40, 47, 38};
    }

    static {
        A03();
    }

    @SuppressLint({"HandlerLeak"})
    public E3(XG[] xgArr, HT ht, InterfaceC0356Ab interfaceC0356Ab, IN in) {
        Log.i(A02(2, 13, 112), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 7) + A02(15, 18, 78) + A02(47, 3, 94) + C0567Iz.A04 + A02(46, 1, 86));
        IK.A04(xgArr.length > 0);
        this.A0L = (XG[]) IK.A01(xgArr);
        this.A0H = (HT) IK.A01(ht);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new HU(new C0376Av[xgArr.length], new HQ[xgArr.length], null);
        this.A0G = new B0();
        this.A0F = new C0379Az();
        this.A07 = C0362Ah.A04;
        this.A0C = new AP(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A06 = new C0361Ag(B1.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new E1(xgArr, ht, this.A0I, interfaceC0356Ab, this.A0A, this.A03, this.A0B, this.A0C, this, in);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j) {
        long jA01 = AG.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return jA01 + this.A0F.A08();
        }
        return jA01;
    }

    private C0361Ag A01(boolean z, boolean z2, int i) {
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6I();
            this.A00 = A07();
            this.A04 = A6F();
        }
        C0361Ag c0361Ag = new C0361Ag(z2 ? B1.A01 : this.A06.A03, z2 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i, false, z2 ? TrackGroupArray.A04 : this.A06.A05, z2 ? this.A0I : this.A06.A06);
        String[] strArr = A0N;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0N[7] = "Xqr2ExcYOBi8j1Q";
        return c0361Ag;
    }

    private void A04(C0361Ag c0361Ag, int i, boolean z, int timelineChangeReason) {
        int i2;
        C0361Ag c0361AgA04 = c0361Ag;
        this.A02 -= i;
        if (this.A02 == 0) {
            if (c0361AgA04.A02 == -9223372036854775807L) {
                c0361AgA04 = c0361AgA04.A04(c0361AgA04.A04, 0L, c0361AgA04.A01);
            }
            if (!this.A06.A03.A0E() || this.A08) {
                B1 b1 = c0361AgA04.A03;
                String[] strArr = A0N;
                if (strArr[1].length() == strArr[3].length()) {
                    A0N[7] = "oGDG41JiAsT7PCq0";
                    if (b1.A0E()) {
                        this.A00 = 0;
                        this.A01 = 0;
                        String[] strArr2 = A0N;
                        if (strArr2[6].length() == strArr2[2].length()) {
                            String[] strArr3 = A0N;
                            strArr3[1] = "vrOcQin3pszluGLq";
                            strArr3[3] = "REI4M31lEJcbEC2a";
                            this.A04 = 0L;
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (this.A08) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c0361AgA04, z, timelineChangeReason, i2, z2, false);
        }
    }

    private void A05(C0361Ag c0361Ag, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.A0J.isEmpty();
        this.A0J.addLast(new AQ(c0361Ag, this.A06, this.A0K, this.A0H, z, i, i2, z2, this.A0A, z3));
        this.A06 = c0361Ag;
        if (z4) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, -9223372036854775807L);
    }

    public final void A09(int i, long j) {
        long jA00;
        B1 b1 = this.A06.A03;
        if (i >= 0) {
            boolean zA0E = b1.A0E();
            if (A0N[5].length() == 22) {
                String[] strArr = A0N;
                strArr[6] = "k";
                strArr[2] = "F";
                if (zA0E || i < b1.A01()) {
                    this.A09 = true;
                    this.A02++;
                    boolean zA0B = A0B();
                    if (A0N[7].length() != 1) {
                        String[] strArr2 = A0N;
                        strArr2[1] = "iOLxdGxzjtj8VTTv";
                        strArr2[3] = "k2rTYfByBhCiNj1b";
                        if (zA0B) {
                            String strA02 = A02(2, 13, 112);
                            String[] strArr3 = A0N;
                            if (strArr3[4].length() == strArr3[0].length()) {
                                A0N[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                Log.w(strA02, A02(50, 39, 10));
                                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                                return;
                            }
                        } else {
                            this.A01 = i;
                            if (b1.A0E()) {
                                if (A0N[7].length() == 1) {
                                    throw new RuntimeException();
                                }
                                A0N[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                this.A04 = j == -9223372036854775807L ? 0L : j;
                                this.A00 = 0;
                            } else {
                                if (j == -9223372036854775807L) {
                                    jA00 = b1.A0B(i, this.A0G).A01();
                                } else {
                                    jA00 = AG.A00(j);
                                }
                                Pair<Integer, Long> pairA07 = b1.A07(this.A0G, this.A0F, i, jA00);
                                this.A04 = AG.A01(jA00);
                                this.A00 = ((Integer) pairA07.first).intValue();
                            }
                            this.A0E.A0y(b1, i, AG.A00(j));
                            for (InterfaceC0365Ak interfaceC0365Ak : this.A0K) {
                                String[] strArr4 = A0N;
                                if (strArr4[4].length() != strArr4[0].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0N;
                                strArr5[1] = "l5NWk5x9vooO50uu";
                                strArr5[3] = "FcAzQ8glamB386Jq";
                                interfaceC0365Ak.ABu(1);
                            }
                            return;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new C0355Aa(b1, i, j);
    }

    public final void A0A(Message message) {
        int i = message.what;
        if (i == 0) {
            A04((C0361Ag) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i != 1) {
            String[] strArr = A0N;
            if (strArr[4].length() == strArr[0].length()) {
                A0N[5] = "7KT5lT3IIkvardi0cOE285";
                if (i == 2) {
                    AM am = (AM) message.obj;
                    this.A05 = am;
                    Iterator<InterfaceC0365Ak> it = this.A0K.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        String[] strArr2 = A0N;
                        if (strArr2[4].length() != strArr2[0].length()) {
                            throw new RuntimeException();
                        }
                        A0N[7] = "lr70Wm3MPuK1";
                        if (zHasNext) {
                            it.next().ABq(am);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            C0362Ah c0362Ah = (C0362Ah) message.obj;
            if (!this.A07.equals(c0362Ah)) {
                this.A07 = c0362Ah;
                CopyOnWriteArraySet<InterfaceC0365Ak> copyOnWriteArraySet = this.A0K;
                String[] strArr3 = A0N;
                if (strArr3[6].length() == strArr3[2].length()) {
                    String[] strArr4 = A0N;
                    strArr4[1] = "XPkhdR3hZ8JGZkbg";
                    strArr4[3] = "HitM1md97HqEAHyx";
                    Iterator<InterfaceC0365Ak> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().ABo(c0362Ah);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void A3E(InterfaceC0365Ak interfaceC0365Ak) {
        this.A0K.add(interfaceC0365Ak);
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final C0373As A4L(InterfaceC0372Ar interfaceC0372Ar) {
        return new C0373As(this.A0E, interfaceC0372Ar, this.A06.A03, A6I(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A5r() {
        long jA5s = A5s();
        long jA6R = A6R();
        if (jA5s != -9223372036854775807L) {
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "7";
            strArr2[2] = "n";
            if (jA6R != -9223372036854775807L) {
                String[] strArr3 = A0N;
                if (strArr3[4].length() != strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0N;
                strArr4[6] = "w";
                strArr4[2] = "D";
                if (jA6R == 0) {
                    return 100;
                }
                return C0567Iz.A06((int) ((100 * jA5s) / jA6R), 0, 100);
            }
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A5s() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A6A() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + AG.A01(this.A06.A01);
        }
        return A6F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A6C() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A6D() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A6F() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final B1 A6H() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A6I() {
        if (A06()) {
            return this.A01;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A6R() {
        B1 b1 = this.A06.A03;
        if (b1.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            FY fy = this.A06.A04;
            b1.A09(fy.A02, this.A0F);
            return AG.A01(this.A0F.A0A(fy.A00, fy.A01));
        }
        return b1.A0B(A6I(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final boolean A7D() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final void ADH(InterfaceC0466Fa interfaceC0466Fa, boolean z, boolean z2) {
        this.A05 = null;
        C0361Ag c0361AgA01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(interfaceC0466Fa, z, z2);
        A05(c0361AgA01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void ADm() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(38, 8, 2));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(A02(0, 2, 7));
        sb.append(A02(15, 18, 78));
        String strA02 = A02(47, 3, 94);
        sb.append(strA02);
        sb.append(C0567Iz.A04);
        sb.append(strA02);
        sb.append(AW.A00());
        sb.append(A02(46, 1, 86));
        Log.i(A02(2, 13, 112), sb.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AEN(long j) {
        A09(A6I(), j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AEO() {
        A08(A6I());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AEe(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AF4(boolean z) {
        if (z) {
            this.A05 = null;
        }
        C0361Ag c0361AgA01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(c0361AgA01, false, 4, 1, false, false);
    }
}
