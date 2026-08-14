package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NM extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2D A02;
    public final C0947Xy A03;
    public final NP A04;
    public final boolean A05;
    public static final int A09 = (int) (Lr.A00 * 16.0f);
    public static final int A0A = (int) (Lr.A00 * 8.0f);
    public static final int A0D = (int) (Lr.A00 * 44.0f);
    public static final int A08 = (int) (Lr.A00 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (Lr.A00 * 75.0f);
    public static final int A0B = (int) (Lr.A00 * 25.0f);
    public static final int A0F = (int) (Lr.A00 * 45.0f);
    public static final int A0C = (int) (Lr.A00 * 15.0f);
    public static final int A06 = (int) (Lr.A00 * 16.0f);

    public NM(NL nl) {
        super(nl.A0C);
        this.A03 = nl.A0C;
        this.A02 = C2E.A00(this.A03.A00());
        this.A04 = nl.A02;
        this.A01 = nl.A0B ? A0E : A0F;
        this.A00 = nl.A0B ? A0B : A0C;
        this.A05 = nl.A07;
        setFocusable(true);
        View viewA01 = A01(nl);
        View viewA00 = A00(nl);
        View footerView = getFooterView();
        MS.A0K(viewA01);
        MS.A0K(viewA00);
        MS.A0K(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, viewA01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i = A09;
        layoutParams3.setMargins(i, 0, i, i);
        addView(viewA01, layoutParams);
        addView(viewA00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(nl.A08 ? 0 : 8);
    }

    public /* synthetic */ NM(NL nl, NJ nj) {
        this(nl);
    }

    private View A00(NL nl) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(C0642Mb.A01(nl.A01));
        imageView.setColorFilter(-1);
        int i2 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(nl.A00);
        MS.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i3 = A09;
        layoutParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(getContext());
        MS.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(nl.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i4 = A09;
        layoutParams2.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(getContext());
        MS.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(nl.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A09;
        layoutParams3.setMargins(i5, 0, i5, i5);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        if (nl.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(nl.A04)) {
                OW ow = new OW(this.A03);
                int i6 = A0F;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i6, i6);
                layoutParams4.setMargins(0, 0, A0A, 0);
                ow.setFullCircleCorners(true);
                T3 t3 = new T3(ow, this.A03);
                int i7 = A0F;
                t3.A05(i7, i7).A07(nl.A04);
                linearLayout2.addView(ow, layoutParams4);
            }
            NR nr = new NR(this.A03);
            nr.setData(nl.A03, EnumC0641Ma.CHECKMARK);
            nr.setSelected(true);
            LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout2.addView(nr, selectedOptionParams);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(NL nl) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (nl.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C0642Mb.A01(EnumC0641Ma.CROSS));
            imageView.setOnClickListener(new NJ(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C0642Mb.A01(EnumC0641Ma.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        MS.A0X(textView, false, 16);
        textView.setTextColor(-13272859);
        int i2 = A0A;
        textView.setPadding(i2, i2, i2, i2);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new NK(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
