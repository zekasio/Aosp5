package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OO {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2L] */
    public static C2L A00(final C0702Oj c0702Oj, final UB ub, final String str, final AI ai) {
        final boolean z = true;
        return new AB(c0702Oj, ub, z, str, ai) { // from class: com.facebook.ads.redexgen.X.2L

            @Nullable
            public T1 A00;

            @Nullable
            public C0719Pa A01;
            public final InterfaceC0575Jh A02 = this.A0I.A05().A00().A08();
            public final UB A03;
            public final AI A04;
            public final String A05;
            public static final int A07 = (int) (Lr.A00 * (-4.0f));
            public static final int A06 = (int) (Lr.A00 * 6.0f);

            {
                this.A03 = ub;
                this.A05 = str;
                this.A04 = ai;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0808Sl
            public void setupNativeCtaExtension(C0719Pa c0719Pa) {
                this.A01 = c0719Pa;
                int iA0K = JR.A0K(this.A0I.A05());
                C1K c1kA01 = this.A03.A0z().A0N().A01();
                this.A00 = new T1(this.A0I.A05(), this.A03.A0z().A0T(), c1kA01, this.A02, O4.getDummyListener(), this.A04.A0c(), this.A03.A19());
                this.A00.setCta(c0719Pa.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0K == 1) {
                    layoutParams.addRule(12);
                    MS.A0P(this.A00, A06, 5, c1kA01.A09(false));
                    ((AB) this).A06.addView(this.A00, layoutParams);
                } else {
                    if (iA0K != 2) {
                        return;
                    }
                    layoutParams.addRule(3, ((AB) this).A06.getId());
                    layoutParams.setMargins(0, A07, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((AB) this).A06.bringToFront();
                }
            }
        };
    }

    public static AB A01(C0702Oj c0702Oj, String str, SB sb) {
        return new AB(c0702Oj, true, str, sb);
    }
}
