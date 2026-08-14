package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KO {
    public static KM A00(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (C0633Ls.A04(i, i2)) {
            return KM.A0H;
        }
        if (i2 > i) {
            return KM.A0J;
        }
        return KM.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, KK kk) {
        int iCeil;
        if (((int) (displayMetrics.widthPixels / displayMetrics.density)) >= kk.A03()) {
            iCeil = displayMetrics.widthPixels;
        } else {
            iCeil = (int) Math.ceil(kk.A03() * displayMetrics.density);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iCeil, (int) Math.ceil(kk.A02() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
