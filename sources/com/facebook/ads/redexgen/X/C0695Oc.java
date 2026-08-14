package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0695Oc extends LinearLayout {
    public static String[] A03 = {"lF8IVPZcS3mZAefsIaNZ6E9xMmjOqdH7", "idkW2", "HbWJiF6R60B06srsOI5ot4Pv3KsUxfPN", "7f3O1w3Qg3dv0DYXPvEPDd2nNc", "nnNATfNTHr6hSEkqMWy2MP3i9vksRg0T", "pai30RxYeYeDatKriEp6xPPXjxDmZE6E", "MhBAxeK5XElhMNsb", "N4hTYih9SgQSzhMEA04rsaAJRIerHLwS"};
    public static final float A04 = Resources.getSystem().getDisplayMetrics().density;
    public static final int A05;
    public static final int A06;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;

    static {
        float f = A04;
        A06 = (int) (6.0f * f);
        A05 = (int) (f * 8.0f);
    }

    public C0695Oc(C0947Xy c0947Xy, C1K c1k, boolean z, int i, int i2, int i3) {
        super(c0947Xy);
        setOrientation(1);
        this.A02 = new TextView(c0947Xy);
        MS.A0X(this.A02, true, i);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A06, 1.0f);
        this.A01 = new TextView(c0947Xy);
        this.A00 = new TextView(c0947Xy);
        MS.A0X(this.A00, false, i2);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A06, 1.0f);
        addView(this.A02, new LinearLayout.LayoutParams(-1, -2));
        addView(this.A01, new LinearLayout.LayoutParams(-1, -2));
        this.A01.setVisibility(8);
        A00(c1k, z);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0695Oc(C0947Xy c0947Xy, C1K c1k, boolean z, boolean z2, boolean z3) {
        int i = z2 ? 18 : 22;
        int i2 = z2 ? 14 : 16;
        int i3 = A05;
        this(c0947Xy, c1k, z, i, i2, z3 ? i3 / 2 : i3);
    }

    public final void A00(C1K c1k, boolean z) {
        this.A02.setTextColor(c1k.A06(z));
        this.A01.setTextColor(c1k.A04(z));
        this.A00.setTextColor(c1k.A05(z));
    }

    public final void A01(String str, String str2, @Nullable String str3, boolean z, boolean z2) {
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z3) {
            str2 = "";
        }
        textView2.setText(str2);
        if (A03[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A03[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        int i = 3;
        if (!z3 || !z4) {
            TextView textView3 = this.A02;
            if (z) {
                i = 2;
            } else if (z2) {
                i = 4;
            }
            textView3.setMaxLines(i);
            return;
        }
        this.A02.setMaxLines(z ? 1 : 2);
        this.A00.setMaxLines(z ? 1 : z2 ? 3 : 2);
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i) {
        this.A02.setGravity(i);
        this.A00.setGravity(i);
    }

    public void setDescriptionVisibility(int i) {
        this.A00.setVisibility(i);
    }
}
