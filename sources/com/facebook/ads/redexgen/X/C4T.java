package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4T {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C02053r A01;

    @Nullable
    public AbstractC02194g A02;
    public F9 A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC02274o A0G = new C1127c3(this);
    public final InterfaceC02274o A0H = new C1126c2(this);
    public C02294q A04 = new C02294q(this.A0G);
    public C02294q A05 = new C02294q(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, Ascii.RS, 48, -35, Ascii.SI, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, Ascii.RS, 48, -35, 45, Ascii.RS, 47, 34, 43, 49, -35, Ascii.US, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, Ascii.RS, -35, 47, 34, Ascii.RS, 41, -35, 32, 37, 38, 41, 33, -21, -35, Ascii.DC2, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, Ascii.SO, -70, 7, 9, Ascii.DLE, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, Ascii.FF, 9, 7, -70, 8, 9, 8, -57, -1, Ascii.DC2, 3, Ascii.CR, Ascii.SO, 3, 8, 1, -70, 3, 8, -2, -1, Ascii.DC2, -44, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, 9, Ascii.US, 37, -48, Ascii.GS, 37, 35, 36, -48, Ascii.US, 38, Ascii.NAK, 34, 34, Ascii.EM, Ascii.DC4, Ascii.NAK, -48, Ascii.US, Ascii.RS, -4, 17, 41, Ascii.US, 37, 36, -13, Ascii.CAN, Ascii.EM, Ascii.FS, Ascii.DC4, 34, Ascii.NAK, Ascii.RS, -40, 2, Ascii.NAK, 19, 41, 19, Ascii.FS, Ascii.NAK, 34, -48, 34, Ascii.NAK, 19, 41, 19, Ascii.FS, Ascii.NAK, 34, -36, -48, 3, 36, 17, 36, Ascii.NAK, -48, 35, 36, 17, 36, Ascii.NAK, -39, -48, -78, -56, -50, 121, -58, -50, -52, -51, 121, -56, -49, -66, -53, -53, -62, -67, -66, 121, -52, -58, -56, -56, -51, -63, -84, -68, -53, -56, -59, -59, -83, -56, -87, -56, -52, -62, -51, -62, -56, -57, 121, -51, -56, 121, -52, -50, -55, -55, -56, -53, -51, 121, -52, -58, -56, -56, -51, -63, 121, -52, -68, -53, -56, -59, -59, -62, -57, -64};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract C4U A1s();

    static {
        A08();
    }

    public static int A00(int mode, int size, int i) {
        int mode2 = View.MeasureSpec.getMode(mode);
        int size2 = View.MeasureSpec.getSize(mode);
        if (mode2 == Integer.MIN_VALUE) {
            return Math.min(size2, Math.max(size, i));
        }
        if (mode2 != 1073741824) {
            return Math.max(size, i);
        }
        return size2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            int r6 = r6 - r8
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
            r3 = 0
            r2 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2
            r0 = -1
            if (r10 == 0) goto L5f
            if (r9 < 0) goto L35
            r3 = r9
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2b
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "ru0BYCJI67FO4KgBABZqajada"
            r0 = 6
            r2[r0] = r1
            r2 = 1073741824(0x40000000, float:2.0)
            goto L64
        L35:
            if (r9 != r0) goto L44
            if (r7 == r4) goto L41
            if (r7 == 0) goto L3e
            if (r7 == r5) goto L41
            goto L64
        L3e:
            r3 = 0
            r2 = 0
            goto L64
        L41:
            r3 = r6
            r2 = r7
            goto L64
        L44:
            if (r9 != r1) goto L64
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L5d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "MUtJOOU4WeR0TtYG1JH"
            r0 = 7
            r2[r0] = r1
            r2 = 0
            goto L64
        L5d:
            r2 = 0
            goto L64
        L5f:
            if (r9 < 0) goto L69
            r3 = r9
            r2 = 1073741824(0x40000000, float:2.0)
        L64:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r0
        L69:
            if (r9 != r0) goto L6e
            r3 = r6
            r2 = r7
            goto L64
        L6e:
            if (r9 != r1) goto L64
            r3 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 0
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L25
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "mbdH64CAyADsqDHKi"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uvhJn14mL"
            r0 = 4
            r2[r0] = r1
            if (r7 == r4) goto L90
            if (r7 != r5) goto L93
        L90:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L64
        L93:
            r2 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4T.A01(int, int, int, int, boolean):int");
    }

    private final int A02(View view) {
        return ((C4U) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C4U) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C4U) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C4U) view.getLayoutParams()).A03.top;
    }

    private final int A06(C02144b c02144b, C02214i c02214i) {
        return 0;
    }

    private final void A09(int i) {
        A0C(i, A0t(i));
    }

    private final void A0A(int i) {
        if (A0t(i) != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0B(int i, int i2) {
        View viewA0t = A0t(i);
        if (viewA0t != null) {
            A09(i);
            A0E(viewA0t, i2);
        } else {
            throw new IllegalArgumentException(A07(85, 44, 79) + i + this.A03.toString());
        }
    }

    private void A0C(int i, View view) {
        this.A01.A0C(i);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i) {
        A0F(view, i, (C4U) view.getLayoutParams());
    }

    private final void A0F(View view, int i, C4U c4u) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G.A0c()) {
            this.A03.A0t.A09(abstractC02244lA0G);
        } else {
            C02324t c02324t = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c02324t.A0A(abstractC02244lA0G);
        }
        this.A01.A0H(view, i, c4u, abstractC02244lA0G.A0c());
    }

    private void A0G(View view, int currentIndex, boolean z) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (z || abstractC02244lA0G.A0c()) {
            this.A03.A0t.A09(abstractC02244lA0G);
        } else {
            this.A03.A0t.A0A(abstractC02244lA0G);
        }
        C4U c4u = (C4U) view.getLayoutParams();
        if (abstractC02244lA0G.A0i() || abstractC02244lA0G.A0d()) {
            if (abstractC02244lA0G.A0d()) {
                abstractC02244lA0G.A0S();
            } else {
                abstractC02244lA0G.A0O();
            }
            this.A01.A0H(view, currentIndex, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            F9 f9 = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == f9) {
                int iA07 = this.A01.A07(view);
                if (currentIndex == -1) {
                    currentIndex = this.A01.A05();
                }
                if (iA07 != -1) {
                    if (iA07 != currentIndex) {
                        this.A03.A06.A0B(iA07, currentIndex);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1I());
                }
            } else {
                this.A01.A0I(view, currentIndex, false);
                c4u.A01 = true;
                AbstractC02194g abstractC02194g = this.A02;
                if (abstractC02194g != null && abstractC02194g.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c4u.A02) {
            abstractC02244lA0G.A0H.invalidate();
            c4u.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        F9.A0p(view, rect);
    }

    private void A0J(C02144b c02144b, int i, View view) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G.A0h()) {
            return;
        }
        if (abstractC02244lA0G.A0b() && !abstractC02244lA0G.A0c() && !this.A03.A04.A0B()) {
            A0A(i);
            c02144b.A0b(abstractC02244lA0G);
        } else {
            A09(i);
            c02144b.A0W(view);
            this.A03.A0t.A0C(abstractC02244lA0G);
        }
    }

    private final void A0K(C02144b c02144b, C02214i c02214i, AccessibilityEvent accessibilityEvent) {
        F9 f9 = this.A03;
        if (f9 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!f9.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0D());
    }

    private final void A0L(C02144b c02144b, C02214i c02214i, C3X c3x) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c3x.A0N(8192);
            c3x.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c3x.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c3x.A0R(true);
        }
        c3x.A0P(C3U.A00(A0r(c02144b, c02214i), A0q(c02144b, c02214i), A0P(c02144b, c02214i), A06(c02144b, c02214i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AbstractC02194g abstractC02194g) {
        if (this.A02 == abstractC02194g) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AbstractC02194g abstractC02194g = this.A02;
        return abstractC02194g != null && abstractC02194g.A0F();
    }

    public static boolean A0O(int specMode, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (i2 > 0 && specMode != i2) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= specMode;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == specMode;
        }
        return true;
    }

    private final boolean A0P(C02144b c02144b, C02214i c02214i) {
        return false;
    }

    private final boolean A0Q(C02144b c02144b, C02214i c02214i, int hScroll, Bundle bundle) {
        F9 f9 = this.A03;
        if (f9 == null) {
            return false;
        }
        int iA0X = 0;
        int iA0f = 0;
        if (hScroll == 4096) {
            if (f9.canScrollVertically(1)) {
                iA0X = (A0X() - A0g()) - A0d();
            }
            if (this.A03.canScrollHorizontally(1)) {
                int iA0h = A0h();
                int iA0e = A0e();
                if (A0J[7].length() == 8) {
                    throw new RuntimeException();
                }
                A0J[7] = "6TTpYbQ6a4";
                iA0f = (iA0h - iA0e) - A0f();
            }
        } else if (hScroll == 8192) {
            if (f9.canScrollVertically(-1)) {
                iA0X = -((A0X() - A0g()) - A0d());
            }
            if (this.A03.canScrollHorizontally(-1)) {
                iA0f = -((A0h() - A0e()) - A0f());
            }
        }
        if (iA0X == 0 && iA0f == 0) {
            return false;
        }
        this.A03.scrollBy(iA0f, iA0X);
        return true;
    }

    private final boolean A0R(C02144b c02144b, C02214i c02214i, View view, int i, Bundle bundle) {
        return false;
    }

    private boolean A0S(F9 f9, int parentLeft, int parentTop) {
        View focusedChild = f9.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int iA0e = A0e();
        int iA0g = A0g();
        int iA0h = A0h() - A0f();
        int iA0X = A0X() - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - parentLeft >= iA0h || rect.right - parentLeft <= iA0e || rect.top - parentTop >= iA0X || rect.bottom - parentTop <= iA0g) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0T(F9 f9, View view, View view2) {
        return A0N() || f9.A1u();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int childLeft = A0e();
        int childTop = A0g();
        int offScreenLeft = A0h() - A0f();
        int iA0X = A0X();
        int parentRight = A0d();
        int offScreenRight = iA0X - parentRight;
        int left = view.getLeft();
        int parentRight2 = rect.left;
        int i = left + parentRight2;
        int parentRight3 = view.getScrollX();
        int offScreenBottom = i - parentRight3;
        int top = view.getTop();
        int parentRight4 = rect.top;
        int i2 = top + parentRight4;
        int parentRight5 = view.getScrollY();
        int i3 = i2 - parentRight5;
        int iWidth = rect.width() + offScreenBottom;
        int iHeight = rect.height() + i3;
        int childBottom = offScreenBottom - childLeft;
        int iMin = Math.min(0, childBottom);
        int childBottom2 = i3 - childTop;
        int iMin2 = Math.min(0, childBottom2);
        int offScreenTop = iWidth - offScreenLeft;
        int iMax = Math.max(0, offScreenTop);
        int iMax2 = Math.max(0, iHeight - offScreenRight);
        int parentTop = A0a();
        if (parentTop == 1) {
            if (iMax == 0) {
                iMax = Math.max(iMin, iWidth - offScreenLeft);
            }
        } else {
            iMax = iMin != 0 ? iMin : Math.min(offScreenBottom - childLeft, iMax);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i3 - childTop, iMax2);
        }
        iArr[0] = iMax;
        iArr[1] = iMin2;
        int parentTop2 = A0J[0].charAt(31);
        if (parentTop2 == 112) {
            throw new RuntimeException();
        }
        A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C02053r c02053r = this.A01;
        if (c02053r != null) {
            return c02053r.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        F9 f9 = this.A03;
        C4H adapter = f9 != null ? f9.getAdapter() : null;
        if (adapter != null) {
            return adapter.A0D();
        }
        return 0;
    }

    public final int A0a() {
        return AnonymousClass38.A01(this.A03);
    }

    public final int A0b() {
        return AnonymousClass38.A02(this.A03);
    }

    public final int A0c() {
        return AnonymousClass38.A03(this.A03);
    }

    public final int A0d() {
        F9 f9 = this.A03;
        if (f9 != null) {
            return f9.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        F9 f9 = this.A03;
        if (f9 != null) {
            return f9.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        F9 f9 = this.A03;
        if (f9 != null) {
            return f9.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        F9 f9 = this.A03;
        if (f9 != null) {
            return f9.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C4U) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C4U) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C4U) view.getLayoutParams()).A00();
    }

    public int A0q(C02144b c02144b, C02214i c02214i) {
        F9 f9 = this.A03;
        if (f9 == null || f9.A04 == null || !A24()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    public int A0r(C02144b c02144b, C02214i c02214i) {
        F9 f9 = this.A03;
        if (f9 == null || f9.A04 == null || !A25()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A0s() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.F9 r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L4c
            com.facebook.ads.redexgen.X.3r r4 = r6.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
        L4c:
            return r5
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
            goto L4c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4T.A0s():android.view.View");
    }

    public final View A0t(int i) {
        C02053r c02053r = this.A01;
        if (c02053r != null) {
            return c02053r.A09(i);
        }
        return null;
    }

    public final View A0u(View view, int i) {
        return null;
    }

    public C4U A0v(Context context, AttributeSet attributeSet) {
        return new C4U(context, attributeSet);
    }

    public C4U A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C4U) {
            return new C4U((C4U) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4U((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4U(layoutParams);
    }

    public final void A0x() {
        AbstractC02194g abstractC02194g = this.A02;
        if (abstractC02194g != null) {
            abstractC02194g.A09();
        }
    }

    public final void A0y() {
        F9 f9 = this.A03;
        if (f9 != null) {
            f9.requestLayout();
        }
    }

    public final void A0z(int i) {
        F9 f9 = this.A03;
        if (f9 != null) {
            f9.A1T(i);
        }
    }

    public final void A10(int i) {
        F9 f9 = this.A03;
        if (f9 != null) {
            f9.A1U(i);
        }
    }

    public final void A11(int i, int i2) {
        this.A0C = View.MeasureSpec.getSize(i);
        this.A0D = View.MeasureSpec.getMode(i);
        if (this.A0D == 0 && !F9.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i2);
        this.A0B = View.MeasureSpec.getMode(i2);
        if (this.A0B == 0 && !F9.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int minX, int minY) {
        int maxX = A0W();
        if (maxX == 0) {
            this.A03.A1a(minX, minY);
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < maxX; i5++) {
            View viewA0t = A0t(i5);
            Rect rect = this.A03.A0p;
            A0H(viewA0t, rect);
            int maxY = rect.left;
            if (maxY < i) {
                i = rect.left;
            }
            int maxY2 = rect.right;
            if (maxY2 > i3) {
                i3 = rect.right;
            }
            int maxY3 = rect.top;
            if (maxY3 < i2) {
                i2 = rect.top;
            }
            int maxY4 = rect.bottom;
            if (maxY4 > i4) {
                i4 = rect.bottom;
            }
        }
        this.A03.A0p.set(i, i2, i3, i4);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int length = str.length();
        int maxY5 = str2.length();
        if (length == maxY5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, minX, minY);
    }

    public final void A13(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A14(int i, C02144b c02144b) {
        View viewA0t = A0t(i);
        A0A(i);
        c02144b.A0X(viewA0t);
    }

    public void A15(Rect rect, int i, int i2) {
        A13(A00(i, rect.width() + A0e() + A0f(), A0c()), A00(i2, rect.height() + A0g() + A0d(), A0b()));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i) {
        A0G(view, i, true);
    }

    public final void A19(View view, int i) {
        A0G(view, i, false);
    }

    public final void A1A(View view, int i, int i2) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect rectA1E = this.A03.A1E(view);
        int i3 = i + rectA1E.left + rectA1E.right;
        int i4 = i2 + rectA1E.top + rectA1E.bottom;
        int iA01 = A01(A0h(), A0i(), A0e() + A0f() + c4u.leftMargin + c4u.rightMargin + i3, c4u.width, A24());
        int iA012 = A01(A0X(), A0Y(), A0g() + A0d() + c4u.topMargin + c4u.bottomMargin + i4, c4u.height, A25());
        if (A1a(view, iA01, iA012, c4u)) {
            view.measure(iA01, iA012);
        }
    }

    public final void A1B(View view, int i, int i2, int i3, int i4) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect rect = c4u.A03;
        view.layout(rect.left + i + c4u.leftMargin, rect.top + i2 + c4u.topMargin, (i3 - rect.right) - c4u.rightMargin, (i4 - rect.bottom) - c4u.bottomMargin);
    }

    public final void A1C(View view, C3X c3x) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G != null && !abstractC02244lA0G.A0c() && !this.A01.A0K(abstractC02244lA0G.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c3x);
        }
    }

    public final void A1D(View view, C02144b c02144b) {
        A0D(view);
        c02144b.A0X(view);
    }

    public final void A1E(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C4U) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(rectF.top);
            float f = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(iFloor, iFloor2, (int) Math.ceil(f), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C3X c3x) {
        A0L(this.A03.A0r, this.A03.A0s, c3x);
    }

    public final void A1G(C02144b c02144b) {
        int iA0E = c02144b.A0E();
        for (int i = iA0E - 1; i >= 0; i--) {
            View viewA0F = c02144b.A0F(i);
            AbstractC02244l abstractC02244lA0G = F9.A0G(viewA0F);
            if (!abstractC02244lA0G.A0h()) {
                abstractC02244lA0G.A0Z(false);
                if (abstractC02244lA0G.A0e()) {
                    this.A03.removeDetachedView(viewA0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(abstractC02244lA0G);
                }
                abstractC02244lA0G.A0Z(true);
                c02144b.A0V(viewA0F);
            }
        }
        c02144b.A0L();
        if (iA0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C02144b c02144b) {
        for (int iA0W = A0W() - 1; iA0W >= 0; iA0W--) {
            View v = A0t(iA0W);
            A0J(c02144b, iA0W, v);
        }
    }

    public final void A1I(C02144b c02144b) {
        for (int iA0W = A0W() - 1; iA0W >= 0; iA0W--) {
            if (!F9.A0G(A0t(iA0W)).A0h()) {
                A14(iA0W, c02144b);
            }
        }
    }

    public void A1J(C02144b c02144b, C02214i c02214i, int i, int i2) {
        this.A03.A1a(i, i2);
    }

    public void A1K(C02144b c02144b, C02214i c02214i, View view, C3X c3x) {
        int iA0p = A25() ? A0p(view) : 0;
        int iA0p2 = A24() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        c3x.A0Q(C3V.A00(iA0p, 1, iA0p2, 1, false, false));
    }

    public final void A1L(AbstractC02194g abstractC02194g) {
        AbstractC02194g abstractC02194g2 = this.A02;
        if (abstractC02194g2 != null && abstractC02194g != abstractC02194g2 && abstractC02194g2.A0F()) {
            this.A02.A09();
        }
        this.A02 = abstractC02194g;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(F9 f9) {
    }

    public final void A1N(F9 f9) {
        this.A07 = true;
    }

    public final void A1O(F9 f9) {
        A11(View.MeasureSpec.makeMeasureSpec(f9.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(f9.getHeight(), 1073741824));
    }

    public final void A1P(F9 f9) {
        if (f9 == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = f9;
            this.A01 = f9.A01;
            this.A0C = f9.getWidth();
            this.A0A = f9.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public void A1Q(F9 f9, int i, int i2) {
    }

    public void A1R(F9 f9, int i, int i2) {
    }

    public void A1S(F9 f9, int i, int i2, int i3) {
    }

    public void A1T(F9 f9, int i, int i2, Object obj) {
    }

    public final void A1U(F9 f9, C02144b c02144b) {
        this.A07 = false;
        A20(f9, c02144b);
    }

    public final void A1V(boolean z) {
        this.A06 = z;
    }

    public final boolean A1W() {
        int i = A0W();
        for (int i2 = 0; i2 < i; i2++) {
            ViewGroup.LayoutParams layoutParams = A0t(i2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1X() {
        F9 f9 = this.A03;
        return f9 != null && f9.A0B;
    }

    public final boolean A1Y() {
        return this.A0E;
    }

    public final boolean A1Z(int i, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1a(View view, int i, int i2, C4U c4u) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i, c4u.width) && A0O(view.getHeight(), i2, c4u.height)) ? false : true;
    }

    public final boolean A1b(View view, int i, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1c(C4U c4u) {
        return c4u != null;
    }

    public final boolean A1d(F9 f9, View view, Rect rect, boolean z) {
        return A1e(f9, view, rect, z, false);
    }

    public final boolean A1e(F9 f9, View view, Rect rect, boolean z, boolean z2) {
        int[] iArrA0U = A0U(view, rect);
        int i = iArrA0U[0];
        int i2 = iArrA0U[1];
        if ((z2 && !A0S(f9, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            f9.scrollBy(i, i2);
        } else {
            f9.A1e(i, i2);
        }
        return true;
    }

    public final boolean A1f(F9 f9, C02214i c02214i, View view, View view2) {
        return A0T(f9, view, view2);
    }

    public final boolean A1g(F9 f9, ArrayList<View> arrayList, int i, int i2) {
        return false;
    }

    public int A1h(int i, C02144b c02144b, C02214i c02214i) {
        return 0;
    }

    public int A1i(int i, C02144b c02144b, C02214i c02214i) {
        return 0;
    }

    public int A1j(C02214i c02214i) {
        return 0;
    }

    public int A1k(C02214i c02214i) {
        return 0;
    }

    public int A1l(C02214i c02214i) {
        return 0;
    }

    public int A1m(C02214i c02214i) {
        return 0;
    }

    public int A1n(C02214i c02214i) {
        return 0;
    }

    public int A1o(C02214i c02214i) {
        return 0;
    }

    public Parcelable A1p() {
        return null;
    }

    @Nullable
    public View A1q(int i) {
        int iA0W = A0W();
        for (int i2 = 0; i2 < iA0W; i2++) {
            View viewA0t = A0t(i2);
            AbstractC02244l abstractC02244lA0G = F9.A0G(viewA0t);
            if (abstractC02244lA0G != null && abstractC02244lA0G.A0I() == i && !abstractC02244lA0G.A0h() && (this.A03.A0s.A07() || !abstractC02244lA0G.A0c())) {
                return viewA0t;
            }
        }
        return null;
    }

    @Nullable
    public View A1r(View view, int i, C02144b c02144b, C02214i c02214i) {
        return null;
    }

    public void A1t(int i) {
    }

    public void A1u(int i, int i2, C02214i c02214i, C4R c4r) {
    }

    public void A1v(int i, C4R c4r) {
    }

    public void A1w(Parcelable parcelable) {
    }

    public void A1x(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1y(C02144b c02144b, C02214i c02214i) {
        Log.e(A07(129, 12, 19), A07(141, 67, 101));
    }

    public void A1z(C02214i c02214i) {
    }

    @CallSuper
    public void A20(F9 f9, C02144b c02144b) {
    }

    public void A21(F9 f9, C02214i c02214i, int i) {
        Log.e(A07(129, 12, 19), A07(208, 68, 14));
    }

    public void A22(String str) {
        F9 f9 = this.A03;
        if (f9 != null) {
            f9.A1p(str);
        }
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }
}
