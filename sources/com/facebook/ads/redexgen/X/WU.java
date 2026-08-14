package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WU implements InterfaceC0407Cc {
    public static byte[] A0X;
    public static String[] A0Y = {"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", "o", "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    public static final InterfaceC0410Cf A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC0409Ce A0C;
    public DF A0D;
    public C0551Ij A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0417Co[] A0H;
    public InterfaceC0417Co[] A0I;
    public final int A0J;
    public final SparseArray<DF> A0K;

    @Nullable
    public final DrmInitData A0L;

    @Nullable
    public final InterfaceC0417Co A0M;

    @Nullable
    public final DO A0N;
    public final C0551Ij A0O;
    public final C0551Ij A0P;
    public final C0551Ij A0Q;
    public final C0551Ij A0R;

    @Nullable
    public final C0563Iv A0S;
    public final ArrayDeque<C0897Wa> A0T;
    public final ArrayDeque<DE> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, C0918Wv> A04(C0551Ij c0551Ij, long j) throws C0360Af {
        long jA0N;
        long jA0N2;
        c0551Ij.A0Y(8);
        int iA01 = D3.A01(c0551Ij.A08());
        c0551Ij.A0Z(4);
        long jA0M = c0551Ij.A0M();
        if (iA01 == 0) {
            jA0N = c0551Ij.A0M();
            jA0N2 = j + c0551Ij.A0M();
        } else {
            jA0N = c0551Ij.A0N();
            jA0N2 = j + c0551Ij.A0N();
        }
        long jA0F = C0567Iz.A0F(jA0N, 1000000L, jA0M);
        c0551Ij.A0Z(2);
        int iA0I = c0551Ij.A0I();
        int[] iArr = new int[iA0I];
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        long[] jArr3 = new long[iA0I];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A0Y[5] = "s";
        int i = 0;
        long jA0F2 = jA0F;
        while (i < iA0I) {
            int iA08 = c0551Ij.A08();
            if ((Integer.MIN_VALUE & iA08) != 0) {
                throw new C0360Af(A0A(581, 28, 75));
            }
            long jA0M2 = c0551Ij.A0M();
            iArr[i] = Integer.MAX_VALUE & iA08;
            jArr[i] = jA0N2;
            jArr3[i] = jA0F2;
            jA0N += jA0M2;
            jA0F2 = C0567Iz.A0F(jA0N, 1000000L, jA0M);
            jArr2[i] = jA0F2 - jArr3[i];
            c0551Ij.A0Z(4);
            int i2 = iArr[i];
            if (A0Y[3].length() != 6) {
                A0Y[1] = "dhc";
                jA0N2 += (long) i2;
                i += 0;
            } else {
                A0Y[5] = "h";
                jA0N2 += (long) i2;
                i++;
            }
        }
        return Pair.create(Long.valueOf(jA0F), new C0918Wv(iArr, jArr, jArr2, jArr3));
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, Ascii.VT, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, 63, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, Ascii.CR, 78, 66, 88, 67, 89, Ascii.CR, 68, 67, Ascii.CR, 94, 79, 74, 93, Ascii.CR, Ascii.FF, Ascii.DLE, Ascii.CR, Ascii.FS, Ascii.CR, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, Ascii.GS, 41, 58, 60, 54, 62, 53, 47, 62, 63, Ascii.SYN, 43, 111, Ascii.RS, 35, 47, 41, 58, 56, 47, 52, 41, 4, 42, 35, 34, 63, 36, 35, 42, 109, 35, 40, 42, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, Ascii.VT, Ascii.FF, 38, Ascii.SI, Ascii.VT, Ascii.FF, 74, Ascii.VT, Ascii.RS, 5, 7, 74, Ascii.GS, 3, Ascii.RS, 2, 74, 6, Ascii.SI, 4, Ascii.CR, Ascii.RS, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, Ascii.US, 4, Ascii.EM, Ascii.US, Ascii.SUB, Ascii.SUB, 5, Ascii.CAN, Ascii.RS, Ascii.SI, Ascii.SO, 67, 68, 97, 72, 67, 74, 89, 69, Ascii.CR, 64, 68, 94, 64, 76, 89, 78, 69, Ascii.ETB, Ascii.CR, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, Ascii.SYN, 63, 63, 42, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, 63, 121, 52, 61, 56, 45, 121, 46, 56, 42, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, 127, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, 127, 53, 107, 83, 81, 72, 72, 93, 92, Ascii.CAN, 72, 75, 75, 80, Ascii.CAN, 89, 76, 87, 85, Ascii.CAN, Ascii.DLE, 94, 89, 81, 84, 93, 92, Ascii.CAN, 76, 87, Ascii.CAN, 93, 64, 76, 74, 89, 91, 76, Ascii.CAN, 77, 77, 81, 92, 17, 105, 81, 83, 74, 74, 83, 84, 93, Ascii.SUB, 91, 78, 85, 87, Ascii.SUB, 77, 83, 78, 82, Ascii.SUB, 86, 95, 84, 93, 78, 82, Ascii.SUB, 4, Ascii.SUB, 8, Ascii.VT, Ascii.SO, Ascii.CR, Ascii.SO, 2, 9, Ascii.FF, Ascii.SO, Ascii.CR, Ascii.SUB, Ascii.DC2, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 19, Ascii.DC4, Ascii.VT, 48, 59, 38, 46, 59, 61, 42, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 121, 107, 99, 101, 42, 111, 100, 126, 120, 115, 42, 105, 101, 127, 100, 126, 48, 42, 75, 112, 118, 127, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, Ascii.RS, Ascii.CR, Ascii.SYN, Ascii.RS, Ascii.GS, 19, Ascii.SUB, 95, 19, Ascii.SUB, 17, Ascii.CAN, Ascii.VT, Ascii.ETB, 95, Ascii.ESC, Ascii.SUB, Ascii.FF, Ascii.FS, Ascii.CR, Ascii.SYN, Ascii.SI, Ascii.VT, Ascii.SYN, Ascii.DLE, 17, 95, Ascii.SYN, 17, 95, Ascii.FF, Ascii.CAN, Ascii.SI, Ascii.ESC, 95, Ascii.EM, Ascii.DLE, 10, 17, Ascii.ESC, 95, 87, 10, 17, Ascii.FF, 10, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 86, 3, Ascii.DC2, Ascii.DC2, Ascii.SO, Ascii.VT, 1, 3, Ascii.SYN, Ascii.VT, Ascii.CR, Ascii.FF, 77, Ascii.SUB, 79, 7, Ascii.SI, 17, 5, 62, 40, 36, 42, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, 127};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0M(C0897Wa c0897Wa, SparseArray<DF> sparseArray, int i, byte[] bArr) throws C0360Af {
        DF dfA09 = A09(c0897Wa.A07(D3.A1I).A00, sparseArray);
        if (dfA09 == null) {
            return;
        }
        DQ dq = dfA09.A07;
        long jA02 = dq.A06;
        dfA09.A04();
        if (c0897Wa.A07(D3.A1H) != null && (i & 2) == 0) {
            jA02 = A02(c0897Wa.A07(D3.A1H).A00);
        }
        A0N(c0897Wa, dfA09, jA02, i);
        DP dpA00 = dfA09.A05.A00(dq.A07.A02);
        WZ wzA07 = c0897Wa.A07(D3.A0u);
        if (wzA07 != null) {
            A0P(dpA00, wzA07.A00, dq);
        }
        WZ wzA072 = c0897Wa.A07(D3.A0t);
        if (wzA072 != null) {
            A0S(wzA072.A00, dq);
        }
        WZ wzA073 = c0897Wa.A07(D3.A10);
        if (wzA073 != null) {
            A0T(wzA073.A00, dq);
        }
        WZ wzA074 = c0897Wa.A07(D3.A0x);
        WZ wzA075 = c0897Wa.A07(D3.A11);
        if (wzA074 != null && wzA075 != null) {
            A0V(wzA074.A00, wzA075.A00, dpA00 != null ? dpA00.A02 : null, dq);
        }
        int size = c0897Wa.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            WZ wz = c0897Wa.A02.get(i2);
            int i3 = ((D3) wz).A00;
            int i4 = D3.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i3 == i4) {
                A0U(wz.A00, dq, bArr);
            }
        }
    }

    static {
        A0D();
        A0Z = new WV();
        A0a = C0567Iz.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public WU() {
        this(0);
    }

    public WU(int i) {
        this(i, null);
    }

    public WU(int i, @Nullable C0563Iv c0563Iv) {
        this(i, c0563Iv, null, null);
    }

    public WU(int i, @Nullable C0563Iv c0563Iv, @Nullable DO r9, @Nullable DrmInitData drmInitData) {
        this(i, c0563Iv, r9, drmInitData, Collections.emptyList());
    }

    public WU(int i, @Nullable C0563Iv c0563Iv, @Nullable DO r10, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0563Iv, r10, drmInitData, closedCaptionFormats, null);
    }

    public WU(int i, @Nullable C0563Iv c0563Iv, @Nullable DO r6, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable InterfaceC0417Co interfaceC0417Co) {
        this.A0J = (r6 != null ? 8 : 0) | i;
        this.A0S = c0563Iv;
        this.A0N = r6;
        this.A0L = drmInitData;
        List<Format> closedCaptionFormats = Collections.unmodifiableList(list);
        this.A0V = closedCaptionFormats;
        this.A0M = interfaceC0417Co;
        this.A0O = new C0551Ij(16);
        this.A0R = new C0551Ij(C0547If.A03);
        this.A0Q = new C0551Ij(5);
        this.A0P = new C0551Ij();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.X.DF r28, int r29, long r30, int r32, com.facebook.ads.redexgen.X.C0551Ij r33, int r34) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WU.A00(com.facebook.ads.redexgen.X.DF, int, long, int, com.facebook.ads.redexgen.X.Ij, int):int");
    }

    public static long A01(C0551Ij c0551Ij) {
        c0551Ij.A0Y(8);
        int version = D3.A01(c0551Ij.A08());
        return version == 0 ? c0551Ij.A0M() : c0551Ij.A0N();
    }

    public static long A02(C0551Ij c0551Ij) {
        c0551Ij.A0Y(8);
        return D3.A01(c0551Ij.A08()) == 1 ? c0551Ij.A0N() : c0551Ij.A0M();
    }

    public static Pair<Integer, D9> A03(C0551Ij c0551Ij) {
        c0551Ij.A0Y(12);
        int defaultSampleDuration = c0551Ij.A08();
        int defaultSampleFlags = c0551Ij.A0H() - 1;
        return Pair.create(Integer.valueOf(defaultSampleDuration), new D9(defaultSampleFlags, c0551Ij.A0H(), c0551Ij.A0H(), c0551Ij.A08()));
    }

    public static DrmInitData A05(List<WZ> list) {
        ArrayList arrayList = null;
        int i = list.size();
        for (int i2 = 0; i2 < i; i2++) {
            WZ wz = list.get(i2);
            if (((D3) wz).A00 == D3.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = wz.A00.A00;
                UUID uuidA03 = DL.A03(bArr);
                if (uuidA03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, 109));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private D9 A06(SparseArray<D9> sparseArray, int i) {
        if (sparseArray.size() != 1) {
            return (D9) IK.A01(sparseArray.get(i));
        }
        if (A0Y[7].charAt(27) != 'r') {
            throw new RuntimeException();
        }
        A0Y[3] = "nw8rk4";
        return sparseArray.valueAt(0);
    }

    public static DF A07(SparseArray<DF> sparseArray) {
        DF df = null;
        long j = Long.MAX_VALUE;
        int i = sparseArray.size();
        for (int i2 = 0; i2 < i; i2++) {
            DF dfValueAt = sparseArray.valueAt(i2);
            if (dfValueAt.A02 != dfValueAt.A07.A02) {
                long j2 = dfValueAt.A07.A0G[dfValueAt.A02];
                if (j2 < j) {
                    df = dfValueAt;
                    j = j2;
                }
            }
        }
        return df;
    }

    @Nullable
    public static DF A08(SparseArray<DF> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DF df = sparseArray.get(i);
        if (A0Y[0].length() == 21) {
            throw new RuntimeException();
        }
        A0Y[1] = "fYJ";
        return df;
    }

    public static DF A09(C0551Ij c0551Ij, SparseArray<DF> sparseArray) {
        int iA0H;
        int iA0H2;
        int iA0H3;
        int iA0H4;
        c0551Ij.A0Y(8);
        int iA00 = D3.A00(c0551Ij.A08());
        int trackId = c0551Ij.A08();
        DF dfA08 = A08(sparseArray, trackId);
        if (dfA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0N = c0551Ij.A0N();
            dfA08.A07.A05 = jA0N;
            dfA08.A07.A04 = jA0N;
        }
        D9 d9 = dfA08.A04;
        if ((iA00 & 2) != 0) {
            iA0H = c0551Ij.A0H() - 1;
        } else {
            iA0H = d9.A02;
        }
        int defaultSampleDescriptionIndex = iA00 & 8;
        if (defaultSampleDescriptionIndex != 0) {
            iA0H2 = c0551Ij.A0H();
        } else {
            iA0H2 = d9.A00;
        }
        int defaultSampleDescriptionIndex2 = iA00 & 16;
        if (defaultSampleDescriptionIndex2 != 0) {
            iA0H3 = c0551Ij.A0H();
        } else {
            iA0H3 = d9.A03;
        }
        int defaultSampleSize = iA00 & 32;
        if (defaultSampleSize != 0) {
            iA0H4 = c0551Ij.A0H();
        } else {
            iA0H4 = d9.A01;
        }
        dfA08.A07.A07 = new D9(iA0H, iA0H2, iA0H3, iA0H4);
        return dfA08;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            this.A0I = new InterfaceC0417Co[2];
            int i = 0;
            InterfaceC0417Co interfaceC0417Co = this.A0M;
            if (interfaceC0417Co != null) {
                int emsgTrackOutputCount = 0 + 1;
                this.A0I[0] = interfaceC0417Co;
                i = emsgTrackOutputCount;
            }
            int emsgTrackOutputCount2 = this.A0J;
            if ((emsgTrackOutputCount2 & 4) != 0) {
                InterfaceC0417Co[] interfaceC0417CoArr = this.A0I;
                InterfaceC0409Ce interfaceC0409Ce = this.A0C;
                int emsgTrackOutputCount3 = this.A0K.size();
                interfaceC0417CoArr[i] = interfaceC0409Ce.AFD(emsgTrackOutputCount3, 4);
                i++;
            }
            this.A0I = (InterfaceC0417Co[]) Arrays.copyOf(this.A0I, i);
            for (InterfaceC0417Co interfaceC0417Co2 : this.A0I) {
                interfaceC0417Co2.A5V(A0b);
            }
        }
        if (this.A0H == null) {
            this.A0H = new InterfaceC0417Co[this.A0V.size()];
            for (int i2 = 0; i2 < this.A0H.length; i2++) {
                InterfaceC0417Co interfaceC0417CoAFD = this.A0C.AFD(this.A0K.size() + 1 + i2, 3);
                interfaceC0417CoAFD.A5V(this.A0V.get(i2));
                this.A0H[i2] = interfaceC0417CoAFD;
                String[] strArr = A0Y;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0Y[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
            }
        }
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            DE deRemoveFirst = this.A0U.removeFirst();
            this.A03 -= deRemoveFirst.A00;
            long jA06 = j + deRemoveFirst.A01;
            C0563Iv c0563Iv = this.A0S;
            if (c0563Iv != null) {
                jA06 = c0563Iv.A06(jA06);
            }
            for (InterfaceC0417Co interfaceC0417Co : this.A0I) {
                interfaceC0417Co.AEH(jA06, 1, deRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C0360Af {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        int i = ((int) this.A07) - this.A00;
        C0551Ij c0551Ij = this.A0E;
        if (c0551Ij != null) {
            interfaceC0408Cd.readFully(c0551Ij.A00, 8, i);
            A0O(new WZ(this.A01, this.A0E), interfaceC0408Cd.A7F());
        } else {
            interfaceC0408Cd.AEt(i);
        }
        A0F(interfaceC0408Cd.A7F());
    }

    private void A0H(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        DF dfValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            DQ dq = this.A0K.valueAt(i).A07;
            if (dq.A0B) {
                long j2 = dq.A04;
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[3] = "TcDom5";
                if (j2 < j) {
                    j = dq.A04;
                    dfValueAt = this.A0K.valueAt(i);
                }
            }
        }
        if (dfValueAt == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long jA7F = j - interfaceC0408Cd.A7F();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        A0Y[0] = "Cvsa72edMITB5GhT";
        int bytesToSkip = (int) jA7F;
        if (bytesToSkip >= 0) {
            interfaceC0408Cd.AEt(bytesToSkip);
            dfValueAt.A07.A04(interfaceC0408Cd);
            return;
        }
        throw new C0360Af(A0A(307, 39, 66));
    }

    private void A0I(C0897Wa c0897Wa) throws C0360Af {
        if (((D3) c0897Wa).A00 == D3.A0j) {
            A0K(c0897Wa);
            return;
        }
        if (((D3) c0897Wa).A00 == D3.A0i) {
            A0J(c0897Wa);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        ArrayDeque<C0897Wa> arrayDeque = this.A0T;
        if (A0Y[1].length() != 3) {
            throw new RuntimeException();
        }
        A0Y[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
        arrayDeque.peek().A08(c0897Wa);
    }

    private void A0J(C0897Wa c0897Wa) throws C0360Af {
        A0L(c0897Wa, this.A0K, this.A0J, this.A0W);
        DrmInitData drmInitDataA05 = this.A0L != null ? null : A05(c0897Wa.A02);
        if (drmInitDataA05 != null) {
            int i = this.A0K.size();
            for (int i2 = 0; i2 < i; i2++) {
                this.A0K.valueAt(i2).A06(drmInitDataA05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.A0K.valueAt(i3).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    private void A0K(C0897Wa c0897Wa) throws C0360Af {
        IK.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitDataA05 = this.A0L;
        if (drmInitDataA05 == null) {
            drmInitDataA05 = A05(c0897Wa.A02);
        }
        C0897Wa c0897WaA06 = c0897Wa.A06(D3.A0m);
        SparseArray<D9> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = c0897WaA06.A02.size();
        for (int i = 0; i < size; i++) {
            WZ wz = c0897WaA06.A02.get(i);
            int i2 = ((D3) wz).A00;
            if (i2 == D3.A1M) {
                Pair<Integer, D9> pairA03 = A03(wz.A00);
                int i3 = ((Integer) pairA03.first).intValue();
                sparseArray.put(i3, (D9) pairA03.second);
            } else {
                int i4 = ((D3) wz).A00;
                if (i4 == D3.A0f) {
                    jA01 = A01(wz.A00);
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0897Wa.A01.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C0897Wa c0897Wa2 = c0897Wa.A01.get(i5);
            int i6 = ((D3) c0897Wa2).A00;
            if (i6 == D3.A1L) {
                DO doA0C = D8.A0C(c0897Wa2, c0897Wa.A07(D3.A0n), jA01, drmInitDataA05, (this.A0J & 16) != 0, false);
                if (doA0C != null) {
                    int i7 = doA0C.A00;
                    sparseArray2.put(i7, doA0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() == 0) {
            for (int i8 = 0; i8 < size3; i8++) {
                DO r10 = (DO) sparseArray2.valueAt(i8);
                InterfaceC0409Ce interfaceC0409Ce = this.A0C;
                int i9 = r10.A03;
                DF df = new DF(interfaceC0409Ce.AFD(i8, i9));
                int i10 = r10.A00;
                df.A07(r10, A06(sparseArray, i10));
                SparseArray<DF> sparseArray3 = this.A0K;
                int i11 = r10.A00;
                sparseArray3.put(i11, df);
                this.A08 = Math.max(this.A08, r10.A04);
            }
            A0C();
            if (A0Y[5].length() != 1) {
                throw new RuntimeException();
            }
            A0Y[5] = "d";
            this.A0C.A5D();
            return;
        }
        IK.A04(this.A0K.size() == size3);
        for (int i12 = 0; i12 < size3; i12++) {
            DO r2 = (DO) sparseArray2.valueAt(i12);
            this.A0K.get(r2.A00).A07(r2, A06(sparseArray, r2.A00));
        }
    }

    public static void A0L(C0897Wa c0897Wa, SparseArray<DF> sparseArray, int i, byte[] bArr) throws C0360Af {
        int size = c0897Wa.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0897Wa c0897Wa2 = c0897Wa.A01.get(i2);
            if (((D3) c0897Wa2).A00 == D3.A1K) {
                A0M(c0897Wa2, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(C0897Wa c0897Wa, DF df, long j, int i) {
        int totalSampleCount = 0;
        int trunSampleCount = 0;
        List<WZ> list = c0897Wa.A02;
        int leafChildrenSize = list.size();
        for (int totalSampleCount2 = 0; totalSampleCount2 < leafChildrenSize; totalSampleCount2++) {
            WZ wz = list.get(totalSampleCount2);
            int i2 = ((D3) wz).A00;
            int i3 = D3.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            A0Y[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i2 == i3) {
                C0551Ij c0551Ij = wz.A00;
                c0551Ij.A0Y(12);
                int iA0H = c0551Ij.A0H();
                if (iA0H > 0) {
                    trunSampleCount += iA0H;
                    totalSampleCount++;
                }
            }
        }
        df.A02 = 0;
        df.A00 = 0;
        df.A01 = 0;
        df.A07.A03(totalSampleCount, trunSampleCount);
        int i4 = 0;
        int iA00 = 0;
        if (A0Y[7].charAt(27) == 'r') {
            A0Y[1] = "K2a";
        }
        for (int i5 = 0; i5 < leafChildrenSize; i5++) {
            WZ wz2 = list.get(i5);
            if (((D3) wz2).A00 == D3.A1N) {
                iA00 = A00(df, i4, j, i, wz2.A00, iA00);
                i4++;
            }
        }
    }

    private void A0O(WZ wz, long j) throws C0360Af {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(wz);
            return;
        }
        if (((D3) wz).A00 == D3.A12) {
            Pair<Long, C0918Wv> pairA04 = A04(wz.A00, j);
            this.A0B = ((Long) pairA04.first).longValue();
            this.A0C.AEM((InterfaceC0414Cl) pairA04.second);
            this.A0F = true;
            return;
        }
        if (((D3) wz).A00 != D3.A0P) {
            return;
        }
        A0Q(wz.A00);
    }

    public static void A0P(DP dp, C0551Ij c0551Ij, DQ dq) throws C0360Af {
        int flags = dp.A00;
        c0551Ij.A0Y(8);
        if ((D3.A00(c0551Ij.A08()) & 1) == 1) {
            c0551Ij.A0Z(8);
        }
        int vectorSize = c0551Ij.A0E();
        int iA0H = c0551Ij.A0H();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "qY4fk5";
        if (iA0H == dq.A00) {
            int i = 0;
            if (vectorSize == 0) {
                boolean[] zArr = dq.A0H;
                for (int sampleCount = 0; sampleCount < iA0H; sampleCount++) {
                    int totalSize = c0551Ij.A0E();
                    i += totalSize;
                    zArr[sampleCount] = totalSize > flags;
                }
            } else {
                boolean z = vectorSize > flags;
                int i2 = vectorSize * iA0H;
                i = 0 + i2;
                Arrays.fill(dq.A0H, 0, iA0H, z);
            }
            dq.A02(i);
            return;
        }
        throw new C0360Af(A0A(290, 17, 120) + iA0H + A0A(0, 2, 53) + dq.A00);
    }

    private void A0Q(C0551Ij c0551Ij) {
        InterfaceC0417Co[] interfaceC0417CoArr = this.A0I;
        if (interfaceC0417CoArr == null || interfaceC0417CoArr.length == 0) {
            return;
        }
        c0551Ij.A0Y(12);
        int iA04 = c0551Ij.A04();
        c0551Ij.A0Q();
        c0551Ij.A0Q();
        long jA0M = c0551Ij.A0M();
        long timescale = c0551Ij.A0M();
        long jA0F = C0567Iz.A0F(timescale, 1000000L, jA0M);
        for (InterfaceC0417Co interfaceC0417Co : this.A0I) {
            c0551Ij.A0Y(12);
            interfaceC0417Co.AEG(c0551Ij, iA04);
        }
        long j = this.A0B;
        if (j != -9223372036854775807L) {
            long jA06 = j + jA0F;
            C0563Iv c0563Iv = this.A0S;
            if (c0563Iv != null) {
                jA06 = c0563Iv.A06(jA06);
            }
            for (InterfaceC0417Co interfaceC0417Co2 : this.A0I) {
                interfaceC0417Co2.AEH(jA06, 1, iA04, 0, null);
            }
            return;
        }
        this.A0U.addLast(new DE(jA0F, iA04));
        this.A03 += iA04;
    }

    public static void A0R(C0551Ij c0551Ij, int i, DQ dq) throws C0360Af {
        c0551Ij.A0Y(i + 8);
        int iA00 = D3.A00(c0551Ij.A08());
        if ((iA00 & 1) == 0) {
            boolean z = (iA00 & 2) != 0;
            int iA0H = c0551Ij.A0H();
            int i2 = dq.A00;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (iA0H == i2) {
                Arrays.fill(dq.A0H, 0, iA0H, z);
                int sampleCount = c0551Ij.A04();
                dq.A02(sampleCount);
                dq.A05(c0551Ij);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, 120));
            sb.append(iA0H);
            sb.append(A0A(0, 2, 53));
            int sampleCount2 = dq.A00;
            sb.append(sampleCount2);
            throw new C0360Af(sb.toString());
        }
        throw new C0360Af(A0A(381, 56, 78));
    }

    public static void A0S(C0551Ij c0551Ij, DQ dq) throws C0360Af {
        c0551Ij.A0Y(8);
        int iA08 = c0551Ij.A08();
        if ((D3.A00(iA08) & 1) == 1) {
            c0551Ij.A0Z(8);
        }
        int iA0H = c0551Ij.A0H();
        int flags = A0Y[3].length();
        if (flags != 6) {
            throw new RuntimeException();
        }
        A0Y[3] = "xMtqR0";
        if (iA0H == 1) {
            long jA0M = dq.A04 + (D3.A01(iA08) == 0 ? c0551Ij.A0M() : c0551Ij.A0N());
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[4];
            int flags2 = str.length();
            if (flags2 != str2.length()) {
                String[] strArr2 = A0Y;
                strArr2[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr2[4] = "P5zbNSbq1MUS3wdHf";
                dq.A04 = jA0M;
                return;
            }
            A0Y[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            dq.A04 = jA0M;
            return;
        }
        throw new C0360Af(A0A(552, 29, 95) + iA0H);
    }

    public static void A0T(C0551Ij c0551Ij, DQ dq) throws C0360Af {
        A0R(c0551Ij, 0, dq);
    }

    public static void A0U(C0551Ij c0551Ij, DQ dq, byte[] bArr) throws C0360Af {
        c0551Ij.A0Y(8);
        c0551Ij.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0551Ij, 16, dq);
    }

    public static void A0V(C0551Ij c0551Ij, C0551Ij c0551Ij2, String str, DQ dq) throws C0360Af {
        c0551Ij.A0Y(8);
        int iA08 = c0551Ij.A08();
        if (c0551Ij.A08() != A0a) {
            return;
        }
        if (D3.A01(iA08) == 1) {
            c0551Ij.A0Z(4);
        }
        int iA082 = c0551Ij.A08();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "cve2FA";
        if (iA082 == 1) {
            c0551Ij2.A0Y(8);
            int iA083 = c0551Ij2.A08();
            if (c0551Ij2.A08() != A0a) {
                return;
            }
            int iA01 = D3.A01(iA083);
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            if (iA01 == 1) {
                if (c0551Ij2.A0M() == 0) {
                    throw new C0360Af(A0A(609, 55, 42));
                }
            } else if (iA01 >= 2) {
                c0551Ij2.A0Z(4);
            }
            if (c0551Ij2.A0M() == 1) {
                c0551Ij2.A0Z(1);
                int iA0E = c0551Ij2.A0E();
                int i = (iA0E & 240) >> 4;
                int i2 = iA0E & 15;
                boolean z = c0551Ij2.A0E() == 1;
                if (!z) {
                    return;
                }
                int iA0E2 = c0551Ij2.A0E();
                byte[] bArr = new byte[16];
                int perSampleIvSize = bArr.length;
                c0551Ij2.A0c(bArr, 0, perSampleIvSize);
                int skipByteBlock = A0Y[7].charAt(27);
                if (skipByteBlock != 114) {
                    throw new RuntimeException();
                }
                A0Y[0] = "v2evuoi5ipUorqJI1yS0NRy";
                byte[] bArr2 = null;
                if (z && iA0E2 == 0) {
                    int iA0E3 = c0551Ij2.A0E();
                    bArr2 = new byte[iA0E3];
                    c0551Ij2.A0c(bArr2, 0, iA0E3);
                }
                dq.A0A = true;
                dq.A08 = new DP(z, str, iA0E2, bArr, i, i2, bArr2);
                return;
            }
            throw new C0360Af(A0A(89, 39, 21));
        }
        throw new C0360Af(A0A(50, 39, 120));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0W(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.D3.A0j
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.D3.A1L
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WU.A0Y
            r0 = 2
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto L1b
        L15:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WU.A0Y
            java.lang.String r1 = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r3 = com.facebook.ads.redexgen.X.D3.A0d
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WU.A0Y
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L53
            if (r4 == r3) goto L6a
        L34:
            int r0 = com.facebook.ads.redexgen.X.D3.A0h
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A16
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A0i
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A1K
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.D3.A0m
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WU.A0Y
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L5d
            goto L15
        L53:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WU.A0Y
            java.lang.String r1 = "W"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L6a
            goto L34
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WU.A0Y
            java.lang.String r1 = "P"
            r0 = 5
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A0N
            if (r4 != r0) goto L6c
        L6a:
            r0 = 1
        L6b:
            return r0
        L6c:
            r0 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WU.A0W(int):boolean");
    }

    public static boolean A0X(int i) {
        return i == D3.A0V || i == D3.A0c || i == D3.A0n || i == D3.A12 || i == D3.A1A || i == D3.A1H || i == D3.A1I || i == D3.A1J || i == D3.A1M || i == D3.A1N || i == D3.A0r || i == D3.A0u || i == D3.A0t || i == D3.A10 || i == D3.A1Q || i == D3.A0x || i == D3.A11 || i == D3.A0O || i == D3.A0f || i == D3.A0P;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.InterfaceC0408Cd r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WU.A0Y(com.facebook.ads.redexgen.X.Cd):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0Z(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        DP dpA00;
        int iAEF;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                DF dfA07 = A07(this.A0K);
                if (dfA07 == null) {
                    int iA7F = (int) (this.A09 - interfaceC0408Cd.A7F());
                    if (iA7F >= 0) {
                        interfaceC0408Cd.AEt(iA7F);
                        A0B();
                        return false;
                    }
                    throw new C0360Af(A0A(346, 35, 12));
                }
                int iA7F2 = (int) (dfA07.A07.A0G[dfA07.A02] - interfaceC0408Cd.A7F());
                if (iA7F2 < 0) {
                    Log.w(A0A(128, 22, 14), A0A(150, 40, 24));
                    iA7F2 = 0;
                }
                interfaceC0408Cd.AEt(iA7F2);
                this.A0D = dfA07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                interfaceC0408Cd.AEt(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            DF df = this.A0D;
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[3] = "st8dZG";
            if (df.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC0408Cd.AEt(8);
            }
            this.A04 = this.A0D.A03();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        DQ dq = this.A0D.A07;
        DO r3 = this.A0D.A05;
        InterfaceC0417Co interfaceC0417Co = this.A0D.A06;
        int i4 = this.A0D.A01;
        long jA00 = dq.A00(i4) * 1000;
        C0563Iv c0563Iv = this.A0S;
        if (c0563Iv != null) {
            jA00 = c0563Iv.A06(jA00);
        }
        if (r3.A01 == 0) {
            while (true) {
                int i5 = this.A04;
                int i6 = this.A06;
                if (i5 >= i6) {
                    break;
                }
                this.A04 += interfaceC0417Co.AEF(interfaceC0408Cd, i6 - i5, false);
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i7 = r3.A01 + 1;
            int i8 = 4 - r3.A01;
            while (this.A04 < this.A06) {
                int i9 = this.A05;
                if (i9 == 0) {
                    interfaceC0408Cd.readFully(bArr, i8, i7);
                    this.A0Q.A0Y(i3);
                    this.A05 = this.A0Q.A0H() - i2;
                    this.A0R.A0Y(i3);
                    interfaceC0417Co.AEG(this.A0R, i);
                    interfaceC0417Co.AEG(this.A0Q, i2);
                    this.A0G = this.A0H.length > 0 && C0547If.A0C(r3.A07.A0O, bArr[i]);
                    this.A04 += 5;
                    this.A06 += i8;
                } else {
                    if (this.A0G) {
                        this.A0P.A0W(i9);
                        interfaceC0408Cd.readFully(this.A0P.A00, i3, this.A05);
                        interfaceC0417Co.AEG(this.A0P, this.A05);
                        iAEF = this.A05;
                        int iA02 = C0547If.A02(this.A0P.A00, this.A0P.A07());
                        this.A0P.A0Y(A0A(686, 10, 13).equals(r3.A07.A0O) ? 1 : 0);
                        this.A0P.A0X(iA02);
                        C0500Gi.A03(jA00, this.A0P, this.A0H);
                    } else {
                        iAEF = interfaceC0417Co.AEF(interfaceC0408Cd, i9, false);
                    }
                    this.A04 += iAEF;
                    this.A05 -= iAEF;
                    i = 4;
                    i2 = 1;
                    i3 = 0;
                }
            }
        }
        boolean z = dq.A0I[i4];
        C0416Cn c0416Cn = null;
        int i10 = z;
        if (dq.A0A) {
            int i11 = (z ? 1 : 0) | 1073741824;
            if (dq.A08 != null) {
                dpA00 = dq.A08;
            } else {
                dpA00 = r3.A00(dq.A07.A02);
            }
            c0416Cn = dpA00.A01;
            i10 = i11;
        }
        interfaceC0417Co.AEH(jA00, i10, this.A06, 0, c0416Cn);
        A0E(jA00);
        if (!this.A0D.A08()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A0C = interfaceC0409Ce;
        DO r0 = this.A0N;
        if (r0 != null) {
            DF df = new DF(interfaceC0409Ce.AFD(0, r0.A03));
            df.A07(this.A0N, new D9(0, 0, 0, 0));
            this.A0K.put(0, df);
            A0C();
            this.A0C.A5D();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final int ADX(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        while (true) {
            int i = this.A02;
            if (i != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i == 1) {
                    A0G(interfaceC0408Cd);
                } else if (i != 2) {
                    boolean zA0Z = A0Z(interfaceC0408Cd);
                    if (A0Y[7].charAt(27) == 'r') {
                        A0Y[5] = "b";
                        if (zA0Z) {
                            return 0;
                        }
                    } else if (zA0Z) {
                        return 0;
                    }
                } else {
                    A0H(interfaceC0408Cd);
                }
            } else if (!A0Y(interfaceC0408Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        return DM.A03(interfaceC0408Cd);
    }
}
