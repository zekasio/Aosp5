package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NA extends LinearLayout {
    public static final int A06 = (int) (Lr.A00 * 10.0f);
    public static final int A07 = (int) (Lr.A00 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final OP A05;

    public NA(C0947Xy c0947Xy, int i) {
        super(c0947Xy);
        this.A01 = false;
        this.A02 = new ImageView(c0947Xy);
        ImageView imageView = this.A02;
        int i2 = A06;
        imageView.setPadding(i2, i2, i2, i2);
        this.A05 = new OP(c0947Xy);
        this.A05.setProgress(0.0f);
        OP op = this.A05;
        int i3 = A06;
        op.setPadding(i3, i3, i3, i3);
        this.A04 = new TextView(c0947Xy);
        setOrientation(0);
        this.A03 = new LinearLayout(c0947Xy);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams actionIconParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        MS.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams);
        this.A03.addView(this.A05, layoutParams);
        addView(this.A03, actionIconParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.A04, layoutParams2);
    }

    private void A01() {
        int i;
        OP op = this.A05;
        if (this.A00 == 2) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        op.setVisibility(i);
        this.A02.setVisibility(this.A00 == 2 ? 8 : 0);
    }

    public final boolean A02() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i) {
        this.A05.A02(C2U.A01(i, 77), i);
        this.A02.setColorFilter(i);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A05.setProgressWithAnimation(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        EnumC0641Ma enumC0641Ma;
        this.A00 = i;
        A01();
        setVisibility(0);
        if (i == 0) {
            enumC0641Ma = EnumC0641Ma.CROSS;
        } else if (i == 1) {
            enumC0641Ma = EnumC0641Ma.SKIP_ARROW;
        } else if (i == 3) {
            enumC0641Ma = EnumC0641Ma.MINIMIZE_ARROW;
        } else if (i != 4) {
            enumC0641Ma = EnumC0641Ma.CROSS;
        } else {
            enumC0641Ma = EnumC0641Ma.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        }
        this.A02.setImageBitmap(C0642Mb.A01(enumC0641Ma));
        MS.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
