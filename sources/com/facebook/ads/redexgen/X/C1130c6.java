package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1130c6 implements InterfaceC02043q {
    public static byte[] A01;
    public static String[] A02 = {"m0v39bkLL0n2S0xNgN89hz2dGOcTpwho", "Je1TSnUfgjz87J45b10M9zAxXIUpZahJ", "5NPz60Ycb2xlrnlJbjQuqitLPDDjbzHA", "GN4TkK3T6zCNiBjoupvxTPY", "uEyRXI1LEgEguUOEBvXDLSZ", "uM6injuc1j2LJ4wHPsuMaMxVec9yzmkB", "WB5Y9xOLXhFok7BjZ8qu5ygjzkxXvdjS", "QTx8NC78KyDJtqbkFzNokRxLjqTFyIiz"};
    public final /* synthetic */ F9 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-39, -9, 2, 2, -5, -6, -74, -9, 10, 10, -9, -7, -2, -74, 5, 4, -74, -9, -74, -7, -2, -1, 2, -6, -74, Ascii.CR, -2, -1, -7, -2, -74, -1, 9, -74, 4, 5, 10, -74, -6, -5, 10, -9, -7, -2, -5, -6, -48, -74, -75, -77, -66, -66, -73, -74, 114, -74, -73, -58, -77, -75, -70, 114, -63, -64, 114, -77, -64, 114, -77, -66, -60, -73, -77, -74, -53, 114, -74, -73, -58, -77, -75, -70, -73, -74, 114, -75, -70, -69, -66, -74, 114};
    }

    static {
        A01();
    }

    public C1130c6(F9 f9) {
        this.A00 = f9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void A3T(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G != null) {
            if (abstractC02244lA0G.A0e() || abstractC02244lA0G.A0h()) {
                abstractC02244lA0G.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 113) + abstractC02244lA0G + this.A00.A1I());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void A4m(int i) {
        AbstractC02244l abstractC02244lA0G;
        View viewA5z = A5z(i);
        if (viewA5z != null && (abstractC02244lA0G = F9.A0G(viewA5z)) != null) {
            if (!abstractC02244lA0G.A0e() || abstractC02244lA0G.A0h()) {
                abstractC02244lA0G.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 45) + abstractC02244lA0G + this.A00.A1I());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final View A5z(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final int A60() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final AbstractC02244l A63(View view) {
        return F9.A0G(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final int A8H(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void AAh(View view) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G != null) {
            abstractC02244lA0G.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void ABD(View view) {
        AbstractC02244l abstractC02244lA0G = F9.A0G(view);
        if (abstractC02244lA0G != null) {
            abstractC02244lA0G.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void ADu() {
        int i = A60();
        for (int i2 = 0; i2 < i; i2++) {
            View viewA5z = A5z(i2);
            this.A00.A1i(viewA5z);
            viewA5z.clearAnimation();
        }
        this.A00.removeAllViews();
        String[] strArr = A02;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void ADy(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1i(childAt);
            childAt.clearAnimation();
        }
        F9 f9 = this.A00;
        if (A02[2].charAt(25) == 'R') {
            throw new RuntimeException();
        }
        A02[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        f9.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02043q
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1h(view);
    }
}
