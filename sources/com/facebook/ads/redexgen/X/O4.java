package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O4 extends RelativeLayout {
    public static InterfaceC0657Mq A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public AbstractC1120bv A00;
    public C0947Xy A01;
    public C01340w A02;

    @Nullable
    public TC A03;

    @Nullable
    public OV A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, Ascii.SYN, 19, Ascii.EM, Ascii.ETB, 9, Ascii.DLE, -60, -14, 5, Ascii.CAN, Ascii.CR, Ascii.SUB, 9, -60, Ascii.SUB, Ascii.CR, 9, Ascii.ESC, -60, 5, 8, 9, Ascii.DC4, Ascii.CAN, 9, Ascii.SYN, -60, Ascii.CR, Ascii.ETB, Ascii.DC2, -53, Ascii.CAN, -60, 7, Ascii.SYN, 9, 5, Ascii.CAN, 9, 8, -60, Ascii.DC4, Ascii.SYN, 19, Ascii.DC4, 9, Ascii.SYN, Ascii.DLE, Ascii.GS, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (Lr.A00 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (Lr.A00 * 15.0f);
        A05 = new TB();
    }

    public O4(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A01 = c0947Xy;
        this.A02 = new C01340w(c0947Xy);
        MS.A0K(this.A02);
        this.A00 = new FA();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList<com.facebook.ads.redexgen.X.C0719Pa> A01(com.facebook.ads.redexgen.X.AnonymousClass18 r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L8:
            java.util.List r5 = r7.A0c()
            int r0 = r5.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3 = 0
        L16:
            int r0 = r5.size()
            if (r3 >= r0) goto L31
            java.lang.Object r2 = r5.get(r3)
            com.facebook.ads.redexgen.X.1B r2 = (com.facebook.ads.redexgen.X.C1B) r2
            int r1 = r5.size()
            com.facebook.ads.redexgen.X.Pa r0 = new com.facebook.ads.redexgen.X.Pa
            r0.<init>(r3, r1, r2)
            r4.add(r0)
            int r3 = r3 + 1
            goto L16
        L31:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.O4.A01(com.facebook.ads.redexgen.X.18):java.util.ArrayList");
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(UB ub, int i) {
        ArrayList<C0719Pa> arrayListA01 = A01(ub.A0z());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new TC(this.A01, arrayListA01, ub.A0z(), this.A01.A00().A08(), ub, A05, ub.A0z().A0U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i - A08, 16, 0);
        this.A03.A07();
        setupDotsLayout(ub, arrayListA01);
    }

    public final void A06(C0767Qw c0767Qw) {
        TC tc = this.A03;
        if (tc != null) {
            tc.A0G(c0767Qw);
        } else {
            this.A01.A06().A8y(A00(51, 7, 29), C03298z.A1u, new AnonymousClass90(A00(0, 51, 45)));
        }
        this.A02.A22(c0767Qw);
    }

    public static InterfaceC0657Mq getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TC tc;
        if (z && (tc = this.A03) != null) {
            tc.A0F((i3 - i) - A08, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        OV ov = this.A04;
        if (ov != null) {
            ov.A00(i);
        }
    }

    private void setupDotsLayout(UB ub, ArrayList<C0719Pa> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new TA(this));
        this.A04 = new OV(this.A01, ub.A0z().A0N().A01(), arrayList.size());
        MS.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
