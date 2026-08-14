package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PR extends LinearLayout {

    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C0947Xy A02;
    public final OW A03;
    public final C0695Oc A04;
    public static final int A07 = (int) (Lr.A00 * 16.0f);
    public static final int A08 = (int) (Lr.A00 * 16.0f);
    public static final int A06 = (int) (Lr.A00 * 8.0f);
    public static final int A05 = (int) (Lr.A00 * 72.0f);

    public PR(PP pp) {
        super(pp.A06);
        this.A02 = pp.A06;
        this.A03 = new OW(this.A02);
        this.A04 = new C0695Oc(this.A02, pp.A01, true, false, true);
        this.A01 = pp.A00;
        A03(pp);
    }

    public /* synthetic */ PR(PP pp, SL sl) {
        this(pp);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(PP pp) {
        if (!TextUtils.isEmpty(pp.A03)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i = A08;
            linearLayout.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            MS.A0X(textView, false, 16);
            textView.setText(pp.A03);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new T3(imageView, this.A02).A04().A07(pp.A02);
            int i2 = A07;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams3.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            MS.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(PP pp) {
        MS.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (pp.A04.A00() == C1G.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new T3(this.A03, this.A02).A04().A07(pp.A05.A01());
        this.A04.A01(pp.A04.A06(), pp.A05.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        addView(view, new LinearLayout.LayoutParams(i2, i2));
        addView(this.A04, layoutParams);
        A02(pp);
        MS.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(PQ pq) {
        A00();
        postDelayed(new SL(this, pq), this.A01);
    }
}
