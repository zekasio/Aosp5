package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1261eO {

    @Nullable
    public InterfaceC1264eR A00;

    @Nullable
    public InterfaceC1262eP A01;
    public C1249eC A02;
    public final InterfaceC1271eY A03;

    @Nullable
    public final InterfaceC1263eQ A04;

    public C1261eO(InterfaceC1271eY interfaceC1271eY, @Nullable InterfaceC1263eQ interfaceC1263eQ) {
        this.A03 = interfaceC1271eY;
        this.A04 = interfaceC1263eQ;
    }

    public static C1261eO A00() {
        return new C1261eO(new GO(), null);
    }

    private void A01(AbstractC1265eS abstractC1265eS, InterfaceC1269eW interfaceC1269eW, GL gl) {
        this.A02 = C1249eC.A00(abstractC1265eS, interfaceC1269eW, gl);
        InterfaceC1264eR interfaceC1264eR = this.A00;
        if (interfaceC1264eR != null) {
            this.A02.A03(interfaceC1264eR);
        }
        InterfaceC1262eP interfaceC1262eP = this.A01;
        if (interfaceC1262eP != null) {
            this.A02.A04(interfaceC1262eP);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C1267eU c1267eU) {
        this.A02.A02(view, c1267eU);
    }

    public final void A04(AbstractC1265eS abstractC1265eS, View view) {
        GN gn = new GN(view, this.A03);
        final InterfaceC1263eQ interfaceC1263eQ = this.A04;
        A01(abstractC1265eS, gn, new GL(interfaceC1263eQ) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A07;
            public static String[] A08 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A09;
            public long A00;

            @Nullable
            public InterfaceC1264eR A01;

            @Nullable
            public final InterfaceC1263eQ A02;
            public final Map<String, C1253eG> A06 = new HashMap();
            public final C1254eH A04 = new C1254eH();
            public final C1254eH A03 = new C1254eH();
            public final List<Rect> A05 = new ArrayList(1);

            public static String A02(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A03() {
                A07 = new byte[]{41, Ascii.NAK, Ascii.DC4, Ascii.SO, 93, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.CR, Ascii.DC2, Ascii.DC4, 19, 9, 93, Ascii.NAK, Ascii.FS, Ascii.SO, 93, 19, Ascii.DC2, 9, 93, Ascii.US, Ascii.CAN, Ascii.CAN, 19, 93, Ascii.DLE, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.EM, 93, Ascii.DC2, Ascii.SI, 93, Ascii.DC4, Ascii.SO, 93, Ascii.FS, 93, Ascii.SUB, Ascii.SI, Ascii.DC2, 8, Ascii.CR, 93, 10, Ascii.NAK, Ascii.DC4, Ascii.RS, Ascii.NAK, 93, 10, Ascii.DC4, 17, 17, 93, 19, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.SI, 93, Ascii.SI, Ascii.CAN, 9, 8, Ascii.SI, 19, 93, Ascii.FS, 93, Ascii.DLE, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.DLE, Ascii.CAN, 19, 9, 93, Ascii.SO, Ascii.DC4, 19, Ascii.RS, Ascii.CAN, 93, Ascii.DC4, 9, 90, Ascii.SO, 93, Ascii.DLE, Ascii.FS, Ascii.EM, Ascii.CAN, 93, 8, Ascii.CR, 93, Ascii.DC2, Ascii.ESC, 93, Ascii.SO, 8, Ascii.US, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.SO, 93, 9, Ascii.NAK, Ascii.FS, 9, 93, Ascii.RS, Ascii.DC2, 8, 17, Ascii.EM, 93, Ascii.US, Ascii.CAN, 93, Ascii.DC2, Ascii.ESC, Ascii.ESC, Ascii.SO, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CAN, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A09 = C01943g.class.getSimpleName();
            }

            {
                this.A02 = interfaceC1263eQ;
            }

            public static Rect A00(@Nullable C1253eG c1253eG) {
                if (c1253eG != null && c1253eG.A02.top != Integer.MIN_VALUE && c1253eG.A02.left != Integer.MIN_VALUE) {
                    Rect rect = c1253eG.A02;
                    String[] strArr = A08;
                    if (strArr[1].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A08;
                    strArr2[1] = "p";
                    strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                    if (rect.right != Integer.MIN_VALUE && c1253eG.A02.bottom != Integer.MIN_VALUE) {
                        return c1253eG.A02;
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1253eG A01(C1267eU c1267eU, Rect rect, Rect rect2) {
                C1253eG c1253eGA03 = this.A06.get(c1267eU.A03);
                if (this.A04.A06(c1267eU)) {
                    if (c1253eGA03 != null) {
                        c1253eGA03.A01 = EnumC1257eK.A04;
                    } else {
                        c1253eGA03 = C1253eG.A03(this.A00);
                        this.A06.put(c1267eU.A03, c1253eGA03);
                    }
                }
                c1253eGA03.A02.set(rect2);
                c1253eGA03.A03.add(new Rect(rect));
                return c1253eGA03;
            }

            private void A04(C1254eH c1254eH) {
                for (C1267eU c1267eU : c1254eH.A01()) {
                    C1253eG c1253eG = this.A06.get(c1267eU.A03);
                    if (c1253eG == null) {
                        InterfaceC1263eQ interfaceC1263eQ2 = this.A02;
                        String[] strArr = A08;
                        if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                        strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                        if (interfaceC1263eQ2 != null) {
                            String str = A02(150, 36, 10) + c1267eU.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1253eG.A01 = EnumC1257eK.A03;
                        c1253eG.A03.clear();
                        c1267eU.A03(this);
                    }
                }
            }

            private void A05(C1254eH c1254eH) {
                Iterator it = c1254eH.A00().iterator();
                while (it.hasNext()) {
                    ((C1267eU) it.next()).A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A3J(C1267eU c1267eU, Rect rect, Rect rect2) {
                A01(c1267eU, rect, rect2);
                C1267eU c1267eU2 = c1267eU.A00;
                if (c1267eU2 == C1267eU.A06) {
                    return;
                }
                boolean zA06 = this.A03.A06(c1267eU2);
                C1253eG c1253eGA03 = this.A06.get(c1267eU2.A03);
                if (zA06) {
                    if (c1253eGA03 == null) {
                        c1253eGA03 = C1253eG.A03(this.A00);
                        c1253eGA03.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c1267eU2.A03, c1253eGA03);
                    } else {
                        c1253eGA03.A03.clear();
                        c1253eGA03.A01 = EnumC1257eK.A04;
                    }
                }
                c1253eGA03.A03.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A3q(long j, List<Rect> list) {
                this.A00 = j;
                this.A05.clear();
                Iterator<Rect> it = list.iterator();
                while (it.hasNext()) {
                    this.A05.add(new Rect(it.next()));
                }
                Iterator it2 = this.A04.A01().iterator();
                while (it2.hasNext()) {
                    this.A06.remove(((C1267eU) it2.next()).A03);
                }
                Iterator it3 = this.A03.A01().iterator();
                while (it3.hasNext()) {
                    this.A06.remove(((C1267eU) it3.next()).A03);
                }
                Iterator<C1253eG> it4 = this.A06.values().iterator();
                while (it4.hasNext()) {
                    it4.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A5E() {
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    new C1252eF(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1256eJ
            public final void A6j(C1267eU c1267eU, Rect rect) {
                rect.setEmpty();
                Iterator it = this.A06.get(c1267eU.A03).A03.iterator();
                while (it.hasNext()) {
                    rect.union((Rect) it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1256eJ
            public final EnumC1257eK A7o(C1267eU c1267eU) {
                return this.A06.get(c1267eU.A03).A01;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1256eJ
            public final void A7q(Rect rect) {
                rect.setEmpty();
                Iterator<Rect> it = this.A05.iterator();
                while (it.hasNext()) {
                    rect.union(it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1256eJ
            public final float A7r(C1267eU c1267eU) {
                C1253eG c1253eG = this.A06.get(c1267eU.A03);
                if (c1253eG != null) {
                    Rect rectA00 = A00(c1253eG);
                    int iHeight = rectA00.height() * rectA00.width();
                    int i = 0;
                    for (Rect rect : c1253eG.A03) {
                        int totalPossibleArea = rect.height();
                        int totalVisibleArea = rect.width();
                        i += totalPossibleArea * totalVisibleArea;
                    }
                    return i / iHeight;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void AEk(@Nullable InterfaceC1264eR interfaceC1264eR) {
                this.A01 = interfaceC1264eR;
            }
        });
    }
}
