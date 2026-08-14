package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TH extends NN {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2D A04;
    public final C0947Xy A05;

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (Lr.A00 * 4.0f);
        A08 = (int) (Lr.A00 * 10.0f);
        A07 = (int) (Lr.A00 * 44.0f);
    }

    public TH(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str) {
        super(c0947Xy, interfaceC0575Jh, str);
        this.A05 = c0947Xy;
        this.A04 = C2E.A00(c0947Xy.A00());
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i = A08;
        imageView.setPadding(i, i, i, i);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i2 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        MS.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0L() {
        this.A01.setImageBitmap(C0642Mb.A01(EnumC0641Ma.CROSS));
        this.A01.setOnClickListener(new NW(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        NR nr = new NR(this.A05);
        nr.setData(this.A04.A0H(), EnumC0641Ma.HIDE_AD);
        nr.setOnClickListener(new NX(this, nr));
        NR nr2 = new NR(this.A05);
        nr2.setData(this.A04.A0L(), EnumC0641Ma.REPORT_AD);
        nr2.setOnClickListener(new NY(this, nr2));
        NR nr3 = new NR(this.A05);
        nr3.setData(this.A04.A0M(), EnumC0641Ma.AD_CHOICES_ICON);
        nr3.setOnClickListener(new NZ(this, nr3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        MS.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(nr, layoutParams);
        this.A02.addView(nr2, layoutParams);
        this.A02.addView(nr3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0M() {
        MS.A0I(this);
        MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0N(C2H c2h, C2F c2f) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        MS.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        MS.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0O(C2H c2h, C2F c2f) {
        MS.A0T(this.A03);
        this.A01.setImageBitmap(C0642Mb.A01(EnumC0641Ma.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC0667Na(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        for (C2H c2h2 : c2h.A05()) {
            NR nr = new NR(this.A05);
            nr.setData(c2h2.A04(), null);
            nr.setOnClickListener(new ViewOnClickListenerC0668Nb(this, nr, c2h2));
            this.A02.addView(nr, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final boolean A0P() {
        return true;
    }
}
