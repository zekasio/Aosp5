package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0709Oq extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final T1 A02;
    public final C0702Oj A03;
    public static final int A06 = (int) (Lr.A00 * 36.0f);
    public static final int A07 = (int) (Lr.A00 * 36.0f);
    public static final int A04 = (int) (Lr.A00 * 23.0f);
    public static final int A05 = (int) (Lr.A00 * 3.0f);
    public static final int A08 = (int) (Lr.A00 * 4.0f);

    public C0709Oq(C0702Oj c0702Oj, String str, C1K c1k, OM om) {
        super(c0702Oj.A05());
        this.A03 = c0702Oj;
        this.A00 = c1k.A08(true);
        this.A01 = new RelativeLayout(c0702Oj.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(str);
        this.A02 = new T1(c0702Oj.A05(), c0702Oj.A04().A0T(), null, c0702Oj.A06(), c0702Oj.A09(), c0702Oj.A0B(), c0702Oj.A07());
        this.A02.setCta(c0702Oj.A04().A0O().A0F(), c0702Oj.A04().A0U(), new HashMap(), om);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(C0642Mb.A01(EnumC0641Ma.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A04;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(String str) {
        Button button = new Button(this.A03.A05());
        MS.A0K(button);
        int i = A07;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        MS.A0O(button, this.A00, A08);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A06);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A01.addView(button, layoutParams);
        A00(button);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}
