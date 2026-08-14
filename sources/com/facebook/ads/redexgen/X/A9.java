package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A9 extends AbstractC0819Sw implements N7 {
    public static byte[] A0D;
    public static String[] A0E = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};

    @Nullable
    public View A00;
    public View A01;
    public C0947Xy A02;

    @Nullable
    public AbstractC0656Mp A03;
    public C0735Pq A04;

    @Nullable
    public IT A05;
    public boolean A06;
    public final InterfaceC0657Mq A07;
    public final OT A08;
    public final OU A09;
    public final QK A0A;
    public final C0565Ix A0B;
    public final AtomicBoolean A0C;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A07();
    }

    public A9(C0702Oj c0702Oj) {
        super(c0702Oj, false);
        this.A0C = new AtomicBoolean(false);
        this.A06 = false;
        this.A02 = c0702Oj.A05();
        this.A03 = c0702Oj.A08();
        this.A01 = new View(this.A02);
        MS.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A04();
        this.A07 = c0702Oj.A09();
        C0696Od.A00(c0702Oj.A05(), this, getAdInfo().A0D().A07());
        this.A0A = A00(c0702Oj);
        getAdDetailsView().bringToFront();
        this.A0B = A01(c0702Oj);
        A0f();
        this.A04 = new C0735Pq(this.A02, c0702Oj.A06(), getAdDataBundle());
        this.A08 = new C0817Su(this);
        this.A09 = new OU(c0702Oj, getAdDataBundle(), this.A0A, this.A0B, getAdDetailsView(), this.A07, this.A08);
    }

    private QK A00(C0702Oj c0702Oj) {
        QK qk = (QK) c0702Oj.A02();
        int iA0e = A0e(c0702Oj.A08());
        ImageView imageView = (ImageView) c0702Oj.A03();
        imageView.setPadding(AbstractC0819Sw.A0D, AbstractC0819Sw.A0D, AbstractC0819Sw.A0D, AbstractC0819Sw.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0819Sw.A0E, AbstractC0819Sw.A0E);
        layoutParams.setMargins(0, iA0e, AbstractC0819Sw.A0C, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(qk, layoutParams2);
        qk.addView(imageView, layoutParams);
        return qk;
    }

    private C0565Ix A01(C0702Oj c0702Oj) {
        C0565Ix c0565IxA0A = c0702Oj.A0A();
        c0565IxA0A.A06(-1, AbstractC0819Sw.A09);
        c0565IxA0A.setPadding(AbstractC0819Sw.A0H, AbstractC0819Sw.A0H, AbstractC0819Sw.A0H, AbstractC0819Sw.A0H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC0819Sw.A0G);
        layoutParams.addRule(12);
        addView(c0565IxA0A, layoutParams);
        return c0565IxA0A;
    }

    private void A03() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0A.A0d(getAnimationPlugin());
        }
    }

    private void A04() {
        AbstractC0656Mp abstractC0656Mp = this.A03;
        if (abstractC0656Mp == null) {
            return;
        }
        this.A05 = new IT(abstractC0656Mp, HttpStatus.SC_BAD_REQUEST, -abstractC0656Mp.getToolbarHeight(), 0);
    }

    private void A05() {
        new C0583Jp(getAdDataBundle().A0U(), getAdEventManager()).A02(EnumC0582Jo.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0C.set(true);
        MS.A0T(this);
        MS.A0H(this.A0A);
        MS.A0Z(this.A0A, this.A0B, this.A09, this.A00);
        MS.A0L(this.A03);
        C0735Pq c0735Pq = this.A04;
        T1 ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0E[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC0734Pp, View> pairA03 = c0735Pq.A03(ctaButton);
        this.A00 = (View) pairA03.second;
        int i = C0703Ok.A00[((EnumC0734Pp) pairA03.first).ordinal()];
        if (i == 1) {
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
            screenshotParams.setMargins(0, A0e(this.A03), 0, 0);
            screenshotParams.addRule(2, getAdDetailsView().getId());
            addView(this.A00, screenshotParams);
            return;
        }
        if (i != 2) {
            return;
        }
        MS.A0Z(getAdDetailsView());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(AbstractC0819Sw.A0F, AbstractC0819Sw.A0F, AbstractC0819Sw.A0F, AbstractC0819Sw.A0F);
        addView(this.A00, layoutParams);
    }

    private void A06() {
        IT it = this.A05;
        if (it != null) {
            it.A3M(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3M(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A09(AnonymousClass88 anonymousClass88) {
        super.A09(anonymousClass88);
        A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0A(AnonymousClass84 anonymousClass84) {
        super.A0A(anonymousClass84);
        int duration = this.A0A.getDuration() - anonymousClass84.A00();
        if (getAnimationPlugin() != null) {
            int remainingVideoTimeInMillis = A0E[1].charAt(18);
            if (remainingVideoTimeInMillis != 51) {
                throw new RuntimeException();
            }
            A0E[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0W() {
        super.A0W();
        A03();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0819Sw, com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0b(C1B c1b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A02(0, 31, 118), false)) {
            A06();
        }
        if (bundle.getBoolean(A02(55, 18, 103), false)) {
            A05();
        }
        if (bundle.getBoolean(A02(31, 24, 116), false)) {
            OU ou = this.A09;
            if (A0E[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            ou.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final boolean A0c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0d(boolean r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 == 0) goto L33
            boolean r0 = r5.A06
            if (r0 != 0) goto L33
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0C
            boolean r3 = r0.get()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.A9.A0E
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L65
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.A9.A0E
            java.lang.String r1 = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "8CoNQoXVMdzgwU1krh95bRLsSKKH4"
            r0 = 0
            r2[r0] = r1
            if (r3 != 0) goto L33
            com.facebook.ads.redexgen.X.OU r0 = r5.A09
            r0.A07(r5)
            return r4
        L33:
            com.facebook.ads.redexgen.X.1B r0 = r5.getAdInfo()
            boolean r3 = r0.A0O()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.A9.A0E
            r0 = 5
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L65
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.A9.A0E
            java.lang.String r1 = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0C
            boolean r0 = r0.get()
            if (r0 != 0) goto L63
            com.facebook.ads.redexgen.X.QK r1 = r5.A0A
            com.facebook.ads.redexgen.X.Q1 r0 = com.facebook.ads.redexgen.X.Q1.A08
            r1.A0a(r0)
            return r4
        L63:
            r0 = 0
            return r0
        L65:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.A9.A0d(boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0819Sw
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A8o(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0819Sw, com.facebook.ads.redexgen.X.AbstractC0698Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
