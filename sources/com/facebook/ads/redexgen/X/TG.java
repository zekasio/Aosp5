package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TG extends NN {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2D A03;
    public final C0947Xy A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, Ascii.SYN, Ascii.DC4, Ascii.FS, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (Lr.A00 * 8.0f);
        A07 = (int) (Lr.A00 * 10.0f);
        A06 = (int) (Lr.A00 * 44.0f);
    }

    public TG(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str) {
        super(c0947Xy, interfaceC0575Jh, str);
        this.A04 = c0947Xy;
        this.A03 = C2E.A00(this.A04.A00());
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i = A07;
        imageView.setPadding(i, i, i, i);
        this.A00.setColorFilter(-10459280);
        int i2 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        MS.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i3 = A08;
        linearLayout.setPadding(i3, i3, i3, i3);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0L() {
        this.A00.setImageBitmap(C0642Mb.A01(EnumC0641Ma.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC0673Ng(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        NR nr = new NR(this.A04);
        nr.setData(this.A03.A0H(), EnumC0641Ma.HIDE_AD);
        nr.setOnClickListener(new ViewOnClickListenerC0674Nh(this, nr));
        NR nr2 = new NR(this.A04);
        nr2.setData(this.A03.A0L(), EnumC0641Ma.REPORT_AD);
        nr2.setOnClickListener(new ViewOnClickListenerC0675Ni(this, nr2));
        NR nr3 = new NR(this.A04);
        nr3.setData(this.A03.A0M(), EnumC0641Ma.AD_CHOICES_ICON);
        nr3.setOnClickListener(new ViewOnClickListenerC0676Nj(this, nr3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        layoutParams.gravity = 17;
        LinearLayout menuLayout = new LinearLayout(getContext());
        menuLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        MS.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(menuLayout, layoutParams2);
        menuLayout.addView(nr, layoutParams);
        menuLayout.addView(nr2, layoutParams);
        menuLayout.addView(nr3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0M() {
        MS.A0I(this);
        MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0N(C2H c2h, C2F c2f) {
        String strA0H;
        EnumC0641Ma enumC0641Ma;
        int i;
        this.A00.setOnClickListener(null);
        if (c2f == C2F.A05) {
            strA0H = this.A03.A0F();
            enumC0641Ma = EnumC0641Ma.REPORT_AD;
            i = -552389;
        } else {
            strA0H = this.A03.A0H();
            enumC0641Ma = EnumC0641Ma.HIDE_AD;
            i = -13272859;
        }
        NM nmA0M = new NL(this.A04, this.A0B).A0I(strA0H).A0H(this.A03.A0D()).A0F(c2h.A04()).A0K(false).A0E(enumC0641Ma).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        MS.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(nmA0M, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0O(C2H c2h, C2F c2f) {
        C0672Nf c0672Nf = new C0672Nf(this.A04, c2h, this.A0B, c2f == C2F.A05 ? EnumC0641Ma.REPORT_AD : EnumC0641Ma.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(C0642Mb.A01(EnumC0641Ma.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC0677Nk(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        MS.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c0672Nf, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final boolean A0P() {
        return true;
    }
}
