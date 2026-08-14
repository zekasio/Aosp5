package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02144b {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C4a A01;
    public AbstractC02224j A04;
    public final /* synthetic */ F9 A08;
    public final ArrayList<AbstractC02244l> A05 = new ArrayList<>();
    public ArrayList<AbstractC02244l> A02 = null;
    public final ArrayList<AbstractC02244l> A06 = new ArrayList<>();
    public final List<AbstractC02244l> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, Ascii.RS, Ascii.RS, 43, Ascii.GS, 44, -14, -53, -48, -62, -21, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, Ascii.DLE, Ascii.SYN, -36, -38, -33, 36, 37, Ascii.DC2, 37, Ascii.SYN, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, Ascii.RS, 19, Ascii.US, Ascii.RS, 35, Ascii.EM, 35, 36, Ascii.NAK, Ascii.RS, 19, 41, -48, Ascii.DC4, Ascii.NAK, 36, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -34, -48, -7, Ascii.RS, 38, 17, Ascii.FS, Ascii.EM, Ascii.DC4, -48, Ascii.EM, 36, Ascii.NAK, Ascii.GS, -48, 32, Ascii.US, 35, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, -48, -13, Ascii.CAN, Ascii.CR, Ascii.EM, Ascii.CAN, Ascii.GS, 19, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CR, 35, -54, Ascii.SO, Ascii.SI, Ascii.RS, Ascii.SI, Ascii.CR, Ascii.RS, Ascii.SI, Ascii.SO, -40, -54, -13, Ascii.CAN, 32, Ascii.VT, Ascii.SYN, 19, Ascii.SO, -54, 32, 19, Ascii.SI, 33, -54, Ascii.DC2, Ascii.EM, Ascii.SYN, Ascii.SO, Ascii.SI, Ascii.FS, -54, Ascii.VT, Ascii.SO, Ascii.VT, Ascii.SUB, Ascii.RS, Ascii.SI, Ascii.FS, -54, Ascii.SUB, Ascii.EM, Ascii.GS, 19, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C02144b(F9 f9) {
        this.A08 = f9;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC02244l A01(int i) {
        int size;
        int iA0D;
        ArrayList<AbstractC02244l> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC02244l abstractC02244l = this.A02.get(i2);
            if (!abstractC02244l.A0i() && abstractC02244l.A0I() == i) {
                abstractC02244l.A0T(32);
                return abstractC02244l;
            }
        }
        if (this.A08.A04.A0B() && (iA0D = this.A08.A00.A0D(i)) > 0 && iA0D < this.A08.A04.A0D()) {
            long jA04 = this.A08.A04.A04(iA0D);
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC02244l abstractC02244l2 = this.A02.get(i3);
                if (!abstractC02244l2.A0i() && abstractC02244l2.A0K() == jA04) {
                    abstractC02244l2.A0T(32);
                    return abstractC02244l2;
                }
            }
        }
        return null;
    }

    private final AbstractC02244l A02(int cacheSize, boolean z) {
        View viewA08;
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            AbstractC02244l abstractC02244l = this.A05.get(i);
            if (!abstractC02244l.A0i() && abstractC02244l.A0I() == cacheSize && !abstractC02244l.A0b() && (this.A08.A0s.A09 || !abstractC02244l.A0c())) {
                abstractC02244l.A0T(32);
                return abstractC02244l;
            }
        }
        if (!z && (viewA08 = this.A08.A01.A08(cacheSize)) != null) {
            AbstractC02244l abstractC02244lA0G = F9.A0G(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0W(viewA08);
                abstractC02244lA0G.A0T(8224);
                return abstractC02244lA0G;
            }
            throw new IllegalStateException(A04(727, 52, 27) + abstractC02244lA0G + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC02244l abstractC02244l2 = this.A06.get(i2);
            if (!abstractC02244l2.A0b() && abstractC02244l2.A0I() == cacheSize) {
                if (!z) {
                    this.A06.remove(i2);
                }
                return abstractC02244l2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.AbstractC02244l A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02144b.A03(long, int, boolean):com.facebook.ads.redexgen.X.4l");
    }

    private final void A06() {
        for (int i = this.A06.size() - 1; i >= 0; i--) {
            A07(i);
        }
        this.A06.clear();
        if (F9.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0d(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                if (strArr[7].charAt(8) == strArr[6].charAt(8)) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC02244l abstractC02244l) {
        if (this.A08.A1s()) {
            View view = abstractC02244l.A0H;
            if (AnonymousClass38.A00(view) == 0) {
                AnonymousClass38.A09(view, 1);
            }
            if (!AnonymousClass38.A0F(view)) {
                abstractC02244l.A0T(16384);
                AnonymousClass38.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC02244l abstractC02244l) {
        if (abstractC02244l.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC02244l.A0H, false);
        }
    }

    private final void A0B(AbstractC02244l abstractC02244l) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        C4H c4h = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC02244l);
        }
    }

    private final boolean A0C(AbstractC02244l abstractC02244l) {
        if (abstractC02244l.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC02244l.A03 >= 0 && abstractC02244l.A03 < this.A08.A04.A0D()) {
            if (this.A08.A0s.A07() || this.A08.A04.A03(abstractC02244l.A03) == abstractC02244l.A0H()) {
                return !this.A08.A04.A0B() || abstractC02244l.A0K() == this.A08.A04.A04(abstractC02244l.A03);
            }
            return false;
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + abstractC02244l + this.A08.A1I());
    }

    private boolean A0D(AbstractC02244l abstractC02244l, int i, int i2, long j) {
        abstractC02244l.A08 = this.A08;
        int iA0H = abstractC02244l.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE) {
            C4a c4a = this.A01;
            String[] strArr = A0A;
            if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4a.A0A(iA0H, nanoTime, j)) {
                return false;
            }
        }
        this.A08.A04.A0A(abstractC02244l, i);
        this.A01.A05(abstractC02244l.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC02244l);
        if (this.A08.A0s.A07()) {
            abstractC02244l.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C4a A0H() {
        if (this.A01 == null) {
            this.A01 = new C4a();
        }
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0235  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.AbstractC02244l A0I(int r21, boolean r22, long r23) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02144b.A0I(int, boolean, long):com.facebook.ads.redexgen.X.4l");
    }

    public final List<AbstractC02244l> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A05.get(i3).A0M();
        }
        ArrayList<AbstractC02244l> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int iCharAt = str.charAt(0);
        int scrapCount = str2.charAt(0);
        if (iCharAt != scrapCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int i4 = 0; i4 < changedScrapCount; i4++) {
                this.A02.get(i4).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC02244l> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C4U c4u = (C4U) this.A06.get(i).A0H.getLayoutParams();
            if (c4u != null) {
                c4u.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0B()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC02244l abstractC02244l = this.A06.get(i);
                if (A0A[0].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC02244l != null) {
                    abstractC02244l.A0T(6);
                    abstractC02244l.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i;
        if (this.A08.A06 != null) {
            C4T c4t = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i = c4t.A00;
            }
            throw new RuntimeException();
        }
        i = 0;
        this.A00 = this.A03 + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            int size2 = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int iCharAt = str.charAt(0);
            int i2 = str2.charAt(0);
            if (iCharAt != i2) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int i3 = this.A00;
            if (size2 > i3) {
                A07(size);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC02244l abstractC02244l = this.A06.get(i3);
            if (abstractC02244l != null && abstractC02244l.A03 >= i) {
                abstractC02244l.A0W(i2, true);
            }
        }
    }

    public final void A0S(int end, int inBetweenOffset) {
        int cachedCount;
        int i;
        int i2;
        if (end < inBetweenOffset) {
            cachedCount = end;
            i = inBetweenOffset;
            i2 = -1;
        } else {
            cachedCount = inBetweenOffset;
            i = end;
            i2 = 1;
        }
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC02244l abstractC02244l = this.A06.get(i3);
            if (abstractC02244l != null && abstractC02244l.A03 >= cachedCount && abstractC02244l.A03 <= i) {
                int i4 = abstractC02244l.A03;
                String[] strArr = A0A;
                if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                if (i4 == end) {
                    abstractC02244l.A0W(inBetweenOffset - end, false);
                } else {
                    abstractC02244l.A0W(i2, false);
                }
            }
        }
    }

    public final void A0T(int cachedCount, int i) {
        int pos;
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            AbstractC02244l abstractC02244l = this.A06.get(size);
            if (abstractC02244l != null && (pos = abstractC02244l.A03) >= cachedCount && pos < i2) {
                abstractC02244l.A0T(2);
                A07(size);
            }
        }
    }

    public final void A0U(int cachedCount, int i, boolean z) {
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            AbstractC02244l abstractC02244l = this.A06.get(size);
            if (abstractC02244l != null) {
                if (abstractC02244l.A03 >= i2) {
                    abstractC02244l.A0W(-i, z);
                } else if (abstractC02244l.A03 >= cachedCount) {
                    abstractC02244l.A0T(8);
                    A07(size);
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        abstractC02244lA0G.A0F = null;
        abstractC02244lA0G.A0G = false;
        abstractC02244lA0G.A0O();
        A0b(abstractC02244lA0G);
    }

    public final void A0W(View view) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G.A0k(12) || !abstractC02244lA0G.A0f() || this.A08.A20(abstractC02244lA0G)) {
            boolean zA0b = abstractC02244lA0G.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!zA0b || abstractC02244lA0G.A0c() || this.A08.A04.A0B()) {
                abstractC02244lA0G.A0X(this, false);
                this.A05.add(abstractC02244lA0G);
                return;
            } else {
                throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
            }
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        abstractC02244lA0G.A0X(this, true);
        this.A02.add(abstractC02244lA0G);
    }

    public final void A0X(View view) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (abstractC02244lA0G.A0d()) {
            abstractC02244lA0G.A0S();
        } else if (abstractC02244lA0G.A0i()) {
            abstractC02244lA0G.A0O();
        }
        A0b(abstractC02244lA0G);
    }

    public final void A0Y(C4H c4h, C4H c4h2, boolean z) {
        A0P();
        A0H().A08(c4h, c4h2, z);
    }

    public final void A0Z(C4a c4a) {
        C4a c4a2 = this.A01;
        if (c4a2 != null) {
            c4a2.A04();
        }
        this.A01 = c4a;
        if (c4a != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC02224j abstractC02224j) {
        this.A04 = abstractC02224j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(com.facebook.ads.redexgen.X.AbstractC02244l r10) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02144b.A0b(com.facebook.ads.redexgen.X.4l):void");
    }

    public final void A0c(AbstractC02244l abstractC02244l) {
        if (abstractC02244l.A0G) {
            this.A02.remove(abstractC02244l);
        } else {
            this.A05.remove(abstractC02244l);
        }
        abstractC02244l.A0F = null;
        abstractC02244l.A0G = false;
        abstractC02244l.A0O();
    }

    public final void A0d(AbstractC02244l abstractC02244l, boolean z) {
        F9.A0t(abstractC02244l);
        if (abstractC02244l.A0k(16384)) {
            abstractC02244l.A0U(0, 16384);
            AnonymousClass38.A0B(abstractC02244l.A0H, null);
        }
        if (z) {
            A0B(abstractC02244l);
        }
        abstractC02244l.A08 = null;
        A0H().A09(abstractC02244l);
    }
}
