package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0654Mn extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2D A02;
    public final C0947Xy A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (Lr.A00 * 50.0f);
        A05 = (int) (Lr.A00 * 10.0f);
        A06 = (int) (Lr.A00 * 20.0f);
        A09 = (int) (Lr.A00 * 4.0f);
        A07 = (int) (Lr.A00 * 12.0f);
    }

    public C0654Mn(C0947Xy c0947Xy, int i) {
        super(c0947Xy);
        this.A03 = c0947Xy;
        this.A02 = C2E.A00(c0947Xy.A00());
        setOrientation(0);
        this.A00 = new ImageView(c0947Xy);
        this.A01 = new ImageView(c0947Xy);
        A04(i);
    }

    private void A04(int i) {
        EnumC0641Ma enumC0641Ma;
        A05(this.A00, EnumC0641Ma.AD_CHOICES_ICON);
        if (i == 2) {
            int i2 = A05;
            setPadding(i2, i2 / 3, i2, i2 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            int i3 = A05;
            textView.setPadding(0, i3 / 2, i3 / 2, i3 / 2);
            MS.A0X(textView, true, 13);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            addView(textView, layoutParams);
            int i4 = A07;
            LinearLayout.LayoutParams adChoicesIconParams = new LinearLayout.LayoutParams(i4, i4);
            adChoicesIconParams.gravity = 16;
            addView(this.A00, adChoicesIconParams);
            return;
        }
        int i5 = A05;
        setPadding(i5, i5, i5, i5);
        if (i == 1) {
            enumC0641Ma = EnumC0641Ma.AN_INFO_ICON;
        } else {
            enumC0641Ma = EnumC0641Ma.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC0641Ma);
        int i6 = A06;
        LinearLayout.LayoutParams infoButtonParams = new LinearLayout.LayoutParams(i6, i6);
        infoButtonParams.gravity = 17;
        addView(this.A01, infoButtonParams);
        int i7 = A06;
        LinearLayout.LayoutParams infoButtonParams2 = new LinearLayout.LayoutParams(i7, i7);
        infoButtonParams2.setMargins(A09, 0, 0, 0);
        infoButtonParams2.gravity = 17;
        addView(this.A00, infoButtonParams2);
    }

    public static void A05(ImageView imageView, EnumC0641Ma enumC0641Ma) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(C0642Mb.A01(enumC0641Ma));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1U c1u, String str, C0583Jp c0583Jp, InterfaceC0657Mq interfaceC0657Mq) {
        setOnClickListener(new ViewOnClickListenerC0653Mm(this, c0583Jp, interfaceC0657Mq, str, c1u));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i);
        MS.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}
