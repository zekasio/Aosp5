package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NR extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (Lr.A00 * 16.0f);
    public static final int A05 = (int) (Lr.A00 * 12.0f);
    public static final int A06 = (int) (Lr.A00 * 12.0f);
    public static final int A03 = (int) (Lr.A00 * 16.0f);

    public NR(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A00 = false;
        setOrientation(0);
        int i = A04;
        int i2 = A05;
        setPadding(i, i2, i, i2);
        this.A01 = new ImageView(getContext());
        int i3 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, layoutParams2);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        MS.A0S(this, gradientDrawable);
        MS.A0X(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, @Nullable EnumC0641Ma enumC0641Ma) {
        this.A02.setText(str);
        if (enumC0641Ma != null) {
            this.A01.setImageBitmap(C0642Mb.A01(enumC0641Ma));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}
