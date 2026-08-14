package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OY extends LinearLayout {
    public static final int A06 = (int) (Lr.A00 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C0947Xy A04;
    public final OZ[] A05;

    public OY(C0947Xy c0947Xy, int i, int i2, int i3, int i4) {
        super(c0947Xy);
        this.A00 = A06;
        this.A04 = c0947Xy;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new OZ[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private OZ A00() {
        OZ oz = new OZ(this.A04, this.A01, this.A02);
        int i = this.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        oz.setLayoutParams(layoutParams);
        return oz;
    }

    private void A01() {
        int i = 0;
        while (true) {
            OZ[] ozArr = this.A05;
            if (i < ozArr.length) {
                ((LinearLayout.LayoutParams) ozArr[i].getLayoutParams()).leftMargin = i == 0 ? 0 : this.A00;
                i++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    private void A02(float f) {
        for (int i = 0; i < this.A05.length; i++) {
            float fMin = Math.min(1.0f, f - i);
            if (fMin < 0.0f) {
                fMin = 0.0f;
            }
            this.A05[i].setFillRatio(fMin);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
