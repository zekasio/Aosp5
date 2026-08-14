package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PZ extends LinearLayout {
    public static final int A04 = (int) (Lr.A00 * 32.0f);
    public static final int A05 = (int) (Lr.A00 * 8.0f);
    public TextView A00;
    public TextView A01;
    public OW A02;
    public final C0947Xy A03;

    public PZ(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A03 = c0947Xy;
        A00(c0947Xy);
    }

    private final void A00(C0947Xy c0947Xy) {
        setGravity(16);
        this.A02 = new OW(c0947Xy);
        this.A02.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(c0947Xy);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(c0947Xy);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        MS.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c0947Xy);
        MS.A0X(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C1U c1u) {
        T3 t3 = new T3(this.A02, this.A03);
        int i = A04;
        t3.A05(i, i);
        t3.A07(c1u.A01());
        this.A00.setText(c1u.A02());
        this.A01.setText(c1u.A03());
    }
}
