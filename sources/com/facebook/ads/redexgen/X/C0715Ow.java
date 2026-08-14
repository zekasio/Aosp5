package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0715Ow {
    public static A3 A00(final C0702Oj c0702Oj, int i, final String str, final SB sb) {
        if (i == 1) {
            return new A3(c0702Oj, str, sb) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (Lr.A00 * 20.0f);
                public static final int A01 = (int) (Lr.A00 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.A3
                public final void A0j(C0947Xy c0947Xy) {
                    C0695Oc titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c0947Xy);
                    MS.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i2 = A01;
                    linearLayout.setPadding(i2, i2, i2, i2);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new A3(c0702Oj, str, sb) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (Lr.A00 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.A3, com.facebook.ads.redexgen.X.AbstractC0698Of
            public final boolean A0B() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.A3
            public final void A0j(C0947Xy c0947Xy) {
                C0695Oc titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(layoutParams);
                int i2 = A00;
                titleDescContainer.setPadding(i2, i2, i2, i2);
                MS.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams2);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
